package com.study.template_method

/**
 * 模板方法模式：适合于流程式的事件处理
 */
fun main(args: Array<String>) {
    var h1 = HummerH1Model()
    h1.setAlarm(true)
    h1.run()

    var h2 = HummerH2Model()
    h2.run()
}