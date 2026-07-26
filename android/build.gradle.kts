subprojects {
    plugins.withId("com.android.application") {
        the<com.android.build.gradle.AppExtension>().apply {
            compileSdkVersion(33)
            defaultConfig {
                targetSdkVersion(33)
            }
        }
    }
    plugins.withId("com.android.library") {
        the<com.android.build.gradle.LibraryExtension>().apply {
            compileSdkVersion(33)
        }
    }
}
