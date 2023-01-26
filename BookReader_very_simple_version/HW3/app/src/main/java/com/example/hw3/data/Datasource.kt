package com.example.hw3.data

import android.content.Context
import com.example.hw3.BookData
import com.example.hw3.ModelBook
import com.example.hw3.R

class Datasource(private val context: Context) {
    /*fun loadBooks(): List<BookData> {
        return listOf<BookData>(
            BookData(R.string.stone_book),
            BookData(R.string.secret_book),
            BookData(R.string.prisoner_book),
            BookData(R.string.fire_book)
        )

    }*/

    /* fun getBookById(bookId:Int):ModelBook{
         var bookList = loadBooks()
         for (book in bookList) {
             if (book.id == bookId)
                 return book
         }

     }*/

    fun loadBooks(): List<ModelBook> {
        var summary1 = "This is a great book which about ..."
        var summary = "This is a great book which about ..."

//        val text:String = context.resources.getString(R.string.stone_book)
        val author: String = context.resources.getString(R.string.author)
        return listOf<ModelBook>(
            ModelBook(
                1,
                context.resources.getString(R.string.stone_book),
                author,
                R.drawable.sangjadoo,
                "Tandis",
                "2005",
                summary1
            ),
            ModelBook(
                2,
                context.resources.getString(R.string.secret_book),
                author,
                R.drawable.asrar,
                "Jangal",
                "2006",
                summary
            ),
            ModelBook(
                3,
                context.resources.getString(R.string.prisoner_book),
                author,
                R.drawable.azkaban,
                "Tandis",
                "2007",
                summary
            ),
            ModelBook(
                4,
                context.resources.getString(R.string.fire_book),
                author,
                R.drawable.jam,
                "Tandis",
                "2008",
                summary1
            ),
            ModelBook(
                5,
                context.resources.getString(R.string.phoenix_book),
                author,
                R.drawable.ghogh,
                "Jangal",
                "2008",
                summary
            ),
            ModelBook(
                6,
                context.resources.getString(R.string.blood_book),
                author,
                R.drawable.shah,
                "Tandis",
                "2008",
                summary
            ),
            ModelBook(
                7,
                context.resources.getString(R.string.yad_book),
                author,
                R.drawable.yad,
                "Tandis",
                "2008",
                summary
            ),
            ModelBook(
                8,
                context.resources.getString(R.string.fire_book),
                author,
                R.drawable.jam,
                "Tandis",
                "2008",
                summary
            )
        )

    }
}