package com.course.masterclass12.storybook

/**
 * While Statement
 */

fun main() {
    for(i in 1 until 10 step 2) {
        print("$i ")
    }

    println("==================================================================")

    var xy = 100

    while (xy >= 0) {
        print("$xy ")
        xy--
    }
    println(" \nWhile Loop is Done!")

    println("==================================================================")

    // DO While Loops Example
    println("Below is Example do While")
    var number = 1

    do {
        print("$number ")
        number++
    } while (number <= 10)

    println()
    println("==================================================================")

    // while with more condition
    println("Below is Example custom while statement")

    var feltTemp = "cold"
    var roomTemp = 10

    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }
}