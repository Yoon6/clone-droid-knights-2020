object Versions {
    const val compileSdk = 33
    const val minSdk = 23
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "0.0.0"
}

object Dep {
    object AndroidX {
        const val core = "androidx.core:core-ktx:1.9.0"
        const val appcompat = "androidx.appcompat:appcompat:1.6.1"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val material = "com.google.android.material:material:1.8.0"
        const val browser = "androidx.browser:browser:1.3.0"
        const val swiperefresh = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"

        object Lifecycle {
            private const val lifecycleVersion = "2.5.1"
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
            const val extensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
        }

        object Navigation {
            private const val version = "2.5.3"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val ui = "androidx.navigation:navigation-ui-ktx:$version"
        }
    }

    object Kotlin {
        object Coroutines {
            private const val version = "1.6.4"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
            const val playServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$version"
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
        }
    }

    object Firebase {
        const val bom = "com.google.firebase:firebase-bom:31.2.2"
        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val firestore = "com.google.firebase:firebase-firestore-ktx"
        const val messaging = "com.google.firebase:firebase-messaging-ktx"
    }

    object Glide {
        private const val version = "4.14.2"
        const val glide = "com.github.bumptech.glide:glide:$version"
        const val compiler = "com.github.bumptech.glide:compiler:$version"
    }

    object Hilt {
        const val android = "com.google.dagger:hilt-android:2.44"
        const val compiler = "com.google.dagger:hilt-compiler:2.44"
    }

    object Google {
        const val gson = "com.google.code.gson:gson:2.10.1"
        const val flexbox = "com.google.android.flexbox:flexbox:3.0.0"

        object PlayService {
            const val ossLicense = "com.google.android.gms:play-services-oss-licenses:17.0.0"
        }
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val junitExt = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
    }
    const val timber = "com.jakewharton.timber:timber:4.7.1"

}