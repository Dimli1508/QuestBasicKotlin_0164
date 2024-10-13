package com.example.pertemuan2
fun withoutParameter() {
    println("=== withoutParameter ===")
    println("Hello, World!")
}
fun withParameter(name: String) {
    println()
    println("=== withParameter ===")
    println("Hello, $name!")
}


// named argument
// named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("=== withNamedArgument ===")
    println("Hello, $name! You are $age years old.")
}

// default parameter value
// degault parameter value merupakan cara untuk memeberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = " Indra", age: Int) {
    println()
    println("=== withDefaultParameter ===")
    println("Hello, $name! You are $age years old")
}

fun withReturn(panjang : Int, lebar : Int) : {
    return println(panjang * lebar)
}

fun withReturn1(panjang : Int, lebar : Int) : Int {
    return (panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}