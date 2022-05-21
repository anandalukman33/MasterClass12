package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * Comparison Operators
 * Operator == untuk menentukan nilai tersebut harus sama dengan nilai lawannya
 * Operator != untuk menentukan nilai tersebut tidak sama dengan nilai lawannya
 * Operator <  untuk menentukan nilai tersebut kurang dari nilai lawannya
 * Operator >  untuk menentukan nilai tersebut lebih dari nilai lawannya
 * Operator <= untuk menentukan nilai tersebut kurang dari sama dengan lawannya
 * Operator >= untuk menentukan nilai tersebut lebih dari sama dengan lawannya
 */

fun main() {
    val isFalse = 1==2 // value is False
    val isTrue = 1==1 // value is True

    val nameResultFalse = if (isFalse) { "Benar" } else { "Salah" }
    val nameResultTrue = if (isTrue) { "Benar" } else { "Salah" }

    println("Hasil dari 1==2 adalah $nameResultFalse (false)")
    println("Hasil dari 1==1 adalah $nameResultTrue (true)")

    println()

    // Example !=
    val elephant = "Elephant"
    val bird = "Bird"
    val result = if (elephant == bird) {
        "Not Elephant" // this is for value true
    } else {
        "Yes Elephant" // this is for value false
    }
    println(result)

    println()

    // Example < and >
    val brotherWeight = 50
    val sisterWeight = 70

    println("Question is who has the thinnest body weight?")
    val result2 = if (brotherWeight < sisterWeight) {
        "Brother is thinnest than sister"
    } else {
        "Sister is fattest than Brother"
    }
    println("Result is $result2")

    println()

    println("Question is who has the fattest body weight?")
    val result3 = if (brotherWeight > sisterWeight) {
        "Brother is thinnest than sister"
    } else {
        "Sister is fattest than Brother"
    }
    println("Result is $result3")



}