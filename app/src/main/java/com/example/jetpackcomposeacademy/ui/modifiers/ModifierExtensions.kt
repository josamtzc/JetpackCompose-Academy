package com.example.jetpackcomposeacademy.ui.modifiers

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun Modifier.defaultScreen() = apply {
    fillMaxSize().padding(20.dp)
}