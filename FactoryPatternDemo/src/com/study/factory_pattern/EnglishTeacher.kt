package com.study.factory_pattern

class EnglishTeacher:Teacher{
    override fun teachClass(teacherName: String) {
        println("${teacherName}是教英语的老师${this}")
    }

}