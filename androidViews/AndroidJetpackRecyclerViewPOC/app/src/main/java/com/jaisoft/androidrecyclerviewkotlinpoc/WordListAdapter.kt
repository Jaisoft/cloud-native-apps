package com.jaisoft.androidrecyclerviewkotlinpoc

import android.content.Context
 import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import java.util.LinkedList

class WordListAdapter(context: Context, private val mWordList: LinkedList<String>) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    private val mInflater: LayoutInflater

    init {
        mInflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordListAdapter.WordViewHolder {
        // Inflate an item view.
        val mItemView = mInflater.inflate(
                R.layout.word_list_item, parent, false)
        return WordViewHolder(mItemView, this)
    }


    override fun onBindViewHolder(holder: WordListAdapter.WordViewHolder, position: Int) {
        // Retrieve the data for that position.
        val mCurrent = mWordList[position]
        // Add the data to the view holder.
        holder.wordItemView.text = mCurrent
    }


    override fun getItemCount(): Int {
        return mWordList.size
    }

    inner class WordViewHolder (itemView: View, val mAdapter: WordListAdapter) : RecyclerView.ViewHolder(itemView), View.OnClickListener {


        val wordItemView: TextView

        init {
            wordItemView = itemView.findViewById(R.id.word)
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            // Get the position of the item that was clicked.
            val mPosition = layoutPosition

            // Use that to access the affected item in mWordList.
            val element = mWordList[mPosition]
            // Change the word in the mWordList.

            mWordList[mPosition] = "Clicked! $element"
            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display the data.
            mAdapter.notifyDataSetChanged()
        }
    }
}