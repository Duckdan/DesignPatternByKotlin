package com.study.factory_pattern

class MathTeacher:Teacher{
    override fun teachClass(teacherName: String) {
        println("${teacherName}是数学老师${this}")
    }

}