package com.example.loginmaterialyou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import com.example.loginmaterialyou.ui.screens.LoginScreen
import com.example.loginmaterialyou.ui.screens.WelcomeScreen
import com.example.loginmaterialyou.ui.theme.LoginMaterialYouTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginMaterialYouTheme {
                var authenticatedUser by remember { mutableStateOf<String?>(null) }

                if (authenticatedUser == null) {
                    LoginScreen(
                        onLoginSuccess = { email -> authenticatedUser = email }
                    )
                } else {
                    WelcomeScreen(
                        userEmail = authenticatedUser!!,
                        onLogout = { authenticatedUser = null }
                    )
                }
            }
        }
    }
}