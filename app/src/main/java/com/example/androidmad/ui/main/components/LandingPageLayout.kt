package com.example.androidmad.ui.main.components

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

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