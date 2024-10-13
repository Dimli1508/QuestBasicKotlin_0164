package com.example.project1

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "Dimas@gmail.com")
    println(data)

    //fungsi equals
    val data2 = DataClass(1, "Luthfi@gmail.com")
    println(data == data2) //false

    //fungsi copy
    val data3 = data.copy()
    println(data3)

    //fungsi copy dengan perubahan
    val data4 = data.copy(email= "Islamy@gmail.com")
    println(data4)
}