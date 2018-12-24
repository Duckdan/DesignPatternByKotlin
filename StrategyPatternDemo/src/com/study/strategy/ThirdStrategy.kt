package com.study.strategy

class ThirdStrategy : IStrategy {
    override fun operate(str: String) {
        println("第三个操作策略是:$str")
    }

}