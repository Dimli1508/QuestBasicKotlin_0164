package com.example.pam

class Motor()

class Contact(val id: Int, var email: String)

fun main () {
    val contact = Contact(1, "Dimas@gmail.com")

    // prints the value of of the property: email
    println(contact.email)

    // updates the value of the property: email
    contact.email = "Luthfi@gmail.com"

    //prints the new value of the property: email

    println(contact.email)

}