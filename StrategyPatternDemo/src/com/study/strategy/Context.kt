package com.study.strategy

/**
 * 根据Android开发环境，使用Context来命名装策略的容器
 */
class Context(strategy: IStrategy) {
    var strategy = strategy

    fun operate(string: String) {
        strategy.operate("context的环境::$string")
    }

}