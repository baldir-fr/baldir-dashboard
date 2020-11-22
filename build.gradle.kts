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

plugins{
    id("org.jmailen.kotlinter") version "3.2.0"
    id("org.ec4j.editorconfig") version "0.0.3"
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
allprojects {
    apply(plugin = "org.jmailen.kotlinter")
    apply(plugin="org.ec4j.editorconfig")
    repositories {
        jcenter()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }

}

