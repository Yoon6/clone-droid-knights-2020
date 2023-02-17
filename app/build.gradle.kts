import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    id("com.google.gms.google-services")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.clonedroidknights2020"
    compileSdk = Versions.compileSdk

    defaultConfig {
        applicationId = "com.example.clonedroidknights2020"
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
        versionCode = Versions.versionCode
        versionName = Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Dep.AndroidX.core)
    implementation(Dep.AndroidX.appcompat)
    implementation(Dep.AndroidX.constraintLayout)
    implementation(Dep.AndroidX.material)
    implementation(Dep.AndroidX.browser)
    implementation(Dep.AndroidX.swiperefresh)
    implementation(Dep.AndroidX.Lifecycle.runtime)
    implementation(Dep.AndroidX.Lifecycle.extensions)
    implementation(Dep.AndroidX.Lifecycle.viewModel)
    implementation(Dep.AndroidX.Lifecycle.livedata)
    implementation(Dep.AndroidX.Navigation.fragment)
    implementation(Dep.AndroidX.Navigation.ui)

    implementation(Dep.Kotlin.Coroutines.core)
    implementation(Dep.Kotlin.Coroutines.android)
    implementation(Dep.Kotlin.Coroutines.playServices)
    implementation(Dep.Kotlin.Coroutines.test)

    implementation(platform(Dep.Firebase.bom))
    implementation(Dep.Firebase.analytics)
    implementation(Dep.Firebase.firestore)
    implementation(Dep.Firebase.messaging)

    implementation(Dep.Hilt.android)
    kapt(Dep.Hilt.compiler)

    implementation(Dep.Glide.glide)
    implementation(Dep.Glide.compiler)

    implementation(Dep.Google.gson)
    implementation(Dep.Google.flexbox)
    implementation(Dep.Google.PlayService.ossLicense)

    implementation(Dep.Test.junit)
    implementation(Dep.Test.junitExt)
    implementation(Dep.Test.espresso)

    implementation(Dep.timber)
}

kapt {
    correctErrorTypes = true
}