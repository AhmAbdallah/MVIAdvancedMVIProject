package com.example.mviproject

sealed class MainIntent {
    object  AddNumber: MainIntent()
    object  SubtractNumber: MainIntent()
}