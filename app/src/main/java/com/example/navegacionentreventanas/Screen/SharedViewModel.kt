package com.example.navegacionentreventanas

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class Usuario(val nombre: String, val correo: String, val profesion: String)

class SharedViewModel : ViewModel() {
    private val _usuarios = MutableStateFlow<List<Usuario>>(emptyList())
    val usuarios: StateFlow<List<Usuario>> = _usuarios

    fun agregarUsuario(nombre: String, correo: String, profesion: String) {
        _usuarios.value = _usuarios.value + Usuario(nombre, correo, profesion)
    }
}
