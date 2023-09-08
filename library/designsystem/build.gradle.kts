plugins {
    id("composenews.android.library")
    id("composenews.android.library.compose")
}

android {
    namespace = "ir.composenews.designsystem"
}

dependencies {
    libs.apply {
        api(platform(compose.bom))
        api(bundles.compose)
        api(compose.coil)
        api(lifecycle.runtime.compose)
        api(libs.material3)
        api(libs.material3.window.size)
    }
}