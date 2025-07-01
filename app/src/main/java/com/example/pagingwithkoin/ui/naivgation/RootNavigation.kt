package com.example.pagingwithkoin.ui.naivgation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

object NavGraph{
    const val ROOT = "root_graph"
    const val HOME = "home_graph"
}
@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
        route = NavGraph.ROOT,
        startDestination = NavGraph.HOME
    ){
        homeNavGraph(navController =  navController)
    }
}
