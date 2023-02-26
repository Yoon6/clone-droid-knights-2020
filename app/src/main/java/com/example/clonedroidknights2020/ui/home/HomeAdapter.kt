package com.example.clonedroidknights2020.ui.home

import androidx.recyclerview.widget.DiffUtil
import com.example.clonedroidknights2020.R
import com.example.clonedroidknights2020.common.DataBindingAdapter
import com.example.clonedroidknights2020.data.EventHistory
import com.example.clonedroidknights2020.data.Sponsor
import com.example.clonedroidknights2020.ui.model.UiHomeModel

class HomeAdapter(viewModel: HomeViewModel, items: List<UiHomeModel>) :
    DataBindingAdapter<HomeItemModel>(DiffCallback(), viewModel) {


        private class DiffCallback : DiffUtil.ItemCallback<HomeItemModel>() {
            override fun areItemsTheSame(oldItem: HomeItemModel, newItem: HomeItemModel): Boolean {
                return when {
                    oldItem is HomeItemModel.Header && newItem is HomeItemModel.Header -> oldItem.sponsor == newItem.sponsor
                    oldItem is HomeItemModel.Item && newItem is HomeItemModel.Item -> oldItem.history == newItem.history
                    else -> false
                }
            }

            override fun areContentsTheSame(
                oldItem: HomeItemModel,
                newItem: HomeItemModel
            ): Boolean {
                return when {
                    oldItem is HomeItemModel.Header && newItem is HomeItemModel.Header -> oldItem == newItem
                    oldItem is HomeItemModel.Item && newItem is HomeItemModel.Item -> oldItem == newItem
                    else -> false
                }
            }
        }

    override fun getItemViewType(position: Int): Int {
        return when(getItem(position)) {
            is HomeItemModel.Header -> R.layout.item_home_history
            is HomeItemModel.Item -> R.layout.item_home_header
        }
    }
}

sealed class HomeItemModel {
    data class Header(val sponsor: List<Sponsor>) : HomeItemModel()
    data class Item(val history: EventHistory) : HomeItemModel()
}