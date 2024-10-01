package com.example.shopease.ui.activities.auth

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.shopease.R
import com.example.shopease.databinding.ActivityAuthBinding
import com.example.shopease.ui.activities.ParentActivity

class AuthActivity : ParentActivity<ActivityAuthBinding, AuthViewModel>(), Navigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(viewDataBinding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //this.setupNavController()
    }

    /*private fun setupNavController() {
        this.setSupportActionBar(null)
        supportFragmentManager.findFragmentById(viewDataBinding.fragmentContainer.id) as NavHostFragment
    }*/

    override fun getActivity(): AuthActivity {
        return this
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_auth
    }

    override fun initViewModel(): AuthViewModel {
        return ViewModelProvider(this)[AuthViewModel::class.java]
    }
}