package com.study.builder_pattern

/**
 * 宝马创建者
 */
class BMWBuilder : CarBuilder() {
    var bmw = BMWModel()

    override fun setSequence(sequence: ArrayList<String>) {
        bmw.sequence = sequence
    }

    override fun getCarModel(): CarModel {
        return this.bmw
    }

}