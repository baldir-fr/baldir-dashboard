import androidx.compose.desktop.AppManager
import androidx.compose.desktop.Window
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.window.Menu
import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.MenuItem
import fr.baldir.dashboard.common.App

fun main() = Window(
    title = "Baldir Dashboard",
    size = IntSize(500, 800),
    menuBar = MenuBar(
        Menu(
            "File",
            MenuItem(
                "Exit",
                onClick = { exitApp() }
            )
        )
    ),
    centered = false,
    location = IntOffset(1420, 0)

) {

    App(/*exitApp = { exitApp() }*/)
}

fun exitApp() {
    AppManager.exit()
}