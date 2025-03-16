package org.adman.kmp.tiny.expr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val result = TinyExprJNI.eval("3 + 4 * 2")
            println("Result: $result")
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}