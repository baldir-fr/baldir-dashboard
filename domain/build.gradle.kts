plugins {
    kotlin("multiplatform")
}
group = "fr.baldir.dashboard"
version = "1.0"

kotlin {
    jvm(name = "domain") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val domainMain by getting
        val domainTest by getting {
            dependencies {
                implementation("io.cucumber:cucumber-java8:6.8.1")
                implementation("io.cucumber:cucumber-junit:6.8.1")
                implementation("org.junit.jupiter:junit-jupiter:5.7.0")
                implementation("org.junit.vintage:junit-vintage-engine:5.7.0")
            }
        }
    }
}