package com.example.actividades_1_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dam23_24.composecatalogolayout.screens.Actividad1
import com.dam23_24.composecatalogolayout.screens.Actividad2
import com.dam23_24.composecatalogolayout.screens.Actividad3
import com.dam23_24.composecatalogolayout.screens.Actividad4
import com.dam23_24.composecatalogolayout.screens.Actividad5
import com.example.actividades_1_5.ui.theme.Actividades_1_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividades_1_5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Actividad5()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Actividades_1_5Theme {
        Greeting("Android")
    }
}