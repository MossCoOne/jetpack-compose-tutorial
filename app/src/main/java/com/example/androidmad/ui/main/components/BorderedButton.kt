package com.example.androidmad.ui.main.components

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BorderedButton(buttonText: String, modifier: Modifier, onClick: () -> Unit) {
    OutlinedButton(
        onClick = { onClick }, modifier = modifier
    ) {
        Text(text = buttonText)
    }
}