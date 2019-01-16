package com.study.abstract_factory

import com.study.abstract_factory.factory.FeFemaleTeacherFactory
import com.study.abstract_factory.factory.MaleTeacherFactory

fun main(args: Array<String>) {
    //第一个工厂，男老师
    var maleTeacherFactory = MaleTeacherFactory()

    //第二个工厂，女老师
    val feFemaleTeacherFactory = FeFemaleTeacherFactory()

    val maleChineseTeacher = maleTeacherFactory.createChineseTeacher()
    maleChineseTeacher.teachClass("马云男")
    maleChineseTeacher.sex()

    val femaleChineseTeacher = feFemaleTeacherFactory.createChineseTeacher()
    femaleChineseTeacher.teachClass("马云女")
    femaleChineseTeacher.sex()
}
