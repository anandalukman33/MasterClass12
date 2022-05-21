package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * When State is my fav statement!
 */

const val seasonAnime = 2
const val month = 10
val x : Any = 22.98

fun main() {

    when (seasonAnime) {
        1 -> {
            println("Spring")
        }
        2 -> {
            println("Summer")
        }
        3 -> {
            println("Fall / Autumn")
        }
        4 -> {
            println("Winter")
        }
    }

    println("==============================================================")

    when (month) {
        in 3..5 -> {
            println("Spring")
        }
        in 6..8 -> {
            println("Summer")
        }
        in 9..11 -> {
            println("Fall")
        }
        12, 1, 2 -> {
            println("Winter")
        }
    }

    println("==============================================================")

    when(x) {
        is Int -> {
            println("$x is an Integer")
        }
        is Double -> {
            println("$x is a Double")
        }
        is String -> {
            println("$x is a String")
        }
        else -> {
            println("$x is none of the above")
        }
    }
}