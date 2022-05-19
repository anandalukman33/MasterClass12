package com.course.masterclass12.storybook

/**
 * For Statement for Loops Condition
 */

fun main () {

    for (index in 1..10) {
        print("$index ")
    }
    println()
    println("=====================================================")

    for (index in 1 until 10 step 2) {
        print("$index ")
    }

    // example jump 2 digit
    println()
    println("=====================================================")

    for (index in 10 downTo 1 step 2) {
        print("$index ")
    }

    // Exercise
    println()
    println("=====================================================")

    for (index in 1..10000) {
        print("$index ")
        if (index == 9001) {
            println("\nIt's Over 9000 \n")
        }
    }


    // Exercise
    println()
    println("=====================================================")

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }

}