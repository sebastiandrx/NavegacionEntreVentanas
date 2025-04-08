package com.example.navegacionentreventanas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ScreenB(navController: NavController, viewModel: SharedViewModel) {
    val listaUsuarios by viewModel.usuarios.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "📋 Historial de Usuarios",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Mostrar cada usuario como una tarjeta
        listaUsuarios.forEach { usuario ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                elevation = CardDefaults.cardElevation(6.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("👤 Nombre:", style = MaterialTheme.typography.titleSmall)
                    Text(usuario.nombre, style = MaterialTheme.typography.bodyLarge)

                    Spacer(modifier = Modifier.height(8.dp))

                    Text("✉️ Correo:", style = MaterialTheme.typography.titleSmall)
                    Text(usuario.correo, style = MaterialTheme.typography.bodyLarge)

                    Spacer(modifier = Modifier.height(8.dp))

                    Text("💼 Profesión:", style = MaterialTheme.typography.titleSmall)
                    Text(usuario.profesion, style = MaterialTheme.typography.bodyLarge)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = { navController.popBackStack() }) {
            Text("⬅️ Volver")
        }
    }
}
