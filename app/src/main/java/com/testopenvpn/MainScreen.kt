package com.testopenvpn

import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen(viewModel: MainViewModel = viewModel()) {
    val activity = LocalContext.current as Activity
    Column(Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.weight(1f))
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp)) {
            Button(onClick = { viewModel.turnOnVpn(activity) }) {
                Text(text = "Turn on")
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(onClick = { viewModel.turnOffVpn() }) {
                Text(text = "Turn off")
            }
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}