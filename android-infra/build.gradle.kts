plugins {
    id("org.jetbrains.compose") version "0.1.0-m1-build62"
    id("com.android.application")
    kotlin("android")
}

group = "fr.baldir.dashboard"
version = "1.0"
dependencies {
    implementation(project(":common"))
}

repositories {
    google()
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "fr.baldir.dashboard.android"
        minSdkVersion(24)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}