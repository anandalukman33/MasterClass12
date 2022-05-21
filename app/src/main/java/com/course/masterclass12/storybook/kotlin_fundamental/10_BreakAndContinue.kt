package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * Break and Continue in LOOP
 */

fun main() {
    for (i in 1 until 20) {

        println("$i ")
        if (i/2 == 5) {
            break
        }

//        if (i/2 == 5) {
//            continue
//        }
//        println("$i ")
    }
    println("Selesai Looping")
}