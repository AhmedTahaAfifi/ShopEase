package com.example.shopease.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.shopease.utils.HelperMethods

abstract class ParentActivity<DB: ViewDataBinding, VM: ParentViewModel<*>>: AppCompatActivity() {

    lateinit var viewModel: VM
    lateinit var viewDataBinding: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.viewDataBinding = DataBindingUtil.setContentView(this, this.getLayoutId())
        this.viewModel = this.initViewModel()
    }

    abstract fun getLayoutId(): Int
    abstract fun initViewModel(): VM
}