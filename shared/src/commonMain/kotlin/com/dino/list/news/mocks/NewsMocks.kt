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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

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
The goal of Search has always been simple: to help you ask anything on your mind — from quick facts to the deep, complex or hyper-specific questions that can be hard to articulate.
To make this possible, we’ve continued to reimagine what Search can do with AI. The momentum has been incredible: Just one year after its debut, AI Mode has surpassed one billion monthly users, with queries more than doubling every quarter since launch. As people have realized just how much more Search can do for them, they’re searching more than ever before — so much so that last quarter, we saw queries reach an all-time high.
Today at I/O, we shared the next step in our journey to bring together the best of a search engine with the best of AI. Here's a look at what we announced.


Starting today, we’re upgrading Search with Gemini 3.5 Flash — our newest Flash model delivering sustained frontier performance for agents and coding — as the new default model in AI Mode for everyone globally.
Because your curiosity doesn’t always fit into keywords, we’re also introducing the biggest upgrade to our Search box in over 25 years — now completely reimagined with AI. This intelligent Search box puts our most powerful AI tools right at your fingertips, making it easier to ask your questions.


It’s more intuitive than ever, dynamically expanding to give you space to describe exactly what you need. Designed to anticipate your intent, it also helps you formulate your question with AI-powered suggestions that go beyond autocomplete. And you can search across modalities, using text, images, files, videos or Chrome tabs as inputs. You’ll continue to get a range of results from Search, just like you do today. The new intelligent Search box is starting to roll out today, in all countries and languages where AI Mode is available.
We’re also making it even simpler to continue the conversation with Search. You can easily ask a follow-up question right from an AI Overview, and flow into a conversational back and forth with AI Mode. Your context stays with you, and as you explore more deeply, the links and supporting articles get even more relevant. This seamless experience is live today across desktop and mobile, worldwide.


We’re entering the era of Search agents, where you can easily create, customize and manage multiple AI agents for your many tasks, right in Search. We’re starting with information agents. Operating in the background, 24/7, these agents intelligently reason across information to find exactly what you need at exactly the right moment.
With information agents, you can stay updated on whatever matters most to you. Your agent will intelligently look across everything on the web, like blogs, news sites and social posts, plus our freshest data, such as real-time info on finance, shopping and sports, to monitor for changes related to your specific question.
It will send you an intelligent, synthesized update, with the ability to take action. So if you’re apartment hunting, you can brain dump all of the exact requirements you’re looking for, and your agent will continuously scan for you, notifying you when listings meet your needs. Or if you want to know the instant any of your favorite pro athletes announce a sneaker collab, your agent will let you know when a new drop lands so you don’t miss out. Information agents will launch first for Google AI Pro & Ultra subscribers this summer.


We’re also expanding agentic booking capabilities in Search to a wide range of new tasks, including local experiences and services. Just share your specific criteria — like finding a private karaoke room for six on a Friday night that serves food late — and Search brings together the latest pricing and availability with direct links to finish booking through the provider of your choice. And for select categories like home repair, beauty or pet care, you can ask Google to call businesses on your behalf. These capabilities will roll out to everyone in the U.S. this summer.


We’re bringing the power of Google Antigravity and the agentic coding capabilities of Gemini 3.5 Flash right into Search. Search can build the ideal response, in the right format for your question — completely on the fly. So you can get custom generative UI, including visual tools and simulations, tailored precisely to your needs.
Whether you want to wrap your mind around astrophysics or visualize how your watch works, Search can design custom layouts, assembling components (like interactive visuals, tables, graphs or simulations) in real-time. These generative UI capabilities will be available for everyone in Search this summer, free of charge.
Finally, for AI to be most helpful, it shouldn't just know the world’s information, it should understand your context, too. So today, we’re expanding Personal Intelligence in AI Mode to more people in nearly 200 countries and territories across 98 languages — no subscription required. You can securely connect apps like Gmail and Google Photos, and soon Google Calendar. Personal Intelligence was designed with transparency, choice and control at its core. You’re always in control — you choose if and when you want to connect apps like Gmail and Google Photos.
This is the next chapter of Google Search: intelligent AI that puts the world’s information to work for you. So ask whatever’s on your mind, and Search can now do more for you than ever before


It’s been a banner year for the Gemini app. Last year at Google I/O, Gemini was serving 400 million users. Today, more than 900 million people across 230 countries and more than 70 languages turn to Gemini for help every month.
In time for Google I/O 2026, here’s what's new:
Gemini 3.5 Flash: The first in our next generation of models that combines frontier intelligence with lightning-fast action.
Neural Expressive: A vibrant, dynamic and completely reimagined design language for Gemini.
Gemini Omni: Our new model that can seamlessly transform text, images and video prompts into cinematic, high-quality video outputs.
Daily Brief: A new agent that gives you a personalized morning brief and organizes exactly what you need to know to start your day.
Gemini Spark: A 24/7 personal AI agent designed to proactively manage tasks and help you navigate your digital life, all under your direction.
MacOS app: Our desktop app will be integrating Gemini Spark so it can operate on your local machine, and it will also add powerful new voice features.


We’ve redesigned the entire Gemini experience from the ground up, introducing a stunning new design language we call Neural Expressive. The interface now features fluid animations, vibrant colors, new typography and haptic feedback.
We’ve also integrated the Gemini Live conversational experience directly into Gemini. Now, you can seamlessly switch from typing a quick question to diving deep into a free-flowing conversation — and back again — without missing a beat. We also re-engineered the mic so you can tap and talk through a complex idea at your own pace without getting cut off mid-thought. And soon, we’ll start offering regional dialects, allowing you to choose a voice that truly resonates with you.
Finally, we’re using the power of our Gemini models to make responses more engaging and easier to understand. Instead of throwing a wall of text at you, Gemini now designs tailored responses in real time — incorporating rich imagery, interactive timelines, narrated videos and dynamic graphics.
Neural Expressive is rolling out globally today across the web, Android and iOS for everyone.


To unlock your creative potential, we're introducing Gemini Omni, a model designed to turn your imagination into reality. By seamlessly combining text, images and video inputs, Gemini Omni allows you to generate stunning, high-quality video outputs effortlessly.
With Gemini Omni, video editing becomes a fluid, natural conversation. You can apply cinematic zooms or swap out backgrounds with a simple prompt. Just upload footage from your camera roll, apply built-in templates with a single tap and create polished content without expensive equipment or specialized technical jargon. You can even drop yourself directly into the action by creating a custom AI avatar that looks and sounds exactly like you.
Gemini Omni begins rolling out today to Google AI Plus, Pro and Ultra subscribers worldwide

        """.trimIndent(),
        category = "android",
        readTime = "5 min read",
        isBookmarked = false
    )
)