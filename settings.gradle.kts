pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }

}
rootProject.name = "baldir-dashboard"


include(":androidInfra")
include(":desktopInfra")
include(":commonUI")
include(":domain")


