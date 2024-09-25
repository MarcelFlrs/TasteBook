package br.edu.up.appdereceitas.ui.util

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: @Composable () -> Unit,
    onDrawerClick: (() -> Unit)? = null,
    mostrarBotaoVoltar: Boolean = false
) {
    TopAppBar(
        title = title,
        navigationIcon = {
            Row {

                if (onDrawerClick != null) {
                    IconButton(onClick = { onDrawerClick() }) {
                        Icon(Icons.Filled.Menu, contentDescription = "Abrir Menu")
                    }
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFFec7e30),
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        )
    )
}
