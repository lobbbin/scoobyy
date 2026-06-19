package com.example.app.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val LightColors = lightColorScheme(
    primary = Color(0xFF6750A4),
    secondary = Color(0xFF625B71),
    tertiary = Color(0xFF7D5260),
    error = Color(0xFFB3261E),
    background = Color(0xFFFFFBFE),
    onBackground = Color(0xFF1A1B1E),
    surface = Color(0xFFFFFBFE),
    onSurface = Color(0xFF1A1B1E)
)

val DarkColors = darkColorScheme(
    primary = Color(0xFFD0BCFF),
    secondary = Color(0xFFCCC2DC),
    tertiary = Color(0xFFEFB8C8),
    error = Color(0xFFF2B8B5),
    background = Color(0xFF1A1B1E),
    onBackground = Color(0xFFE6E1E5),
    surface = Color(0xFF1A1B1E),
    onSurface = Color(0xFFE6E1E5)
)