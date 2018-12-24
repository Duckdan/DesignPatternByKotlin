package com.study.strategy

fun main(args: Array<String>) {
    var firstStrategy = FirstStrategy()
    var context1 = Context(firstStrategy)
    context1.operate("第一种策略")

    var secondStrategy = SecondStrategy()
    var context2 = Context(secondStrategy)
    context2.operate("第二种策略")

    var thirdStrategy = ThirdStrategy()
    var context3 = Context(thirdStrategy)
    context3.operate("第三种策略")
}