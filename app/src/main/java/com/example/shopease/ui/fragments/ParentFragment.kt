package com.example.shopease.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.shopease.ui.activities.ParentViewModel
import com.example.shopease.utils.HelperMethods

abstract class ParentFragment<DB: ViewDataBinding, VM: ParentViewModel<*>>: Fragment() {

    lateinit var viewModel: VM
    lateinit var viewDataBinding: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = this.initViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.viewDataBinding = DataBindingUtil.inflate(
            inflater,
            this.getLayoutId(),
            container,
            false
        )

        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.initLiveData()
    }

    private fun initLiveData() {
        viewModel.toastLiveData.observe(viewLifecycleOwner) {
            HelperMethods.makeToast(context, it)
        }
    }

    abstract fun getLayoutId(): Int
    abstract fun initViewModel(): VM

}