package com.dino.list.core

import androidx.compose.material3.MaterialShapes
import androidx.compose.material3.toShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape

@Composable
fun getRandomShape(): Shape = listOf(
    MaterialShapes.Bun.toShape(),
    MaterialShapes.Arch.toShape(),
    MaterialShapes.Clover4Leaf.toShape(),
    MaterialShapes.Cookie4Sided.toShape(),
    MaterialShapes.Gem.toShape(),
    MaterialShapes.Puffy.toShape()
).random()