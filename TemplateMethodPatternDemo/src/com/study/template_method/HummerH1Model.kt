package com.study.template_method

class HummerH1Model : HummerModel() {
    override fun start() {
        println("悍马H1正在启动....")
    }

    override fun stop() {
        println("悍马H1正在停止....")
    }

    override fun alarm() {
        println("悍马H1发出警报....")
    }

    override fun engineBoom() {
        println("悍马H1引擎发出轰鸣声....")
    }

}