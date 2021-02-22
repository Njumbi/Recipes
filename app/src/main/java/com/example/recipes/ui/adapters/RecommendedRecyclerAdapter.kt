package com.example.recipes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.R
import kotlinx.android.synthetic.main.recommended_item.view.*

class RecommendedRecyclerAdapter :
    RecyclerView.Adapter<RecommendedRecyclerAdapter.RecyclerViewModel>() {
    class RecyclerViewModel(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewModel {
        return RecyclerViewModel(
            LayoutInflater.from(parent.context).inflate(R.layout.recommended_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewModel, position: Int) {
        holder.itemView.rec_image.setImageResource(R.drawable.muffin)
        holder.itemView.rec_meal.text = "Breakfast"
        holder.itemView.rec_title.text = "Blueberry muffins"
        holder.itemView.rec_calories.text = "160 calories"
        holder.itemView.rec_time.text = "15 min"
        holder.itemView.rec_serving.text = "1 serving"

    }

    override fun getItemCount(): Int {
        return 10
    }
}