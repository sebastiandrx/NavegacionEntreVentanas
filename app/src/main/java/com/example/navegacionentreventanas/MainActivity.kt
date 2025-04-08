package com.example.navegacionentreventanas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.navegacionentreventanas.NavigationExample
import com.example.navegacionentreventanas.ui.theme.NavegacionEntreVentanasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegacionEntreVentanasTheme {
                NavigationExample()
            }
        }
    }
}
