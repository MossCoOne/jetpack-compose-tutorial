package com.example.androidmad.ui.main.components

import android.util.Log
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp


@Composable
fun AnnotatedClickableText(text: String, clickableText: String, url: String) {

    val annotatedText = buildAnnotatedString {
        append(text)
        pushStringAnnotation(
            tag = "URL",
            annotation = url
        )
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 18.sp
            )
        ) {
            append(clickableText)
        }
        pop()
    }
    val mUriHandler = LocalUriHandler.current
    ClickableText(
        text = annotatedText,
        onClick = { offset ->
            annotatedText.getStringAnnotations(
                tag = "URL", start = offset,
                end = offset
            ).firstOrNull()?.let { annotation ->
                //Break out to T&C
                mUriHandler.openUri(annotation.item)
                Log.d("Clicked URL", annotation.item)
            }
        }
    )
}