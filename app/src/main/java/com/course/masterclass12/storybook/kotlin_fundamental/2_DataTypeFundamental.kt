package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * Variables and difference between val and var
 */

fun main () {
    val name = "Lukman"                                 // this is variable type String -- Is Alphabet
    val age = 23                                        // this is variable type Int -- Familiar with number
    //val weight = 50.3F                                  // this is variable type float -- Familiar with dot and F
    //val height = 165.3                                  // this is variable type double -- Familiar with dot
    //val blood = 'O'                                     // this is variable type Char -- Only one Character

    //val fileByte: Byte = 13                             // this is primitive variable Type Byte with 8 Bit Signed Integer
    //val exampleShortType: Short = 125                   // this is primitive variable Type Short with 16 Bit Signed Integer
    //val exampleLongType: Long = 367_406_220_798_000_4   // this is variable Long for Epoch, CreditCard Digit, etc...

    /**
     * Learning of DataType Boolean(true/false)
     */
    var isHandsome = false                              // in meaning is handsome is false.
    // TODO: Alright i want to be handsome!
    if (name == "Lukman" && age == 23) {
        isHandsome = true
    }

    if (isHandsome) {
        println("Yeah $isHandsome Im Handsome!")
    } else {
        println("Oh no Im not Handsome :(")
    }

    /**
     * Example for Char!
     */
    val aiueo = "AIUEO"
    println("first character is : ${aiueo[0]}")

    val iWantLastCharacter = aiueo[aiueo.length.minus(1)]
    println("I Want Last Character : $iWantLastCharacter")

}

/**
 * Knowledge of Comments
 */

// This is basic comments

// TODO : This is Comments for functionality with todo tasks.

/*
This is Custom Comments, with new line, Like this
* here new line 1
* here new line 2
* here new line 3
*/

/**
 * This is Comments i Like hehehe
 */