plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.aliucord.gradle")
}

version = "0.2.0"
description = "Fixes an issue where mentions sometimes become invalid-user"

aliucord {
    changelog.set(file("CHANGELOG.md").readText())
    author("6pak", 141580516380901376)
    github("https://github.com/js6pak/ValidUser")
}

android {
    compileSdk = 30

    defaultConfig {
        minSdk = 24
        targetSdk = 30
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    discord("com.discord:discord:aliucord-SNAPSHOT")
    api("com.github.Aliucord:Aliucord:main-SNAPSHOT")
}
