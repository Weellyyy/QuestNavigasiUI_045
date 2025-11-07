package com.example.questnavigasiui_045

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

enum class Navigasi{
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
}