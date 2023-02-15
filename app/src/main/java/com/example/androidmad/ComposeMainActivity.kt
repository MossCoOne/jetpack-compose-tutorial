package com.example.androidmad

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidmad.ui.theme.AndroidMadTheme

class ComposeMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidMadTheme {
                LandingPageLayout()
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

@Composable
private fun Greeting(name: String) {

    val expanded = rememberSaveable { mutableStateOf(false) }
    val extraPadding = if (expanded.value) 48.dp else 0.dp

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = extraPadding)
            ) {
                Text(text = "Hello,")
                Text(text = "$name")
            }

            ElevatedButton(onClick = {
                expanded.value = !expanded.value
            }) {
                Text(if (expanded.value) "Show less" else "Show more")
            }
        }
    }
}


@Preview(showBackground = true, name = "Greeting preview", widthDp = 320)
@Composable
fun GreetingPreview() {
    AndroidMadTheme {
        //MyApp(names = List(10) { "$it" } )
        LandingPageLayout()
    }

}


@Composable
fun BorderedButton(buttonText: String, modifier: Modifier, onClick: () -> Unit) {
    OutlinedButton(
        onClick = { onClick }, modifier = modifier
    ) {
        Text(text = buttonText)
    }
}

@Composable
fun LandingPageLayout() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        BorderedButton(
            "Input fields",
            modifier = Modifier
                .padding(8.dp)
        ) {
            Toast.makeText(context, "Clicked first button", Toast.LENGTH_SHORT).show()
        }
        BorderedButton(
            "Cards",
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Toast.makeText(context, "Clicked Second button", Toast.LENGTH_SHORT).show()
        }
    }
}


data class Message(val author: String, val body: String)