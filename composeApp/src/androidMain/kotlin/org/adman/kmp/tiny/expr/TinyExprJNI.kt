package org.adman.kmp.tiny.expr

object TinyExprJNI {
    init {
        System.loadLibrary("tinyexpr") // Load the correct `.so` file based on ABI
    }

    external fun eval(expression: String): Double
}