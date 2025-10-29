package com.example.helloformcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloformcompose.ui.theme.HelloFormComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloFormComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HelloForm()
                }
            }
        }
    }
}

@Composable
fun HelloForm() {
    // Estados que se conservan al rotar el dispositivo
    var name by rememberSaveable { mutableStateOf("") }
    var greeting by rememberSaveable { mutableStateOf("") }

    // Controlador del teclado para ocultarlo
    val keyboardController = LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Título de la app
        Text(
            text = "👋 Saludador",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Campo de texto con límite de 20 caracteres
        OutlinedTextField(
            value = name,
            onValueChange = {
                if (it.length <= 20) { // Límite de 20 caracteres
                    name = it
                }
            },
            label = { Text("Tu nombre") },
            placeholder = { Text("Escribe aquí...") },
            supportingText = {
                Text("${name.length}/20 caracteres")
            },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Botón que solo se activa si hay texto
        Button(
            onClick = {
                greeting = if (name.isBlank()) {
                    "Introduce tu nombre"
                } else {
                    "👋 Hola, $name"
                }
                keyboardController?.hide() // Oculta el teclado
            },
            enabled = name.isNotBlank(), // Deshabilitado si está vacío
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Saludar", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Muestra el saludo si existe
        if (greeting.isNotEmpty()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Text(
                    text = greeting,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}