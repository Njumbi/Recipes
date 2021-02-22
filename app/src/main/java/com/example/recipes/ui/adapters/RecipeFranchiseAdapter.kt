package com.example.recipes.ui.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.R
import com.example.recipes.ui.DetailsActivity
import kotlinx.android.synthetic.main.recipe_item.view.*


class RecipeFranchiseAdapter : RecyclerView.Adapter<RecipeFranchiseAdapter.RecipeViewModel>() {

    class RecipeViewModel(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewModel {
        return RecipeViewModel(
            LayoutInflater.from(parent.context).inflate(R.layout.recipe_item, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecipeViewModel, position: Int) {


        holder.itemView.image.setImageResource(R.drawable.image)
        holder.itemView.title.text = "French Toast with Berries"
        holder.itemView.meal.text = "Breakfast"
        holder.itemView.time.text = "10 min"
        holder.itemView.serve.text = "2 serving"
        holder.itemView.calories.text = "120 calories"

        holder.itemView.title.setOnClickListener {
            val context = holder.itemView.title.context
            val intent = Intent(context, DetailsActivity::class.java)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return 10
    }
}