package jp.classmethod.githubapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wada811.databinding.dataBinding
import jp.classmethod.githubapp.R
import jp.classmethod.githubapp.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val viewModel: MainViewModel by viewModel()
    val binding by dataBinding<ActivityMainBinding>(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
        binding.submitBtn.setOnClickListener {
            viewModel.fetch()
        }
    }
}



