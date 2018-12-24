package com.study.strategy

class FirstStrategy : IStrategy {
    override fun operate(str: String) {
        println("第一个操作策略是:$str")
    }
}