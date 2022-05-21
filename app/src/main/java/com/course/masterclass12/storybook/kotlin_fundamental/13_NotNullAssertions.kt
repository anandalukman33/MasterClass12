package com.course.masterclass12.storybook.kotlin_fundamental

/**
 * Nullables - Elvis Operator - Not Null Assertions
 * Operator Elvis merupakan ?:
 */

fun main() {
    val name = "Lukman"
    val age = 21
    getName(name, age)
}

/**
 * Jadi tanda !! atau not null assertions maksudnya adalah
 * pada variabel tersebut dapat dipastikan 100% tidak akan null!
 * kalau masih ada kemungkinan null maka berikan ? atau berikan kondisi if ( variabel != null) { isi jika ada isi } else { isi kalau null }
 */
fun getName(name: String?, age: Int?) {
    if (name!!.isNotEmpty()) {
        name.uppercase()
        age!! + 1
    }
    println("Nama ku adalah $name umurku sekarang $age")
}