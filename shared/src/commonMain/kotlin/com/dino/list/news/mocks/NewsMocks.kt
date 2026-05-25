package com.dino.list.news.mocks

import com.dino.list.news.models.Article
import com.dino.list.news.models.Source

val topTechNewsToday = listOf(

    Article(
        id = "1",
        source = Source(
            id = "reuters",
            name = "Reuters"
        ),
        author = "Reuters Staff",
        title = "Google pushes deeper into AGI race with Gemini 3.5 and AI-first ecosystem",
        description = "Google unveiled major AI updates during Google I/O 2026, doubling down on Gemini and AI-powered search.",
        url = "https://www.reuters.com/technology/artificial-intelligence/googles-demis-hassabis-goes-offensive-2026-05-20/",
        urlToImage = "https://images.unsplash.com/photo-1573804633927-bfcbcd909acd?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-26T08:10:00Z",
        content = """
Google is aggressively expanding its artificial intelligence ecosystem following major announcements at Google I/O 2026. CEO Sundar Pichai and DeepMind chief Demis Hassabis showcased Gemini 3.5, improved coding assistants, AI-native search experiences, and new multimodal capabilities designed to compete directly with OpenAI and Anthropic.

The company also demonstrated AI integrations across Android, Workspace, and Search, turning traditional search experiences into conversational AI interfaces. Google believes the next phase of computing will revolve around proactive assistants capable of understanding user intent in real time.

Industry analysts see this as one of Google's most important strategic pivots in years. The company is leveraging its cloud infrastructure, TPU hardware advantage, and massive product ecosystem to maintain leadership in the rapidly intensifying AI race.
        """.trimIndent(),
        category = "technology",
        readTime = "6 min read",
        isBookmarked = false
    ),

    Article(
        id = "2",
        source = Source(
            id = "the-verge",
            name = "The Verge"
        ),
        author = "The Verge Staff",
        title = "Google I/O 2026 introduces AI-generated Android app development",
        description = "Developers can now generate full Android apps using natural language prompts.",
        url = "https://www.theverge.com/tech/933415/google-io-2026-biggest-announcements-ai-gemini",
        urlToImage = "https://images.unsplash.com/photo-1512941937669-90a1b58e7e9c?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-26T06:30:00Z",
        content = """
One of the standout announcements at Google I/O 2026 was the introduction of AI-assisted Android app generation tools. Developers can now describe app functionality using natural language and generate production-ready UI, navigation flows, and backend integrations automatically.

Google says the system is powered by Gemini Omni models trained specifically for developer workflows. The tooling integrates deeply with Android Studio and Compose, significantly reducing the time required to prototype and iterate on new mobile experiences.

The move reflects a broader industry trend where software development is becoming increasingly AI-driven. While experienced developers are still essential for architecture and product decisions, repetitive implementation work is rapidly being automated.
        """.trimIndent(),
        category = "technology",
        readTime = "5 min read",
        isBookmarked = false
    ),

    Article(
        id = "3",
        source = Source(
            id = "axios",
            name = "Axios"
        ),
        author = "Mike Allen",
        title = "Two hours changed the AI industry as OpenAI, Nvidia, and Anthropic made major moves",
        description = "A series of announcements highlighted the accelerating pace of AI innovation.",
        url = "https://www.axios.com/2026/05/21/ai-news-cycle-openai-anthropic-spacex",
        urlToImage = "https://images.unsplash.com/photo-1485827404703-89b55fcc595e?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T18:45:00Z",
        content = """
The artificial intelligence industry experienced a dramatic news cycle this week after several leading companies unveiled major developments within hours of each other. OpenAI revealed a reasoning model capable of solving a decades-old geometry problem, while Nvidia reported record-breaking AI infrastructure revenue.

Anthropic also expanded its compute partnership with SpaceX, committing billions of dollars toward future AI infrastructure. Analysts believe these announcements signal that the industry is entering a phase where AI competition is increasingly defined by infrastructure scale and access to computing power.

The rapid pace of announcements has intensified concerns around regulation, safety, and market concentration. Governments worldwide are now debating how to manage AI development without slowing innovation.
        """.trimIndent(),
        category = "ai",
        readTime = "7 min read",
        isBookmarked = false
    ),

    Article(
        id = "4",
        source = Source(
            id = "indian-express",
            name = "Indian Express"
        ),
        author = "Anil Sasi",
        title = "OpenAI reportedly exploring AI-first smartphone with custom operating system",
        description = "Reports suggest OpenAI could enter the hardware market with an AI-centric device.",
        url = "https://indianexpress.com/article/explained/explained-sci-tech/chatgpt-openai-smartphones-rival-iphones-monetisation-10659740/",
        urlToImage = "https://images.unsplash.com/photo-1511707171634-5f897ff02aa9?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T16:20:00Z",
        content = """
OpenAI is reportedly planning an AI-first smartphone that could fundamentally change how users interact with mobile devices. According to industry analysts, the company is exploring a device that replaces traditional apps with autonomous AI agents capable of performing tasks contextually.

The rumored device would reportedly feature a custom operating system deeply integrated with cloud and on-device AI models. Former Apple designer Jony Ive is also said to be collaborating with OpenAI on hardware concepts aimed at creating a more natural computing experience.

The move would place OpenAI in direct competition with Apple and Google in the consumer hardware market. Experts believe the future of mobile computing may revolve around intelligent assistants rather than app-centric interfaces.
        """.trimIndent(),
        category = "mobile",
        readTime = "6 min read",
        isBookmarked = false
    ),

    Article(
        id = "5",
        source = Source(
            id = "windows-central",
            name = "Windows Central"
        ),
        author = "Kevin Okemwa",
        title = "Former Microsoft executive claims company is losing momentum in AI",
        description = "Questions are emerging about Microsoft Copilot engagement and AI spending.",
        url = "https://www.windowscentral.com/artificial-intelligence/ex-microsoft-exec-says-the-company-blew-it-with-ai",
        urlToImage = "https://images.unsplash.com/photo-1633419461186-7d40a38105ec?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T14:00:00Z",
        content = """
A former Microsoft executive has publicly criticized the company's AI strategy, claiming Microsoft risks missing the broader AI opportunity despite its multibillion-dollar partnership with OpenAI. The criticism centers around low engagement with Microsoft Copilot and uncertainty about long-term adoption.

While Microsoft continues integrating AI across Windows, Office, and Azure, some analysts believe the company has struggled to define a compelling consumer-facing AI experience. Critics argue that embedding AI into existing products may not be enough to drive meaningful user behavior changes.

Microsoft executives responded by pointing to strong enterprise adoption and growing infrastructure investments. However, investors are increasingly scrutinizing the enormous costs associated with AI development and deployment.
        """.trimIndent(),
        category = "technology",
        readTime = "5 min read",
        isBookmarked = false
    ),

    Article(
        id = "6",
        source = Source(
            id = "android-central",
            name = "Android Central"
        ),
        author = "Brady Snyder",
        title = "AI becomes central to Android experiences in 2026",
        description = "Google's Gemini ecosystem is rapidly expanding across Android devices.",
        url = "https://www.androidcentral.com/apps-software/ai/ai-2025-report-card",
        urlToImage = "https://images.unsplash.com/photo-1598327105666-5b89351aff97?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T11:30:00Z",
        content = """
Artificial intelligence is becoming deeply integrated into the Android ecosystem as Google expands Gemini-powered experiences across phones, tablets, and wearables. Features such as multimodal assistants, contextual search, and AI-generated replies are now becoming standard across flagship devices.

Android experts believe the industry is moving away from standalone AI applications toward operating-system-level intelligence. Instead of launching separate tools, users increasingly expect AI to work invisibly in the background across messaging, navigation, productivity, and media consumption.

Despite the rapid progress, questions remain around privacy, battery efficiency, and the long-term sustainability of cloud-dependent AI features. Device manufacturers are now investing heavily in on-device inference capabilities to reduce latency and protect user data.
        """.trimIndent(),
        category = "android",
        readTime = "5 min read",
        isBookmarked = false
    ),

    Article(
        id = "7",
        source = Source(
            id = "business-standard",
            name = "Business Standard"
        ),
        author = "Business Standard Staff",
        title = "OpenAI ends Microsoft exclusivity and expands cloud partnerships",
        description = "OpenAI is broadening infrastructure relationships beyond Microsoft Azure.",
        url = "https://www.business-standard.com/technology/tech-news/openai-ends-microsoft-exclusivity-frees-path-for-amazon-google-deals-126042800471_1.html",
        urlToImage = "https://images.unsplash.com/photo-1451187580459-43490279c0fa?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T10:00:00Z",
        content = """
OpenAI is reportedly moving beyond its exclusive cloud relationship with Microsoft, opening the door for partnerships with Amazon Web Services and Google Cloud. The decision reflects the enormous infrastructure demands required to train and operate next-generation AI models.

Amazon CEO Andy Jassy confirmed that OpenAI models would soon become available directly through AWS platforms. Industry experts believe diversification is necessary as AI companies seek greater flexibility, cost optimization, and access to specialized hardware.

The development signals a broader shift in the AI ecosystem where infrastructure providers, chip makers, and AI labs are becoming increasingly interconnected. Analysts expect cloud competition around AI workloads to intensify significantly over the next two years.
        """.trimIndent(),
        category = "cloud",
        readTime = "4 min read",
        isBookmarked = false
    ),

    Article(
        id = "8",
        source = Source(
            id = "times-of-india",
            name = "Times of India"
        ),
        author = "TOI Tech Desk",
        title = "Android XR and Gemini dominate Google I/O 2026 announcements",
        description = "Google showcased Android XR, Gemini Omni, and AI-powered search upgrades.",
        url = "https://timesofindia.indiatimes.com/technology/tech-news/google-i/o-2026-android-17-updates-android-xr-gemini-intelligence-and-other-things-to-expect/articleshow/131198172.cms",
        urlToImage = "https://images.unsplash.com/photo-1527443154391-507e9dc6c5cc?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T09:15:00Z",
        content = """
Google unveiled a series of ambitious AI and extended reality initiatives during Google I/O 2026. Among the most notable announcements were Android XR smart glasses, Gemini Omni multimodal AI systems, and deeper AI integration into Search and Chrome.

The company demonstrated how AI assistants could interact visually with the environment in real time using camera-equipped wearables. Google also emphasized its goal of creating a seamless AI layer across all devices and services.

Developers attending the conference highlighted the growing importance of multimodal computing, where voice, vision, and contextual awareness work together. Many analysts believe XR and AI convergence could define the next major computing platform after smartphones.
        """.trimIndent(),
        category = "xr",
        readTime = "6 min read",
        isBookmarked = false
    ),

    Article(
        id = "9",
        source = Source(
            id = "wikipedia",
            name = "Wikipedia"
        ),
        author = "Wikipedia Contributors",
        title = "Apple reportedly partners with Google Gemini for next-generation Siri",
        description = "Apple is expected to integrate Gemini models into future Siri experiences.",
        url = "https://en.wikipedia.org/wiki/Apple_Inc.",
        urlToImage = "https://images.unsplash.com/photo-1512499617640-c74ae3a79d37?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T07:40:00Z",
        content = """
Reports indicate Apple may rely on Google's Gemini models to power future AI experiences inside Siri and other Apple services. The move highlights increasing pressure on Apple to accelerate its AI roadmap amid growing competition from Google, Microsoft, and OpenAI.

Apple has traditionally focused on privacy-centric and tightly controlled ecosystems, but the rapid pace of generative AI development appears to be forcing new strategic partnerships. Analysts believe integrating Gemini could help Apple close the feature gap more quickly.

The partnership would mark a surprising shift in the relationship between two long-time competitors. It also demonstrates how even the world's largest tech companies are increasingly collaborating around foundational AI infrastructure.
        """.trimIndent(),
        category = "apple",
        readTime = "5 min read",
        isBookmarked = false
    ),

    Article(
        id = "10",
        source = Source(
            id = "india-ai",
            name = "India AI Summit"
        ),
        author = "Summit Staff",
        title = "India expands sovereign AI ambitions with massive GPU investments",
        description = "India announced major investments in AI infrastructure and compute capacity.",
        url = "https://en.wikipedia.org/wiki/India_AI_Impact_Summit_2026",
        urlToImage = "https://images.unsplash.com/photo-1516321318423-f06f85e504b3?q=80&w=1200&auto=format&fit=crop",
        publishedAt = "2026-05-25T06:00:00Z",
        content = """
India is accelerating its push toward sovereign artificial intelligence infrastructure through large-scale investments in GPUs, research funding, and domestic AI ecosystems. Officials announced plans to significantly expand compute availability through the IndiaAI initiative.

The strategy aims to reduce dependence on foreign AI infrastructure while enabling startups, researchers, and enterprises to build locally optimized AI systems. Microsoft and other global companies also announced investments tied to AI development in India.

Industry leaders believe India could become one of the most important AI growth markets over the next decade. The country's software talent pool, startup ecosystem, and growing digital infrastructure position it as a major global technology player.
        """.trimIndent(),
        category = "india-tech",
        readTime = "5 min read",
        isBookmarked = false
    )
)