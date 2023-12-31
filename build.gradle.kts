// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.google.dagger.hilt.android") version "2.47" apply false
//    id("org.jetbrains.kotlin.android.extensions") version "1.9.10"
}

buildscript {

    dependencies {
        val nav_version = "2.7.1"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
        classpath ("com.android.tools.build:gradle:8.0.0")
//        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:nav_version")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.47")
    }
}

