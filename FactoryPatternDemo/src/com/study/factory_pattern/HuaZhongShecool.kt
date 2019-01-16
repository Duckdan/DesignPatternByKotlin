package com.study.factory_pattern

fun main(args: Array<String>) {
    val chineseTeacher = TeacherFactory.createTeacher(ChineseTeacher::class.java)
    chineseTeacher.teachClass("马云")

    val mathTeacher = TeacherFactory.createTeacher(MathTeacher::class.java)
    mathTeacher.teachClass("马化腾")

    val englishTeacher = TeacherFactory.createTeacher(EnglishTeacher::class.java)
    englishTeacher.teachClass("")

    val chineseTeacher1 = TeacherFactory.createTeacher(ChineseTeacher::class.java)
    chineseTeacher1.teachClass("中国马云")

    for (i in 1..10) {
        val teacher = TeacherFactory.createTeacher()
        teacher.teachClass("${i}马云老师")
    }
}