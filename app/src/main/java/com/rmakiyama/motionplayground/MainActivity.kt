package com.rmakiyama.motionplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commitNow
import com.rmakiyama.motionplayground.databinding.ActivityMainBinding
import com.rmakiyama.motionplayground.ui.playgroundlist.PlaygroundListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.commitNow {
                replace(R.id.container, PlaygroundListFragment())
            }
        }
    }
}
