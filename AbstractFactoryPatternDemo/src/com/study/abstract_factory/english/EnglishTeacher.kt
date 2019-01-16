package com.study.factory_pattern

import com.study.abstract_factory.Teacher

abstract class EnglishTeacher : Teacher {
    override fun teachClass(teacherName: String) {
        println("${teacherName}是教英语的老师${this}")
    }

}