package com.study.template_method

class HummerH2Model : HummerModel() {
    override fun start() {
        println("悍马H2正在启动....")
    }

    override fun stop() {
        println("悍马H2正在停止....")
    }

    override fun alarm() {
        println("悍马H2发出警报....")
    }

    override fun engineBoom() {
        println("悍马H2引擎发出轰鸣声....")
    }

}