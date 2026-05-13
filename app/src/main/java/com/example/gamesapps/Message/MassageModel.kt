package com.example.gamesapps.Message

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gamesapps.R

data class MessageModel(
    val senderName: String,
    val messageText: String,
    val avatarUrl: String
)