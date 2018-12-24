package com.study.multiple_instance

fun main(args: Array<String>) {
    var managerNum = 10
    for (i in 0..managerNum) {
        val instance = MultiplePresident.instance
        println("第${i}个面对的总经理$instance")
        instance.presidentInfo()
    }
}