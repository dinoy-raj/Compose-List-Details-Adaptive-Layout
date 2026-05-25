package com.dino.list.core

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.bounceEffectShape(
    scaleFactor: Float = 0.6f,
    initialShape: Dp = 100.dp,
    pressedShape: Dp = 10.dp,
    onClick: () -> Unit
) = composed {

    val haptic = LocalHapticFeedback.current
    var pressed by remember { mutableStateOf(false) }

    val radius by animateDpAsState(
        targetValue = if (pressed) pressedShape else initialShape,
        animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
        label = "shape-radius"
    )

    val scale by animateFloatAsState(
        targetValue = if (pressed) scaleFactor else 1f,
        animationSpec = spring(stiffness = Spring.StiffnessVeryLow),
        label = "shape-scale"
    )

    this
        .scale(scale)
        .clip(RoundedCornerShape(radius))
        .pointerInput(Unit) {
            while (true) {
                val down = awaitPointerEventScope { awaitFirstDown() }
                pressed = true

                val up = awaitPointerEventScope { waitForUpOrCancellation() }

                pressed = false

                if (up != null) {
                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                    onClick()
                }
            }
        }
}