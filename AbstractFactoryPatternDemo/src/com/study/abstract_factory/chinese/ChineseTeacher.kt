package com.study.factory_pattern

import com.study.abstract_factory.Teacher

abstract class ChineseTeacher: Teacher {
    override fun teachClass(teacherName: String) {
        println("${teacherName}是语文老师${this}")
    }

}