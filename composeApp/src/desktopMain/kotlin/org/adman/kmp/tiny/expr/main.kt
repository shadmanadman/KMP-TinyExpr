package org.adman.kmp.tiny.expr

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-TinyExpr",
    ) {
        App()
    }
}