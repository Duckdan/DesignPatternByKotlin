package com.study.builder_pattern

fun main(args: Array<String>) {
    var sequence = arrayListOf<String>()

    sequence.add("engine boom")
    sequence.add("start")
    sequence.add("stop")

    var benzBuilder = BenzBuilder()
    benzBuilder.setSequence(sequence)
    val benz = benzBuilder.getCarModel()
    benz.run()

    var bmwBuilder = BMWBuilder()
    bmwBuilder.setSequence(sequence)
    val bmw = bmwBuilder.getCarModel()
    bmw.run()
}