package fr.baldir.dashboard.common

actual fun getPlatformName(): String {
    return "Android"
}

actual fun exit() {
    println("Exit app?")
}