package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * Variables and difference between val and var
 */
fun main() {
    // Example val for calling one variable
    val name = "Lukman"
    println("Hello $name")

    // Example var for calling more than one variable
    var count = 0
    for (i in count.rangeTo(9)) {
        count++
        print("$count ")
    }
}