package com.example.tmdb

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tmdb.screens.DetailViewScreen
import com.example.tmdb.screens.FavouritesScreen
import com.example.tmdb.screens.HomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalFoundationApi
@ExperimentalPagerApi
@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(navController = navController)

        }
        composable(route = BottomBarScreen.Favourites.route) {
            val listState = rememberLazyListState()
            FavouritesScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Details.route) {
            DetailViewScreen(navController = navController)
        }
    }
}