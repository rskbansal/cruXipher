// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlinVersion = "1.9.0"
    System.setProperty("kotlinVersion", kotlinVersion)
    repositories {
        google()
        maven {
            setUrl("https://jitpack.io")
        }
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${System.getProperty("kotlinVersion")}")
    }
}

plugins {
    id("com.android.application") version ("8.1.1") apply (false)
    id("org.jetbrains.kotlin.android") version ("1.9.0") apply (false)
    id ("com.google.devtools.ksp") version ("1.9.0-1.0.13") apply (false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}