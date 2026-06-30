plugins {
    id("com.android.library")
}

android {
    namespace = "com.fluttercandies.flutter_image_compress"
    compileSdk = 36

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    defaultConfig {
        minSdk = 24
    }
}

dependencies {
    implementation("androidx.heifwriter:heifwriter:1.1.0")
}
