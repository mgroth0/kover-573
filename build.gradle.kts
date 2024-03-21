plugins {
    kotlin("jvm") version("2.0.0-Beta4")
    id("org.jetbrains.kotlinx.kover") version "0.8.0-Beta"
}

kotlin {
    jvmToolchain(17)
}


repositories {
    mavenCentral()
}

dependencies {
    add("testImplementation",kotlin("test"))
}

kover {
    reports {
        verify {
            rule {
                minBound(100)
            }
        }
    }
}