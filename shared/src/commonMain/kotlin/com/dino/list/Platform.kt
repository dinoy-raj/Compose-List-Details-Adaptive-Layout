package com.dino.list

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform