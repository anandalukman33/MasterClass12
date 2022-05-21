package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * Course of If Statement
 */

fun main() {

    val goku = 3045
    val vegeta = 3045

    // This statement very recommended with "when" condition
    if (goku > vegeta) {
        println("Goku is win!")
        // Vegeta is training for getting more power!
    } else if (goku == vegeta) {
        val vegito = goku + vegeta
        println("Goku and Vegeta with a power $vegeta is Fusion become Vegito with power $vegito")
    } else {
        println("Vegeta is Win!")
    }


    /**
     * Else if with many condition!
     */

    val goten = 3050
    val trunks = 3000
    val yamcha = 3001
    val kirin = 2999

    if (goten > trunks) {
        println("Goten is Win!")
    } else if (trunks > goten) {
        println("Trunks is Win!")
    } else if (yamcha > trunks) {
        println("Yamcha is Win!")
    } else if (yamcha > kirin) {
        println("Yamcha is Win!")
    } else {
        println("Trunks is Win!")
    }


    /**
     * If statement part 2
     */
    println("=======================================")

    val rain = true

    if (rain) {
        println("Yeah it's rain!")
    } else {
        println("What! are you crazy?")
    }

    println("=======================================")

    val name = "Lukman"

    println("Are you know Lukman?")

    if (name == "Lukman") {
        println("Yeah i know! he's my friend!")
    } else {
        println("i dunno know!")
    }

}