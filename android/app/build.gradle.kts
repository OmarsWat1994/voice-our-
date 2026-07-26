plugins {
    id("com.android.application")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.voice_our_iraq_app"
    compileSdk = 35
    ndkVersion = flutter.ndkVersion

    packaging {
    jniLibs.pickFirsts.add("lib/arm64-v8a/libagora_rtc_sdk.so")
    jniLibs.pickFirsts.add("lib/armeabi-v7a/libagora_rtc_sdk.so")
    jniLibs.pickFirsts.add("lib/x86_64/libagora_rtc_sdk.so")
}

    lint {
        checkReleaseBuilds = false
        abortOnError = false
    }

    configurations.all {
        resolutionStrategy {
            force("androidx.window:window:1.1.0")
            force("androidx.window.extensions.core:core:1.0.0")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    defaultConfig {
        applicationId = "com.example.voice_our_iraq_app"
        minSdk = flutter.minSdkVersion
        targetSdk = 35
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
