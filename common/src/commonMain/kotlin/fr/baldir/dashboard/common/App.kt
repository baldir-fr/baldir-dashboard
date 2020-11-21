package fr.baldir.dashboard.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// This is in the Left side of the hexagon (command and UI)
// It still knows about framework related stuff (UI Here)
// Behavior which is UI-related should be in this module
// Behaviour which is not UI-related should be in domain
@Composable
fun App( /* exitApp: () -> Unit*/) {

    MaterialTheme {
        Row {

            Column(modifier = Modifier.fillMaxHeight()) {
                Row {
                    Button(onClick = {/*exitApp()*/}) {
                        Text("Exit")
                    }
                    Checkbox(checked = false, onCheckedChange = {})
                    Text("In a column 1")
                }
            }
            Column(modifier = Modifier.fillMaxHeight()) { Text("In a column 2") }

            Column(modifier = Modifier.fillMaxHeight()) { Text("In a column 3") }
        }


    }
}
