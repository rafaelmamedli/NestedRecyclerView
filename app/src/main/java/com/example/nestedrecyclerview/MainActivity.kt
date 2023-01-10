package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nestedrecyclerview.adapter.MainAdapter
import com.example.nestedrecyclerview.databinding.ActivityMainBinding
import com.example.nestedrecyclerview.utils.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            rvMain.adapter= MainAdapter(SampleData.collections)
        }
    }
}