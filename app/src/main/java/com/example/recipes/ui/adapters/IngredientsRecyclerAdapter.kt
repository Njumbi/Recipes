package com.example.recipes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.R
import kotlinx.android.synthetic.main.ingredients.view.*

class IngredientsRecyclerAdapter :
    RecyclerView.Adapter<IngredientsRecyclerAdapter.RecyclerViewModel>() {
    class RecyclerViewModel(view: View) : RecyclerView.ViewHolder(view)

    private var data = arrayListOf(
        R.drawable.flour,
        R.drawable.berries,
        R.drawable.eggs,
        R.drawable.butter,
        R.drawable.strawberry,
        R.drawable.water
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewModel {
        return RecyclerViewModel(
            LayoutInflater.from(parent.context).inflate(R.layout.ingredients, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewModel, position: Int) {
        holder.itemView.ingredient.setImageResource(data[position])

    }

    override fun getItemCount(): Int {
        return 10
    }
}