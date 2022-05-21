package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * Function - Parameters - Arguments and Return - Exercise Included
 */

fun main() {
    myFunction()
    val inputAddUp = addUp(1,1)
    println("[ Function addUp ]")
    println("result or Output in func addUp is : $inputAddUp")

    val inputAddDouble = addDouble(12.5, 12.5)
    println("[ Function addDouble ]")
    println("result or Output in func addDouble is : $inputAddDouble")
}

// Parameter input
fun addUp(a: Int, b: Int) : Int {

    // Output from input
    return a + b
}

// Parameter with another data types
fun addDouble(a: Double, b: Double) : Double {
    return ( a + b ) / 2
}

fun myFunction() {
    println("Function ku dipanggil \n")
}