package com.example.pertemuan2

// Lambda Functions
// Lambda functions adalah fungsi yang tidak memiliki nama
// Lambda functions biasanya digunakan untuk membuat fungsi yang sederhana


fun uppercaseString(string: String): String {
    return string.uppercase()
}

// Dapat ditulis dalam ekspresi lambda sbb:
fun main() {
    uppercaseString("hello")
    println({string: String -> string.uppercase()} ("hello"))
    //HELLO
}