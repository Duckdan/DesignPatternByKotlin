package com.study.single_instance

fun main(args: Array<String>) {
    val president1 = President.getInstance()
    val president2 = President.getInstance()
    val president3 = President.getInstance()
    president1.systemOut()
    president2.systemOut()
    president3.systemOut()

    val presidentJava1 = PresidentJava.instance
    val presidentJava2 = PresidentJava.instance
    val presidentJava3 = PresidentJava.instance
    presidentJava1.systemOut()
    presidentJava2.systemOut()
    presidentJava3.systemOut()
}