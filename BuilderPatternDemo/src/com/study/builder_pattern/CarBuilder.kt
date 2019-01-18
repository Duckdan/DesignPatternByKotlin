package com.study.builder_pattern

abstract class CarBuilder {

    /**
     * 设定顺序
     */
    abstract fun setSequence(sequence: ArrayList<String>)

    /**
     * 返回汽车模型
     */
    abstract fun getCarModel(): CarModel
}