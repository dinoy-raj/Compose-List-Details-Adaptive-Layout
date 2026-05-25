package com.dino.list.news.ui.screens

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.AnimatedPane
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.layout.PaneAdaptedValue
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.dino.list.news.mocks.topAndroidDevBlogs
import com.dino.list.news.ui.screens.details.DetailsScreen
import com.dino.list.news.ui.screens.listing.ListingScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalSharedTransitionApi::class)
val LocalSharedTransitionScope = compositionLocalOf<SharedTransitionScope?> { null }
val LocalNavAnimatedVisibilityScope = compositionLocalOf<AnimatedVisibilityScope?> { null }

@OptIn(ExperimentalMaterial3AdaptiveApi::class, ExperimentalSharedTransitionApi::class)
@Composable
fun NewsScreen(modifier: Modifier = Modifier)
{
    val navigator = rememberListDetailPaneScaffoldNavigator<String>()
    val scope = rememberCoroutineScope()

    SharedTransitionLayout {
        CompositionLocalProvider(LocalSharedTransitionScope provides this) {
            ListDetailPaneScaffold(
                directive = navigator.scaffoldDirective,
                value = navigator.scaffoldValue,
                listPane = {
                    AnimatedPane {
                        CompositionLocalProvider(LocalNavAnimatedVisibilityScope provides this) {
                            ListingScreen(
                                selectedId = navigator.currentDestination?.contentKey ?: "",
                                isDualPane = navigator.scaffoldValue[ListDetailPaneScaffoldRole.Detail] == PaneAdaptedValue.Expanded,
                                onClick = { id ->
                                    scope.launch {
                                        navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, id)
                                    }
                                }
                            )
                        }
                    }
                },
                detailPane = {
                    AnimatedPane {
                        CompositionLocalProvider(LocalNavAnimatedVisibilityScope provides this) {
                            val articleId = navigator.currentDestination?.contentKey
                            val article = topAndroidDevBlogs.find { it.id == articleId }

                            if (article != null) {
                                DetailsScreen(
                                    article = article,
                                    showTopBar = navigator.scaffoldValue[ListDetailPaneScaffoldRole.List] == PaneAdaptedValue.Hidden,
                                    onBack = {
                                        if (navigator.canNavigateBack()) {
                                            scope.launch {
                                                navigator.navigateBack()
                                            }
                                        }
                                    }
                                )
                            }
                        }
                    }
                },
                modifier = modifier,
            )
        }
    }
}
