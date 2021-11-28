package com.amede.curriculum_vitae.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.amede.curriculum_vitae.ui.theme.CurriculumvitaeTheme

@Composable
fun CurriculumVitaeApp() {
    CurriculumvitaeTheme() {
        val navController = rememberNavController()
        Surface(color = MaterialTheme.colors.background) {
            NavGraph(
                navController = navController
            )
        }
    }
}