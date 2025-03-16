package org.adman.kmp.tiny.expr

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    App()
    val result = evaluateExpression("3 + 5 * 2")
    println("Result: $result")
}
