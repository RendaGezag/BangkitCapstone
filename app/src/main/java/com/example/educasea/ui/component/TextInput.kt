package com.example.educasea.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput (
    label: String
) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(label) },
        singleLine = true,
        shape = RoundedCornerShape(10),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White
        )
    )
}

@Composable
@Preview
fun TextInputPreview () {
    TextInput(label = "Name")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordInput (
    label: String
) {
    var password by remember { mutableStateOf("") }
    var passwordHidden by remember { mutableStateOf(true) }

    OutlinedTextField(
        value = password,
        onValueChange = {password = it},
        label = { Text(label) },
        singleLine = true,
        shape = RoundedCornerShape(10),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White
        ),
        visualTransformation =
        if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            IconButton(onClick = { passwordHidden = !passwordHidden }) {
                val visibilityIcon =
                    if (passwordHidden) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                // Please provide localized description for accessibility services
                val description = if (passwordHidden) "Show password" else "Hide password"
                Icon(imageVector = visibilityIcon, contentDescription = description)
            }
        }
    )
}

private val Icons.Filled.Visibility: ImageVector
    get() {
        if (_visibility != null) {
            return _visibility!!
        }
        _visibility = materialIcon(name = "Filled.Visibility") {
            materialPath {
                moveTo(12.0f, 4.5f)
                curveTo(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f)
                curveToRelative(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f)
                reflectiveCurveToRelative(9.27f, -3.11f, 11.0f, -7.5f)
                curveToRelative(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        return _visibility!!
    }
private var _visibility: ImageVector? = null

private val Icons.Filled.VisibilityOff: ImageVector
    get() {
        if (_visibilityOff != null) {
            return _visibilityOff!!
        }
        _visibilityOff = materialIcon(name = "Filled.VisibilityOff") {
            materialPath {
                moveTo(12.0f, 7.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f)
                lineToRelative(2.92f, 2.92f)
                curveToRelative(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f)
                curveToRelative(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f)
                curveToRelative(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f)
                lineToRelative(2.16f, 2.16f)
                curveTo(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(2.0f, 4.27f)
                lineToRelative(2.28f, 2.28f)
                lineToRelative(0.46f, 0.46f)
                curveTo(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f)
                curveToRelative(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f)
                curveToRelative(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f)
                lineToRelative(0.42f, 0.42f)
                lineTo(19.73f, 22.0f)
                lineTo(21.0f, 20.73f)
                lineTo(3.27f, 3.0f)
                lineTo(2.0f, 4.27f)
                close()
                moveTo(7.53f, 9.8f)
                lineToRelative(1.55f, 1.55f)
                curveToRelative(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f)
                lineToRelative(1.55f, 1.55f)
                curveToRelative(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f)
                close()
                moveTo(11.84f, 9.02f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(0.02f, -0.16f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                lineToRelative(-0.17f, 0.01f)
                close()
            }
        }
        return _visibilityOff!!
    }
private var _visibilityOff: ImageVector? = null

@Composable
@Preview
fun PasswordInputPreview () {
    PasswordInput(label = "Password")
}

@Composable
@Preview
fun SearchInputPreview () {
    SearchInput (
        label = "Cari",
        onValueChange = {}
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchInput (
    label: String,
    onValueChange: (String) -> Unit
) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
            onValueChange(it)
        },
        label = { Text(label) },
        singleLine = true,
        shape = RoundedCornerShape(100),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White
        ),
        leadingIcon = { Icon(Icons.Filled.Search, contentDescription = "Search icon")},
        modifier = Modifier.height(60.dp).fillMaxWidth()
    )
}
