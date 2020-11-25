
plugins {
    kotlin("multiplatform")
}

group = "fr.baldir.dashboard"
version = "1.0"

kotlin {
    jvm(name="domain") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val domainMain by getting
        val domainTest by getting{
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}