package com.example.clonedroidknights2020.ui.home

import com.example.clonedroidknights2020.data.EventHistory
import com.example.clonedroidknights2020.data.Sponsor

class HomeAdapter {
}

sealed class HomeItemModel {
    data class Header(val sponsor: List<Sponsor>) : HomeItemModel()
    data class Item(val history: EventHistory) : HomeItemModel()
}