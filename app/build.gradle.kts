plugins {
}

android {
    namespace = "github.com.xxabssouza.lista_compras_oficial"
    compileSdk = 34

    defaultConfig {
        applicationId = "github.com.xxabssouza.lista_compras_oficial"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {

}