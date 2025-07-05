buildscript {
    dependencies {
        classpath ("com.google.gms:google-services:4.3.15")  // If you're using Firebase
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}