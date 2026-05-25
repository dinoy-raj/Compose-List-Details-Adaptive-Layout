# ListDetailsPreview - Adaptive UI with Compose Multiplatform

A modern **Kotlin Multiplatform** sample showcasing an adaptive list–detail UI pattern built with **Compose Multiplatform**. This project demonstrates how to build expressive, responsive, and fluid user interfaces that work seamlessly across Android, iOS, Desktop, and Web.

---

## 📖 Canonical Layouts
> **Canonical layouts** are proven, versatile layouts that provide an optimal user experience across different screen sizes.

### List Detail Pattern
- **Purpose**: Displays a list of items that have descriptive, explanatory, or extra information.
- **Pane Management**: Uses two panes that may appear together (expanded) or across separate screens (compact).

| **Breakpoint (dp)** | **Visible Panes** |
| --- | --- |
| Compact (0-599) | 1 pane |
| Medium (600-839) | 1 (recommended) or 2 panes |
| Expanded (840+) | 2 panes |
| Large (1200-1599) | 2 panes |
| Extra-large (1600+) | 2 panes |

### Behavioral Differences
- **Back Button**: Appears in the detail view **only** for single-pane (compact) layouts.
- **Selected State**: Highlighted in the list view **only** for two-pane (expanded) layouts.

---

## 🛠 Technical Side

### Adaptive Libraries
We utilize the Material 3 Adaptive suite, which is split into three layers:
1. **`adaptive`**: Low-level building blocks like `WindowSizeClass`, `HingeInfo`, and `Posture`.
2. **`adaptive-layout`**: Adaptive layouts such as `ListDetailPaneScaffold` and `SupportingPaneScaffold`.
3. **`adaptive-navigation`**: Tools for navigating within and between panes, such as `ThreePaneScaffoldNavigator`.

```kotlin
// commonMain dependencies
implementation("org.jetbrains.compose.material3.adaptive:adaptive:1.3.0-beta01")
implementation("org.jetbrains.compose.material3.adaptive:adaptive-layout:1.3.0-beta01")
implementation("org.jetbrains.compose.material3.adaptive:adaptive-navigation:1.3.0-beta01")
```

### Navigating with ListDetailPaneScaffold
The project uses the `rememberListDetailPaneScaffoldNavigator` to handle the logic of pane show/hide and navigation transitions automatically.

```kotlin
@Composable
fun NewsScreen() {
    val navigator = rememberListDetailPaneScaffoldNavigator<String>()
    val scope = rememberCoroutineScope()

    ListDetailPaneScaffold(
        directive = navigator.scaffoldDirective,
        value = navigator.scaffoldValue,
        listPane = {
            AnimatedPane {
                ListingScreen(
                    selectedId = navigator.currentDestination?.contentKey ?: "",
                    // Adapt search bar based on pane state
                    isDualPane = navigator.scaffoldValue[ListDetailPaneScaffoldRole.Detail] == PaneAdaptedValue.Expanded,
                    onClick = { id ->
                        scope.launch { navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, id) }
                    }
                )
            }
        },
        detailPane = {
            AnimatedPane {
                val articleId = navigator.currentDestination?.contentKey
                DetailsScreen(
                    articleId = articleId,
                    // Show back button only if list is hidden
                    showTopBar = navigator.scaffoldValue[ListDetailPaneScaffoldRole.List] == PaneAdaptedValue.Hidden,
                    onBack = {
                        scope.launch { navigator.navigateBack() }
                    }
                )
            }
        }
    )
}
```

---

## ✨ Adaptive Components

### 1. Adaptive Search Bar
Following the [Material 3 Search Specs](https://m3.material.io/components/search/specs), the app switches its search behavior:
- **Compact/Single Pane**: Uses a standard `SearchBar` that expands to fill the screen for a focused experience.
- **Expanded/Two Pane**: Uses a `DockedSearchBar` within the list pane, appearing as a floating menu to preserve the context of the visible details pane.

### 2. Conditional TopAppBar
In the `DetailsScreen`, the `TopAppBar` is adaptive:
- It provides a **Back Button** and **Share Action** on mobile devices where the detail view is a separate screen.
- It is hidden on tablets/desktops where the list is visible on the left, ensuring a clean and integrated "Side-by-Side" look.

---

## 📁 Project Structure

- **`:shared`**: 95% of the codebase.
    - `commonMain`: Shared UI logic, news models, and the adaptive scaffold.
    - `composeResources`: Shared assets including the **Poppins** font family.
- **`:androidApp`**: Android-specific entry point and configuration.
- **`:iosApp`**: SwiftUI wrapper and Xcode project for iOS.
- **`:desktopApp`**: JVM target for Windows, macOS, and Linux.
- **`:webApp`**: Kotlin/Wasm and Kotlin/JS target for browsers.

---

## 📝 Guide & Conclusions

### Key Takeaways
- **Hoisting State**: In UDF (Unidirectional Data Flow), always hoist selection state. The `navigator.currentDestination?.contentKey` acts as the source of truth for the selected item.
- **Shared Element Transitions**: Even in adaptive layouts, shared element transitions can be implemented using `SharedTransitionLayout` wrapped around the scaffold, passing the scope to the panes.
- **Parcelize**: Use the `kotlin-parcelize` plugin for classes that need to be saved/restored in the navigator state across configuration changes (like screen rotation).

### Limitations
- **KMP Support**: While `ListDetailPaneScaffold` is fully supported in Compose Multiplatform, high-level wrappers like `NavigableListDetailPaneScaffold` (which handles predictive back out-of-the-box) are currently specific to the Jetpack (Android) library. This project implements equivalent navigation using the base `ListDetailPaneScaffold`.

---

## 🚀 Getting Started

### Prerequisites
- Android Studio Ladybug or newer.
- JDK 17+.

### Run Commands
- **Android**: `./gradlew :androidApp:installDebug`
- **Desktop**: `./gradlew :desktopApp:run`
- **Web**: `./gradlew :webApp:wasmJsBrowserDevelopmentRun`

---
Built with ❤️ using **Compose Multiplatform**.
