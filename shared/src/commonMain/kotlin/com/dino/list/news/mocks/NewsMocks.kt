package com.dino.list.news.mocks

import com.dino.list.news.models.Article
import com.dino.list.news.models.Source

val topAndroidDevBlogs = listOf(

    Article(
        id = "1",
        source = Source(id = "medium", name = "Medium"),
        author = "Android Poet",
        title = "Compose Guard: Real-Time Best Practices for Jetpack Compose",
        description = "A powerful IntelliJ plugin that catches Compose mistakes as you type.",
        url = "https://androidpoet.medium.com/compose-guard-real-time-best-practices-for-jetpack-compose-602175550d16",
        urlToImage = "https://images.unsplash.com/photo-1517694712202-14dd9538aa97?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-24T12:00:00Z",
        content = """
Writing clean, performant Jetpack Compose code is harder than it looks. The declarative paradigm brings its own set of conventions, and breaking them often leads to subtle bugs or performance issues that only surface later. That’s where Compose Guard comes in — a real-time inspector that catches common Compose mistakes as you type.

Every Compose developer has been there. You write what seems like perfectly reasonable code, ship it, and then discover during code review (or worse, in production) that you forgot to wrap mutableStateOf in remember, or you accidentally reused a modifier across multiple children. The official Compose API guidelines exist, but they’re lengthy and easy to forget.

ComposeGuard integrates directly into IntelliJ IDEA and Android Studio. As you write Compose code, it analyzes your composables in real-time and provides visual feedback through inline highlighting, gutter icons, and hover tooltips. When it spots a violation, you can press Alt+Enter and apply an automatic fix.

The plugin currently enforces 29 rules across six categories: naming conventions, modifier handling, state management, parameter ordering, composable structure, and stricter optional rules. Not every rule fits every codebase. ComposeGuard lets you disable rules globally through settings, or suppress them locally with annotations.

The value of ComposeGuard isn’t just catching mistakes — it’s building muscle memory. After a few weeks of seeing inline warnings for parameter ordering or missing modifiers, these patterns become second nature. The plugin essentially embeds the Compose API guidelines directly into your development workflow.
        """.trimIndent(),
        category = "android",
        readTime = "7 min read",
        isBookmarked = false
    ),

    Article(
        id = "2",
        source = Source(id = "medium", name = "Medium"),
        author = "Anil Kumar",
        title = "Jetpack Compose + Kotlin Tips Every Android Developer Should Know",
        description = "Practical tips for writing clean, performant, and scalable Compose code.",
        url = "https://medium.com/@anilkumar2681/jetpack-compose-kotlin-tips-every-android-developer-should-know-5520fe14eb80",
        urlToImage = "https://images.unsplash.com/photo-1598327105666-5b89351aff97?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-23T15:30:00Z",
        content = """
Jetpack Compose has transformed Android UI development, but writing clean and performant code requires deep understanding of its principles. Many developers use remember everywhere and later wonder why data is lost on screen rotation.

Remember vs rememberSaveable – Know the Difference. Use remember for UI-only state and rememberSaveable for configuration changes like screen rotation. If losing state on rotation is a bug — remember is the reason.

State Hoisting = Clean & Testable UI. Composable functions should be stateless whenever possible. Lifting state up to the parent makes your UI components reusable and much easier to test.

Avoid Unnecessary Recompositions. Use stable data classes, derivedStateOf, and proper key parameters in LazyColumn. These small changes can dramatically improve scroll performance and overall app responsiveness.

Always provide Modifier parameters to public composables. This enables callers to customize layout behavior and follows official Compose guidelines for better reusability across your app.
        """.trimIndent(),
        category = "android",
        readTime = "7 min read",
        isBookmarked = false
    ),

    Article(
        id = "3",
        source = Source(id = "medium", name = "Medium"),
        author = "Anand Gaur",
        title = "Jetpack Compose Roadmap for Android Developers",
        description = "Complete learning path from beginner to advanced Compose mastery.",
        url = "https://medium.com/@anandgaur2207/jetpack-compose-roadmap-for-android-developers-7c4ebbf6638f",
        urlToImage = "https://images.unsplash.com/photo-1512941937669-90a1b58e7e9c?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T08:10:00Z",
        content = """
Jetpack Compose is Google’s modern UI toolkit for building native Android apps using a declarative approach. With Compose, you can write UI in pure Kotlin, handle state-driven UI updates effortlessly, and build modern UIs faster with less boilerplate.

This roadmap will guide you from absolute beginner to advanced-level in Jetpack Compose — with practical milestones and learning steps. It simplifies and modernizes UI development for Android.

Stage 1: Basics & Fundamentals. Start with introduction to Jetpack Compose and why it was introduced. Learn Compose vs XML key differences, setting up Compose in Android Studio, @Composable annotation, and @Preview for design-time preview.

Progress to theming with Material 3, navigation using Navigation Compose, animations, and state management. Then tackle performance optimization, custom layouts, and integration with existing View-based code.

Advanced topics include multi-module architecture, testing strategies with Compose Testing APIs, and Kotlin Multiplatform with Compose. Consistent practice and code review help internalize best practices faster than theoretical study alone.
        """.trimIndent(),
        category = "android",
        readTime = "9 min read",
        isBookmarked = false
    ),

    Article(
        id = "4",
        source = Source(id = "medium", name = "Medium"),
        author = "Jaykishan Sewak",
        title = "Best Architecture for Jetpack Compose in 2025: MVVM + Clean Architecture",
        description = "Building scalable apps using modern architecture patterns with Compose.",
        url = "https://medium.com/@jecky999/best-architecture-for-jetpack-compose-in-2025-mvvm-clean-architecture-guide-f3a3d903514b",
        urlToImage = "https://images.unsplash.com/photo-1485827404703-89b55fcc595e?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-22T09:45:00Z",
        content = """
The combination of Jetpack Compose, MVVM, and Clean Architecture leads to clean, testable, and scalable Android apps. It aligns perfectly with modern development needs in 2025.

Clean Architecture solves the problem of bloated ViewModels and business logic leaking into UI by creating clear boundaries between layers. Each part of your codebase knows exactly what it should and shouldn’t do.

The three core layers include data, domain, and presentation. In the presentation layer, MVVM handles UI state while Compose renders it declaratively.

This architecture improves code readability, scalability, and testability. Teams adopting this pattern report faster feature development and easier maintenance of large codebases.

Real-world projects benefit significantly from combining these patterns, especially when scaling to support multiple form factors like phones, tablets, and foldables.
        """.trimIndent(),
        category = "android",
        readTime = "6 min read",
        isBookmarked = false
    ),

    Article(
        id = "5",
        source = Source(id = "medium", name = "Medium"),
        author = "Gaurav Kumar",
        title = "10 Jetpack Compose Best Practices for Building Complex Android UIs",
        description = "Real-world examples and techniques for mastering complex Compose interfaces.",
        url = "https://medium.com/towardsdev/10-jetpack-compose-best-practices-for-building-complex-android-uis-with-real-world-examples-4cad53236cc3",
        urlToImage = "https://images.unsplash.com/photo-1573804633927-bfcbcd909acd?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-21T14:20:00Z",
        content = """
Building complex UIs in Jetpack Compose requires discipline and adherence to proven patterns. Using stateless composables makes your code more reusable and easier to test across different scenarios.

Break down large screens into smaller, focused composables. This improves readability and allows better control over recomposition boundaries, preventing unnecessary UI updates.

Always be aware of stability. Mark your data classes as @Immutable or @Stable when appropriate to help the Compose compiler optimize effectively and reduce recompositions.

Use derivedStateOf for expensive calculations that depend on other state. This prevents unnecessary recompositions when parent state changes without affecting the derived value.

Proper key usage in Lazy lists and careful management of side effects using LaunchedEffect are critical for performance in production apps with dynamic content.
        """.trimIndent(),
        category = "android",
        readTime = "7 min read",
        isBookmarked = false
    ),

    Article(
        id = "6",
        source = Source(id = "medium", name = "Medium"),
        author = "Manish Rana",
        title = "State Management in Jetpack Compose: Best Practices",
        description = "Mastering state handling for scalable and performant Android apps.",
        url = "https://medium.com/@manishrana366/state-management-in-jetpack-compose-best-practices-ff04e09451af",
        urlToImage = "https://images.unsplash.com/photo-1598327105666-5b89351aff97?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T10:00:00Z",
        content = """
Jetpack Compose simplifies UI development in Android by promoting a declarative approach. However, effective state management is critical to building scalable and maintainable apps.

This article outlines best practices for managing state in Compose, covering Unidirectional Data Flow (UDF), remember, derivedStateOf, performance optimizations, and edge-case considerations.

Keep state as close to usage as possible. Don’t hoist state higher than necessary. If only one composable needs the state, keep it there to minimize recomposition scope.

Use data classes for complex state instead of multiple mutableStateOf calls. This groups related state and improves code organization significantly.

Avoid recomposition traps by using remember and derivedStateOf appropriately. Apply Unidirectional Data Flow to control state and events for predictable behavior.
        """.trimIndent(),
        category = "android",
        readTime = "6 min read",
        isBookmarked = false
    ),

    Article(
        id = "7",
        source = Source(id = "medium", name = "Medium"),
        author = "Jayant Kumar",
        title = "3 Years with Jetpack Compose: Here's What I'd Tell My Past Self",
        description = "Lessons learned from production experience with Compose over three years.",
        url = "https://nameisjayant.medium.com/3-years-with-jetpack-compose-heres-what-i-d-tell-my-past-self-e1acbb2c6651",
        urlToImage = "https://images.unsplash.com/photo-1517694712202-14dd9538aa97?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-24T11:30:00Z",
        content = """
After three years of working with Jetpack Compose in production, several key lessons stand out. Early adoption required patience but paid off significantly in terms of development speed.

Composition locals and custom modifiers became powerful tools once understood properly. They help reduce boilerplate while maintaining clean architecture and separation of concerns.

Performance tuning through smart recomposition control was one of the biggest challenges. Learning to think in terms of stability transformed app responsiveness and user experience.

Migration strategies from the View system to Compose should be incremental. Full rewrites are risky, but partial migrations can deliver value quickly to users.

The developer experience continues to improve with each Android Studio release, making Compose development increasingly enjoyable and productive for large teams.
        """.trimIndent(),
        category = "android",
        readTime = "6 min read",
        isBookmarked = false
    ),

    Article(
        id = "8",
        source = Source(id = "medium", name = "Medium"),
        author = "Sakhawat Hossain",
        title = "I Made My Jetpack Compose Home Screen 3× Faster",
        description = "Practical optimization techniques that delivered massive performance gains.",
        url = "https://shakilbd.medium.com/i-made-my-jetpack-compose-home-screen-3-faster-heres-exactly-what-i-did-175e86f12bb5",
        urlToImage = "https://images.unsplash.com/photo-1633419461186-7d40a38105ec?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-23T16:45:00Z",
        content = """
Optimizing Jetpack Compose screens requires systematic measurement and targeted improvements. One developer achieved 3x faster rendering through careful refactoring and profiling.

Key techniques included reducing recomposition scope, using stable parameters, and implementing proper key usage in lazy lists for better diffing.

Layout profiling tools in Android Studio helped identify bottlenecks. Visualizing recomposition counts guided optimization efforts effectively throughout the process.

Memory allocation patterns were analyzed and improved by minimizing object creation during composition phases, leading to smoother scrolling.

The results demonstrate that with proper techniques, Compose can deliver buttery smooth performance even in complex, data-heavy UIs.
        """.trimIndent(),
        category = "android",
        readTime = "5 min read",
        isBookmarked = false
    ),

    Article(
        id = "9",
        source = Source(id = "medium", name = "Medium"),
        author = "Anil Kumar",
        title = "Clean Architecture in Android with Jetpack Compose: The 2025 Practical Guide",
        description = "Building scalable apps using modern architecture patterns with Compose.",
        url = "https://medium.com/@anilkumar2681/clean-architecture-in-android-with-jetpack-compose-the-2025-practical-guide-c7357bce9136",
        urlToImage = "https://images.unsplash.com/photo-1485827404703-89b55fcc595e?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-22T13:20:00Z",
        content = """
Clean Architecture principles remain highly relevant in the Compose era. Separating concerns across layers ensures testability and maintainability as apps grow in complexity.

Use cases should remain pure and independent of UI frameworks. This allows easy sharing of business logic via Kotlin Multiplatform in the future.

Hilt for dependency injection combined with ViewModels and Compose state handling creates a robust architecture foundation that scales well.

Repository pattern with proper data source abstraction handles offline scenarios elegantly using Room and remote data sources.

This combination of Clean Architecture and Jetpack Compose represents the current state-of-the-art for professional Android development in 2025 and beyond.
        """.trimIndent(),
        category = "android",
        readTime = "7 min read",
        isBookmarked = false
    ),

    Article(
        id = "10",
        source = Source(id = "medium", name = "Medium"),
        author = "Halil Özel",
        title = "Jetpack Compose Basics: A Beginner's Guide",
        description = "Essential concepts for developers new to declarative UI on Android.",
        url = "https://halilozel1903.medium.com/jetpack-compose-basics-a-beginners-guide-c5711cc346c0",
        urlToImage = "https://images.unsplash.com/photo-1512941937669-90a1b58e7e9c?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-19T18:00:00Z",
        content = """
Jetpack Compose is Android's modern toolkit for building native UIs using Kotlin. It eliminates much of the traditional XML and View binding boilerplate that developers used to deal with.

Composables are the fundamental building blocks. They are regular Kotlin functions annotated with @Composable that describe your UI in a declarative way.

State management drives UI updates. Whenever state changes, Compose intelligently recomposes only the affected parts of the UI tree for efficiency.

Modifiers allow you to customize layout, appearance, and behavior of composables in a flexible and chainable way, similar to CSS but in code.

Understanding these basics provides a strong foundation for building more complex and performant applications with Compose as you advance in your Android journey.
        """.trimIndent(),
        category = "android",
        readTime = "5 min read",
        isBookmarked = false
    )
)