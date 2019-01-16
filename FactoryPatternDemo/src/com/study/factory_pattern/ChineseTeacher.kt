package com.study.factory_pattern

class ChineseTeacher:Teacher{
    override fun teachClass(teacherName: String) {
        println("${teacherName}是语文老师${this}")
    }

}