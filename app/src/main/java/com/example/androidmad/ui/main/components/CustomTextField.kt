package com.example.androidmad.ui.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidmad.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: @Composable() (() -> Unit)? = null,
    shape: Shape = TextFieldDefaults.filledShape,
    isError: Boolean = true,
    colors: TextFieldColors = TextFieldDefaults.textFieldColors(),
    textStyle: TextStyle = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
        color = Color.DarkGray,
        textAlign = TextAlign.Start
    )
) {
    val interactionSource = remember { MutableInteractionSource() }
    val enabled = true
    val singleLine = true


    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .background(colorResource(id = R.color.white), shape)
            .indicatorLine(enabled, isError, interactionSource, colors)
            .defaultMinSize(
                minWidth = TextFieldDefaults.MinWidth,
                minHeight = TextFieldDefaults.MinHeight
            ),
        interactionSource = interactionSource,
        textStyle = textStyle,
        enabled = enabled,
        singleLine = singleLine
    ) {
        TextFieldDefaults.TextFieldDecorationBox(
            value = value,
            visualTransformation = VisualTransformation.None,
            innerTextField = it,
            label = label,
            singleLine = singleLine,
            enabled = enabled,
            interactionSource = interactionSource,
            contentPadding = PaddingValues(0.dp),
            colors = colors
        )
    }
}