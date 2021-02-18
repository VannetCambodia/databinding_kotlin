package com.vannet.databindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.vannet.databindingkotlin.databinding.ActivityMainBinding
import com.vannet.databindingkotlin.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val user = User("Veng Vannet",21)
        binding.setVariable(BR.user,user)
        binding.executePendingBindings()
    }
}