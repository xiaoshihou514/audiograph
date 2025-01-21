package com.github.xiaoshihou.jiyi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform