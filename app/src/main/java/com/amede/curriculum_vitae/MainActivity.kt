package com.amede.curriculum_vitae

import android.os.Bundle
import android.view.animation.AnticipateInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.amede.curriculum_vitae.ui.CurriculumVitaeApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val splashScreen = installSplashScreen()
        splashScreen.setOnExitAnimationListener { splashScreenView ->
            splashScreenView.view.animate()
                .setDuration(500L)
                .alpha(0f)
                .withEndAction {
                    splashScreenView.remove()
                }
                .start()
            splashScreenView.iconView.animate()
                .setDuration(300L)
                .translationY(-splashScreenView.view.height.toFloat())
                .apply {
                    interpolator = AnticipateInterpolator()
                }
                .start()
        }
        setContent {
            CurriculumVitaeApp()
        }
    }
}