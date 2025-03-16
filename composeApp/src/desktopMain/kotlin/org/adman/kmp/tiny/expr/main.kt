package org.adman.kmp.tiny.expr

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-TinyExpr",
    ) {
        App()
        val result = TinyExprJNI.eval("3 + 4 * 2")
        println("Result: $result")
    }
}
