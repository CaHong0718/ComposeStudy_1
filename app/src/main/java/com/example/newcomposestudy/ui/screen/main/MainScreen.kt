package com.example.newcomposestudy.ui.screen.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.newcomposestudy.navigation.Routes



@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold { innerPadding ->

        Box(modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center) {
            Button(onClick = { onClickMainButton(navController) }) {
                Text("다음 화면으로")
            }
        }
    }
}

fun onClickMainButton(navController: NavHostController){
    navController.navigate(Routes.INPUT)
}