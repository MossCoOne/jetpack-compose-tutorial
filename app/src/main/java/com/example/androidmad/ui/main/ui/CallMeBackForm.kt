package com.example.androidmad.ui.main.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.androidmad.AnnotatedClickableText
import com.example.androidmad.CustomTextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CallMeBackForm() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        Text(
            text = "Personal Details",
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = "Please fill your details below so that one of our consultants will contact you and assist you",
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(8.dp)
        )
        var mInput1 by remember{ mutableStateOf("")}
        CustomTextField(
            value = mInput1, onValueChange = { mInput1 = it }, modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .width(328.dp),
            label = { Text(text = "First name") }
        )

        Spacer(modifier = Modifier.height(2.dp))

        TextField(
            value = "", onValueChange = {},
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .width(328.dp),
            label = { Text(text = "First name") }
        )
        Spacer(modifier = Modifier.height(2.dp))
        TextField(
            value = "", onValueChange = {},
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .width(328.dp),
            label = { Text(text = "Last name") }
        )
        Spacer(modifier = Modifier.height(2.dp))
        TextField(
            value = "", onValueChange = {},
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .width(328.dp),
            label = { Text(text = "Id nmber") }
        )
        Spacer(modifier = Modifier.height(2.dp))
        TextField(
            value = "", onValueChange = {},
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .width(328.dp),
            label = { Text(text = "Cellphone number") }
        )

        Text(
            text = "Notification sent when you transact will be sent to the cellphone number we currently have on record. Please contact us on 0860 004 111 should you want to change the cellphone number",
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(8.dp),
            style = TextStyle(color = Color.Red)
        )

        val (checkedState, onStateChange) = remember { mutableStateOf(true) }

        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .fillMaxWidth()
                .padding(6.dp)
        ) {
            Row(
                Modifier
                    .background(color = Color.Green)
                    .fillMaxWidth()
                    .toggleable(
                        value = checkedState,
                        onValueChange = { onStateChange(!checkedState) },
                        role = Role.Checkbox
                    )
                    .padding(16.dp)
            ) {

                val text =
                    "I agree that the Bank will process the personal information that I have provided to call me back in relation to the product/services that I have expressed interest in. The bank keeps all information shared with it confidential in line with it’s "
                val clickableText = "Privacy Policy."
                val url = "https://developer.android.com/jetpack"

                Checkbox(
                    checked = checkedState,
                    onCheckedChange = null,
                    modifier = Modifier.padding( end =  16.dp, top = 8.dp)
                )

                AnnotatedClickableText(text, clickableText, url)
            }
        }

    }
}