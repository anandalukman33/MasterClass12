package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * String Interpolation - String Templates
 */

fun main() {
    val name = "Lukman"
    val age = 23

    // This is template string for calling just one variable
    println("Hi my name is $name")

    // This is template string for calling one variable with condition like this...
    println("Woah in a next month my age is ${age.plus(1)}")
}