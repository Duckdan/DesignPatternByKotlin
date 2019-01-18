package com.study.builder_pattern

/**
 * 奔驰创建者
 */
class BenzBuilder : CarBuilder() {
    var benz = BenzModel()

    override fun setSequence(sequence: ArrayList<String>) {
        benz.sequence = sequence
    }

    override fun getCarModel(): CarModel {
        return this.benz
    }

}