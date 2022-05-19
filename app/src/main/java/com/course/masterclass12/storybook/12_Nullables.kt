package com.course.masterclass12.storybook

/**
 * Nullabes in Kotlin
 * Null safe is --> ?
 * Example : val age : Int? = 0
 */

fun main() {
    val nameWithoutNullSafe = "Lukman"
    println(nameWithoutNullSafe)

    /**
     * aku mau jadikan variabel nameWithoutNullSafe menjadi null
     */
    //nameWithoutNullSafe = null

    /**
     * setter diatas terlihat ketika kita ingin menjadikan null tapi tidak ada nullsafenya
     * maka null tersebut akan diarahkan menjadi type data string.
     *
     * seharusnya pada variabel tersebut diberikan ? sebagai tanda null safe
     * seperti ini!
     */

    val nameWithNullSafe: String?
    nameWithNullSafe = null
    println(nameWithNullSafe)

    /**
     * Jadi variabel nameWithNullSafe diperbolehkan memiliki value null, karena ada nullSafenya
     */

}