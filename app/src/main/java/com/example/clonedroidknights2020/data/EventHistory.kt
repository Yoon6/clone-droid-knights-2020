package com.example.clonedroidknights2020.data

data class EventHistory(
    val year: Int,
    val date: String,
    val url: String,
    val isActive: Boolean = false
)