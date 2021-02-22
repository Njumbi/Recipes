package com.example.recipes.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.R
import com.example.recipes.ui.adapters.RecipeFranchiseAdapter
import com.example.recipes.ui.adapters.RecommendedRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: RecipeFranchiseAdapter
    lateinit var recAdapter: RecommendedRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = RecipeFranchiseAdapter()
        recipes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recipes.adapter = adapter

        recAdapter = RecommendedRecyclerAdapter()
        recommended.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recommended.adapter = recAdapter

    }
}