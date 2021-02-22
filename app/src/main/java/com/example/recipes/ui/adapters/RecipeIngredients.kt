package com.example.recipes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.R
import kotlinx.android.synthetic.main.directions_item.view.*

class RecipeIngredients : RecyclerView.Adapter<RecipeIngredients.IngredientsViewModel>() {
    class IngredientsViewModel(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsViewModel {
        return IngredientsViewModel(
            LayoutInflater.from(parent.context).inflate(R.layout.directions_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: IngredientsViewModel, position: Int) {
        holder.itemView.recipeText.text =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna."
    }

    override fun getItemCount(): Int {
        return 10
    }
}