plugins {
    //trick: for the same plugin versions in all sub-modules
//    alias(libs.plugins.androidApplication).apply(false)
//    alias(libs.plugins.androidLibrary).apply(false)
//    alias(libs.plugins.kotlinAndroid).apply(false)
 //   alias(libs.plugins.kotlinMultiplatform).apply(false)


    id("com.android.application").version("8.2.0").apply(false)
    id("com.android.library").version("8.2.0").apply(false)
    kotlin("android").version("1.9.20").apply(false)
    kotlin("multiplatform").version("1.9.20").apply(false)
    kotlin("plugin.serialization").version("1.9.20").apply(false)
}
repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}