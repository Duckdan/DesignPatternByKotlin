package com.study.facade_pattern

/**
 * 门面模式
 */
fun main(args: Array<String>) {
    var postOffice = PostOffice()

    postOffice.sendLetter("天道轮回上天可曾饶过谁","天堂人间")
}