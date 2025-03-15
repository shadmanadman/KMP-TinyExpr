package org.adman.kmp.tiny.expr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform