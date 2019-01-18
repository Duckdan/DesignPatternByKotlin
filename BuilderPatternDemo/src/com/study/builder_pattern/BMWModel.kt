package com.study.builder_pattern

class BMWModel : CarModel() {
    override fun start() {
        println("宝马车启动....")
    }

    override fun stop() {
        println("宝马车停止....")
    }

    override fun alarm() {
        println("宝马车报警....")
    }

    override fun engineBoom() {
        println("宝马车引擎发动....")
    }

}