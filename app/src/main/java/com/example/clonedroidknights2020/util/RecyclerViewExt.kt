package com.example.clonedroidknights2020.util

import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.clearItemDecoration() {
    repeat(itemDecorationCount) {
        removeItemDecorationAt(0)
    }
}