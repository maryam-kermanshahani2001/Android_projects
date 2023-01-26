package com.example.hw3

import android.media.Image
import android.widget.ImageView

class ModelBook(
    var id: Int,
    var title: String,
    var author: String,
    var imgResource: Int,
    var publisher: String,
    var year: String,
    var summary: String
) : java.io.Serializable {

}