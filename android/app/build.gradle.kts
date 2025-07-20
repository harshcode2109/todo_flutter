 plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.todo_flutter"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.example.todo_flutter"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
 dependencies {
     // Firebase BoM (manages versions automatically)
     implementation(platform("com.google.firebase:firebase-bom:33.16.0"))

     // Firebase services for your Todo app
     implementation("com.google.firebase:firebase-auth")
     implementation("com.google.firebase:firebase-firestore")
     implementation("com.google.firebase:firebase-analytics") // optional

     // Recommended AndroidX libraries
     implementation("androidx.core:core-ktx:1.12.0")
     implementation("androidx.appcompat:appcompat:1.6.1")
     implementation("com.google.android.material:material:1.9.0")
 }



// ✅ Add this at the very end of this file
apply(plugin = "com.google.gms.google-services")
apply(plugin = "com.google.firebase.crashlytics")

