package com.example.navigationandroid

import android.graphics.Color
import java.util.Random

fun Random.setRandomColor(): Int {
    val color = Color.argb(
        255, this.nextInt(256), this.nextInt(256), this.nextInt(256)
    )
    return color
}
