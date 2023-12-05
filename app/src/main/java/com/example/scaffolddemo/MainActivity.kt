package com.example.scaffolddemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.scaffolddemo.ui.screens.ScaffoldDemo
import com.example.scaffolddemo.ui.theme.ScaffoldDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScaffoldDemoTheme {
                ScaffoldDemo()
            }
        }
    }
}