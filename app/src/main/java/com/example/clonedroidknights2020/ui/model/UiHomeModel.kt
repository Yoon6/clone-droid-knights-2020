package com.example.clonedroidknights2020.ui.model

import com.example.clonedroidknights2020.data.EventHistory
import com.example.clonedroidknights2020.data.Sponsor

sealed class UiHomeModel {
    data class Header(val sponsor: List<Sponsor>) : UiHomeModel()
    data class History(val history: EventHistory) : UiHomeModel()
}