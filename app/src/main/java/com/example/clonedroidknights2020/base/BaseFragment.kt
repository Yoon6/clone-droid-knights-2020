package com.example.clonedroidknights2020.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.clonedroidknights2020.BR
import dagger.hilt.android.AndroidEntryPoint

open class BaseFragment<VM : ViewModel, B : ViewDataBinding>(
    @LayoutRes private val layoutResId: Int,
    private val viewModelClass: Class<VM>
) : Fragment(layoutResId) {

    protected val viewModel: VM by lazy {
        ViewModelProvider(this)[viewModelClass]
    }
    private lateinit var _binding: B
    protected val binding: B get() = _binding

    private fun <T: ViewDataBinding> bind(view: View): T = DataBindingUtil.bind(view)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = bind(view)
        with(binding) {
            setVariable(BR.vm, viewModel)
            lifecycleOwner = viewLifecycleOwner
        }
    }

}