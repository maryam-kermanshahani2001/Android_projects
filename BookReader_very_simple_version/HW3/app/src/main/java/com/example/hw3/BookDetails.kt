package com.example.hw3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts
import android.widget.TextView

class BookDetails : AppCompatActivity() {

    /*private var bookId: Int = -1
    private var bookTitle: String = ""
    private var author: String = ""
    private var imgResource: Int = -1*/


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        val book = intent.getSerializableExtra("book") as? ModelBook

        val bookNameTv :TextView = findViewById(R.id.bookNameDetailTv)
        bookNameTv.text = book!!.title.toString()

        val authorDetailTv :TextView = findViewById(R.id.authorDetailTv)
        authorDetailTv.text = book.author.toString()

        val publisherNameTv :TextView = findViewById(R.id.publisherNameTv)
        publisherNameTv.text = book.publisher

        val publishYearTv :TextView = findViewById(R.id.publishYearTv)
        publishYearTv.text = book.year

        val summaryTv :TextView = findViewById(R.id.summaryTv)
        summaryTv.text = book.summary

    }
}