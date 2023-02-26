package com.example.clonedroidknights2020.binding

import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.clonedroidknights2020.data.Sponsor
import com.example.clonedroidknights2020.ui.home.HomeAdapter
import com.example.clonedroidknights2020.ui.home.HomeViewModel
import com.example.clonedroidknights2020.ui.home.SponsorAdapter
import com.example.clonedroidknights2020.ui.home.SponsorItemDecoration
import com.example.clonedroidknights2020.ui.model.UiHomeModel
import com.example.clonedroidknights2020.util.clearItemDecoration

@BindingAdapter("homeVm", "homeItems")
fun RecyclerView.bindHome(vm: HomeViewModel, items: List<UiHomeModel>?) {
    if (items?.isNotEmpty() == true) {
        isVisible = true
        adapter = HomeAdapter(vm, items)
    } else {
        isGone = true
    }
}

@BindingAdapter("sponsors")
fun RecyclerView.bindSponsors(items: List<Sponsor>?) {
    if (items?.isNotEmpty() == true) {
        isVisible = true
        adapter = SponsorAdapter(items)
        clearItemDecoration()
        addItemDecoration(SponsorItemDecoration())
    } else {
        isGone = true
    }
}

@BindingAdapter("sponsorLogo")
fun ImageView.bindSponsorLogo(@DrawableRes imageResId: Int?) {
    Glide.with(this)
        .load(imageResId)
        .into(this)
}

@BindingAdapter("isActiveEvent")
fun ImageView.isActiveEvent(_isActivated: Boolean?) {
    this.isActivated = _isActivated ?: false
}