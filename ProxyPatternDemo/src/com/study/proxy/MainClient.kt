package com.study.proxy

fun main(args: Array<String>) {
    var starCompanyProxy1=StarCompanyProxy()
    starCompanyProxy1.singingMusic("中国话")

    var startCompanyProxy2=StarCompanyProxy(ZhangXueYou())
    startCompanyProxy2.singingMusic("东方红")
}