package com.example.navegacionentreventanas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ScreenA(navController: NavController, viewModel: SharedViewModel) {
    var nombre by remember { mutableStateOf("") }
    var correo by remember { mutableStateOf("") }
    var profesion by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Pantalla A", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            textStyle = LocalTextStyle.current.copy(color = Color.Black),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = correo,
            onValueChange = { correo = it },
            label = { Text("Correo") },
            textStyle = LocalTextStyle.current.copy(color = Color.Black),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = profesion,
            onValueChange = { profesion = it },
            label = { Text("Profesión") },
            textStyle = LocalTextStyle.current.copy(color = Color.Black),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                viewModel.agregarUsuario(nombre, correo, profesion)
                navController.navigate("screen_b")
                nombre = ""
                correo = ""
                profesion = ""
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Enviar")
        }
    }
}

