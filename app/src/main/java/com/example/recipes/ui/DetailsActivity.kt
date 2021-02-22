package com.example.recipes.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipes.R
import com.example.recipes.ui.adapters.IngredientsRecyclerAdapter
import com.example.recipes.ui.adapters.RecipeFranchiseAdapter
import com.example.recipes.ui.adapters.RecipeIngredients
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : AppCompatActivity() {
    lateinit var adapter: IngredientsRecyclerAdapter
    lateinit var directionsAdapter: RecipeIngredients
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        adapter = IngredientsRecyclerAdapter()
        directionsAdapter = RecipeIngredients()
        rvIngredients.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvIngredients.adapter = adapter
        directions.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        directions.adapter = directionsAdapter
    }

    fun backArrow(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }
}