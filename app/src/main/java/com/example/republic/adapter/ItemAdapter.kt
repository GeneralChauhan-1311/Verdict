package com.example.republic.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.republic.R
import com.example.republic.modelclasses.Affirmation


class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private var liked=false
    private var disliked=false

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val likeView: ImageView = view.findViewById(R.id.likeicon)
        val dislikeView:ImageView = view.findViewById(R.id.dislikeicon)
        val shareButton: ImageView = view.findViewById(R.id.share)
        val saveButton: ImageView = view.findViewById(R.id.saveicon)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(
            R.layout.first_page,
            parent,
            false
        )
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.imageView.setOnClickListener{

        }
        holder.likeView.setOnClickListener{
            if(!liked ) {
                holder.likeView.setImageResource(R.drawable.ic_baseline_thumb_up_24)
                holder.dislikeView.setImageResource(R.drawable.ic_outline_thumb_down_24)
                Toast.makeText(holder.likeView.getContext(), "LIKED !", Toast.LENGTH_SHORT).show()
                 liked = true
            }
            else {
                holder.likeView.setImageResource(R.drawable.ic_outline_thumb_up_24)
                Toast.makeText(holder.likeView.getContext(), "LIKE REMOVED !", Toast.LENGTH_SHORT).show()
                 liked = false
            }
        }
        holder.dislikeView.setOnClickListener{
            if(!disliked ) {

                holder.dislikeView.setImageResource(R.drawable.ic_baseline_thumb_down_24)
                holder.likeView.setImageResource(R.drawable.ic_outline_thumb_up_24)
                Toast.makeText(holder.dislikeView.getContext(), "DISLIKED !", Toast.LENGTH_SHORT).show()
                disliked = true
            }
            else {
                holder.dislikeView.setImageResource(R.drawable.ic_outline_thumb_down_24)
                Toast.makeText(holder.dislikeView.getContext(), "DISLIKE REMOVED !", Toast.LENGTH_SHORT).show()
                disliked = false
            }
        }
        holder.saveButton.setOnClickListener{
            Toast.makeText(holder.saveButton.getContext(), "Database Under Development", Toast.LENGTH_SHORT).show()


        }
        holder.shareButton.setOnClickListener{
            Toast.makeText(holder.shareButton.getContext(), "Sharing Activity is Under Development", Toast.LENGTH_SHORT).show()
            //val text= view.findViewById(R.id.item_title)
            //val intent= Intent()
            //intent.action=Intent.ACTION_SEND
            //intent.putExtra(Intent.EXTRA_TEXT,text)
            //intent.type="text/plain"


        }
        //holder.textView.text = item.toString()
        holder.imageView.setOnClickListener{
            Toast.makeText(holder.imageView.getContext(), "Detail and Comment Activity is Under Development", Toast.LENGTH_SHORT).show()
            //val context = holder.textView.context
            //val intent = Intent(context, SecondActivity::class.java)
            //intent.putExtra(SecondActivity.text, holder.textView.text.toString())
            //context.startActivity(intent)

            //or

            //context
        }




    }

    override fun getItemCount(): Int {
        return dataset.size
    }



}
