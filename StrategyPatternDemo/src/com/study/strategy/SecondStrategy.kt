package com.study.strategy

class SecondStrategy:IStrategy{
    override fun operate(str: String) {
        println("第二个操作策略是:$str")
    }
}