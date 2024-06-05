package com.example.androidmad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.dp
import com.example.androidmad.ui.main.ui.CallMeBackForm
import com.example.androidmad.ui.theme.AndroidMadTheme
import com.example.androidmad.ui.main.components.Greeting

class ComposeMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidMadTheme {
                Surface(color = Color.White) {
                    CallMeBackForm()
                }

            }
        }
    }
}

/**
 * Modifiers tell a UI element how to lay out, display, or behave within its parent layout
 * It's good practice to the consumer ability to customize their views by passing the Modifier as a param
 *
 * */

@Composable
private fun MyApp(modifier: Modifier = Modifier, names: List<String>) {
    Surface(modifier = modifier, color = MaterialTheme.colorScheme.background) {
        LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
            items(items = names) { name ->
                Greeting(name = name)
            }
        }
    }
}