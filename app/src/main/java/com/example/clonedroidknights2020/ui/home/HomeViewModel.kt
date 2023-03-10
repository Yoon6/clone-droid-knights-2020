package com.example.clonedroidknights2020.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.clonedroidknights2020.R
import com.example.clonedroidknights2020.common.Event
import com.example.clonedroidknights2020.data.EventHistory
import com.example.clonedroidknights2020.data.Sponsor
import com.example.clonedroidknights2020.ui.model.UiHomeModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): ViewModel() {
    private val sponsors = listOf(
        Sponsor("toss", "https://toss.im/", R.drawable.ic_sponsor_toss),
        Sponsor("헤이딜러", "https://dealer.heydealer.com/", R.drawable.ic_sponsor_heydealer),
        Sponsor("카카오페이", "https://www.kakaopay.com/", R.drawable.ic_sponsor_kakaopay),
        Sponsor("vcnc", "https://tadacareer.vcnc.co.kr/", R.drawable.ic_sponsor_vcnc)
    )

    private val eventHistory = listOf(
        EventHistory(
            year = 2020,
            date = "2020년 9월 5일 Live",
            url = "https://droidknights.github.io/2020/",
            isActive = true
        ),
        EventHistory(
            year = 2019,
            date = "2019년 4월 05일",
            url = "https://droidknights.github.io/2019/"
        ),
        EventHistory(
            year = 2018,
            date = "2018년 4월 22일",
            url = "https://droidknights.github.io/2018/"
        ),
        EventHistory(
            year = 2017,
            date = "2017년 3월 25일",
            url = "https://droidknights.github.io/2017/"
        ),
    )

    private val _homeItems: MutableLiveData<List<UiHomeModel>> = MutableLiveData()
    val homeItems: LiveData<List<UiHomeModel>> get() = _homeItems

    private val _openHomePageEvent = MutableLiveData<Event<String>>()
    val openHomePageEvent: LiveData<Event<String>> get() = _openHomePageEvent

    init {
        val list = mutableListOf<UiHomeModel>()
        list.add(UiHomeModel.Header(sponsors))
        list.addAll(
            eventHistory.map {
                UiHomeModel.History(it)
            }
        )
        _homeItems.value = list
    }

    fun onClickEvent(item: HomeItemModel.Item) {
        if (item.history.url.isNotEmpty()) {
            _openHomePageEvent.value = Event(item.history.url)
        }
    }
}