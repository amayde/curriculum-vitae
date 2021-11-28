package com.amede.curriculum_vitae.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavBackStackEntry
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.amede.curriculum_vitae.ui.home.Home

/**
 * Destinations used in the ([CurriculumVitaeApp]).
 */
object MainDestinations {
    const val HOME_ROUTE = "home"
    const val EXPERIENCES_ROUTE = "experiences"
    const val SKILLS_ROUTE = "skills"
    const val ACADEMIC_ROUTE = "academic"
}

@Composable
fun NavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = MainDestinations.HOME_ROUTE
) {
    val actions = remember(navController) { MainActions(navController) }

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(MainDestinations.HOME_ROUTE) { backStackEntry ->
            Home(
                skillsAction = {
                    actions.skillsAction(backStackEntry)
                },
                academicAction = {
                    actions.academicAction(backStackEntry)
                },
                experiencesAction = {
                    actions.experiencesAction(backStackEntry)
                }
            )
        }
        composable(MainDestinations.EXPERIENCES_ROUTE) { backStackEntry ->
            // TODO
        }
        composable(MainDestinations.SKILLS_ROUTE) { backStackEntry ->
            // TODO
        }
        composable(MainDestinations.ACADEMIC_ROUTE) { backStackEntry ->
            // TODO
        }
    }
}

class MainActions(navController: NavHostController) {
    val experiencesAction: (from: NavBackStackEntry) -> Unit = { from ->
        if (from.lifecycleIsResumed()) {
            navController.navigate(MainDestinations.EXPERIENCES_ROUTE)
        }
    }
    val skillsAction: (from: NavBackStackEntry) -> Unit = { from ->
        if (from.lifecycleIsResumed()) {
            navController.navigate(MainDestinations.SKILLS_ROUTE)
        }
    }
    val academicAction: (from: NavBackStackEntry) -> Unit = { from ->
        if (from.lifecycleIsResumed()) {
            navController.navigate(MainDestinations.ACADEMIC_ROUTE)
        }
    }
}

private fun NavBackStackEntry.lifecycleIsResumed() =
    this.lifecycle.currentState == Lifecycle.State.RESUMED