package com.example.pagingwithkoin.ui.naivgation

import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.pagingwithkoin.ui.screens.PostScreen
import com.example.pagingwithkoin.ui.screens.PostViewModel
import org.koin.androidx.compose.koinViewModel

fun NavGraphBuilder.homeNavGraph() {
    navigation(
        route = NavGraph.HOME,
        startDestination = HomeScreens.HomeListScreen.route
    ) {
        composable(route = HomeScreens.HomeListScreen.route) {
            val viewModel = koinViewModel<PostViewModel>()
            PostScreen(viewModel)
        }
    }
}
sealed class HomeScreens(val route : String){
    data object HomeListScreen : HomeScreens(route = "home_list_screen")
}

