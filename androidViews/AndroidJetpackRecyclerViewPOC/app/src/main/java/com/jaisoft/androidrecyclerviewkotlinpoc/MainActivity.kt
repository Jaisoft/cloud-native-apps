package com.jaisoft.androidrecyclerviewkotlinpoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val mWordList = LinkedList<String>()
    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: WordListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            val wordListSize = mWordList.size
            // Add a new word to the wordList.
            mWordList.addLast("+ Word $wordListSize")
            // Notify the adapter, that the data has changed.
            mRecyclerView!!.adapter!!.notifyItemInserted(wordListSize)
            // Scroll to the bottom.
            mRecyclerView!!.smoothScrollToPosition(wordListSize)
    }

        // Put initial data into the word list.
        for (i in 0..19) {
            mWordList.addLast("Word $i")
        }

        // Create recycler view.
        mRecyclerView = findViewById(R.id.recyclerview)

        // Create an adapter and supply the data to be displayed.
        mAdapter = WordListAdapter(this, mWordList)

        // Connect the adapter with the recycler view.
        mRecyclerView!!.adapter = mAdapter

        // Give the recycler view a default layout manager.
        mRecyclerView!!.layoutManager = LinearLayoutManager(this)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
