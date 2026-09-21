package com.example.pertemuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.pertemuan3.ui.screen.DaftarProdukScreen
import com.example.pertemuan3.ui.theme.MFathangamingTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MFathangamingTheme {
                DaftarProdukScreen()
            }
        }
    }
}
