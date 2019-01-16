package com.study.factory_pattern

import com.study.abstract_factory.Teacher

abstract class MathTeacher: Teacher {
    override fun teachClass(teacherName: String) {
        println("${teacherName}是数学老师${this}")
    }

}