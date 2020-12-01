package fr.baldir.dashboard.common

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// This is in the Left side of the hexagon (command and UI)
// It still knows about framework related stuff (UI Here)
// Behavior which is UI-related should be in this module
// Behaviour which is not UI-related should be in domain

@Composable
fun App() {

    MaterialTheme(
        colors = darkThemeColors
    ) {
        val typography = MaterialTheme.typography

        Column(modifier = Modifier.padding(16.dp)) {
            Text("Title 1", style = typography.h1)
            Button(
                onClick = {
                    println("Hello to console")
                    exit()
                }
            ) {
                Text("Hello to console")
            }
            Checkbox(checked = false, onCheckedChange = {})
            Text("Title 2", style = typography.h2)
            Text("Title 3", style = typography.h3)
            Text("Title 2", style = typography.h2)
            Text("Title 3", style = typography.h3)
        }
    }
}

expect fun exit()

val darkThemeColors = darkColors(
    primary = Color(0xFFBB86FC),
    primaryVariant = Color(0xFF3700B3),
    secondary = Color(0xFF03DAC6),
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    error = Color(0xFFCF6679),
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White,
    onError = Color.Black
)