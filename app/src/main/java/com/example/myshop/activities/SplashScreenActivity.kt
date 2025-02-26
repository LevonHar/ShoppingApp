package com.example.myshop.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myshop.R
import com.example.myshop.databinding.ActivitySplashScreenBinding
import com.example.myshop.databinding.FragmentAccountOptionsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvAppName.alpha = 0f
        binding.imageView3.alpha = 0f

        binding.imageView3.animate().setDuration(3000).alpha(1f).withEndAction {
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        }
        binding.tvAppName.animate().setDuration(3000).alpha(1f).withEndAction {
            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            val intent = Intent(this, LoginRegisterActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        }
    }
}