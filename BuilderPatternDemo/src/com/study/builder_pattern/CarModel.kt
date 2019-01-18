package com.study.builder_pattern

/**
 * 汽车模型
 */
abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    var sequence = arrayListOf<String>()

    /**
     * 模型启动开始跑了
     */
    abstract fun start()

    /**
     * 模型停止
     */
    abstract fun stop()

    /**
     * 喇叭响声
     */
    abstract fun alarm()

    /**
     * 发动机的轰鸣声
     */
    abstract fun engineBoom()



    fun run() {
        for (actionName in sequence) {
            when (actionName) {
                "start" -> this.start()
                "stop" -> this.stop()
                "alarm" -> this.alarm()
                "engine boom" -> this.engineBoom()
            }
        }
    }
}