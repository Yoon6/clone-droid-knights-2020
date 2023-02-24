package com.example.clonedroidknights2020.ui.home

import android.os.Bundle
import android.view.View
import com.example.clonedroidknights2020.R
import com.example.clonedroidknights2020.base.BaseFragment
import com.example.clonedroidknights2020.databinding.FragmentHomeBinding
import com.example.clonedroidknights2020.util.eventObserve
import com.example.clonedroidknights2020.util.startOpenUrl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(
    R.layout.fragment_home,
    HomeViewModel::class.java
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initObserver()
    }

    private fun initObserver() {
//        binding.homeRecyclerView.addItemDecoration()
    }

    private fun initView() {
        viewModel.openHomePageEvent.eventObserve(viewLifecycleOwner) { url ->
            requireContext().startOpenUrl(url)
        }
    }
}