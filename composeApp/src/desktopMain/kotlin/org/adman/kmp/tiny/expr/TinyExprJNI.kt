package org.adman.kmp.tiny.expr

object TinyExprJNI {
    init {
        System.loadLibrary("tinyexpr_jni")
    }

    external fun eval(expression: String): Double
}