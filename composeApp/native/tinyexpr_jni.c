#include <jni.h>
#include "include/tinyexpr.h"

JNIEXPORT jdouble JNICALL
Java_org_adman_kmp_tiny_expr_TinyExprJNI_eval(JNIEnv *env, jclass clazz, jstring expression) {
    const char *expr = (*env)->GetStringUTFChars(env, expression, 0);
    double result = te_interp(expr, 0); // Evaluate expression
    (*env)->ReleaseStringUTFChars(env, expression, expr);
    return result;
}