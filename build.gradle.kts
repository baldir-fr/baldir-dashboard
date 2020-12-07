buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
        classpath("com.android.tools.build:gradle:4.0.1")
        classpath("org.jmailen.gradle:kotlinter-gradle:3.2.0")
        classpath("gradle.plugin.org.ec4j.gradle:editorconfig-gradle-plugin:0.0.3")
    }
}

plugins {
    id("org.jmailen.kotlinter") version "3.2.0"
    id("org.ec4j.editorconfig") version "0.0.3"
    id("se.thinkcode.cucumber-runner") version "0.0.8" apply false
    id("org.sonarqube") version "3.0"
}

sonarqube {
    properties {
        property("sonar.projectKey", "baldir-fr_baldir-dashboard")
        property("sonar.organization", "baldir-fr")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

editorconfig {
    excludes =
        mutableListOf(
            "**/*.JPG", "**/*.PNG", "**/*.GIF", "**/*.ICO",
            "**/*.BMP", "**/*.TIFF", "**/*.TIF", "**/*.CR2", "**/*.XCF"
        )
}

group = "fr.baldir.dashboard"

version = "1.0"

project(":android-infra") {
    sonarqube {
        isSkipProject = true
    }
}

allprojects {
    apply(plugin = "org.jmailen.kotlinter")
    apply(plugin = "org.ec4j.editorconfig")
    repositories {
        jcenter()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }

}

