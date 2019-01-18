package com.study.builder_pattern

class BenzModel : CarModel() {
    override fun start() {
        println("奔驰车启动....")
    }

    override fun stop() {
        println("奔驰车停止....")
    }

    override fun alarm() {
        println("奔驰车报警....")
    }

    override fun engineBoom() {
        println("奔驰车引擎发动....")
    }

}