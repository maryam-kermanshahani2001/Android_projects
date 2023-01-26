package com.example.hw3.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw3.BookDetails
import com.example.hw3.ModelBook
import com.example.hw3.R


class ItemAdapter(private val context: Context, private val bookList: List<ModelBook>) :
    Adapter<ItemAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        /*get data, set data, handle click etc*/
        val model = bookList[position]
        val bookId = model.id
        val bookTitle = model.title
        val bookAuthor = model.author
        val resId = model.imgResource

        /*  val img = when(position) {
              1 -> R.drawable.sangjadoo
              2 -> R.drawable.asrar
              3 -> R.drawable.azkaban
              4 -> R.drawable.jam
              else -> R.drawable.sangjadoo
          }
  */

        holder.bookIv.setImageResource(resId)
        holder.titleTv.text = bookTitle
        holder.authorTv.text = bookAuthor

        holder.itemView.setOnClickListener {
            val intent = Intent(context, BookDetails::class.java)
            intent.putExtra("book", model)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return bookList.size
    }


    /*ViewHolder class row_book.xml*/
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //init UI components of list_item.xml
        var bookIv: ImageView = itemView.findViewById(R.id.bookJIv)
        var titleTv: TextView = itemView.findViewById(R.id.titleTv)
        var authorTv: TextView = itemView.findViewById(R.id.authorTv)

    }
}