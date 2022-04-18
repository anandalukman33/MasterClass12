package com.course.masterclass12.storybook

/**
 * Arithmetic Operators and why the type is important
 * plus = +
 * minus = -
 * times = *
 * div = /
 * rem = %  this is modulus
 */

fun main() {
    val mango = 22
    val banana = 10

    // manual plus
    val result1 = mango + banana
    println("My Fruit become $result1")

    // cool plus example
    var myMotherGiveMeTwoBanana = 2
    myMotherGiveMeTwoBanana += banana

    println("My Banana become $myMotherGiveMeTwoBanana because my Mother give me two Banana")

    // Cool times example
    var laptop = 1
    val fatherLaptop = 1

    laptop += fatherLaptop
    println("Count Laptop in My House is : $laptop")

    var long = 100
    val large = 2
    long *= large
    println("my house has an area of about $long meters")

    /**
     * Increment and Decrement Operator
     * Increment is ++
     * Decrement is --
     */

    println("How my age in Date Birthday?")
    var age = 22
    val month = "July"

    val birthday = if (month == "July") {
        ++age
        "Yes your age in July is $age"
    } else {
        age--
        "No Your age now is $age"
    }

    println(birthday)
}