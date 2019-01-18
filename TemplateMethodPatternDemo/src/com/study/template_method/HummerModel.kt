package com.study.template_method

abstract class HummerModel {
    var alarmFlag = false
    /**
     * 启动车辆
     */
    abstract fun start()

    /**
     * 停止车辆
     */
    abstract fun stop()

    /**
     * 滴滴叫
     */
    abstract fun alarm()

    /**
     * 发动机响声
     */
    abstract fun engineBoom()

    //暴露出方法，便于用户定义是否发出警报
    fun setAlarm(alarmFlag: Boolean) {
        this.alarmFlag = alarmFlag
    }

    fun isAlarm(): Boolean {
        return alarmFlag
    }

    /**
     * 运行方法，规定汽车启动步骤
     */
    fun run() {
        //先启动
        start()

        //引擎开始轰鸣
        engineBoom()

        if (isAlarm()) {
            //按喇叭
            alarm()
        }

        //到达目的地就停车
        stop()
    }

}