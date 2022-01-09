package com.mrlight515.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mrlight515.affirmation.adapter.ItemAdapter
import com.mrlight515.affirmation.data.Datasource
import com.mrlight515.affirmation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.apply {

            itemAdapter = ItemAdapter(this@MainActivity, Datasource().loadAffirmations())
            adapter = itemAdapter
            //layoutManager = GridLayoutManager(this@MainActivity,2)
            binding.recyclerView.adapter = adapter
            setHasFixedSize(true)
        }
    }
}