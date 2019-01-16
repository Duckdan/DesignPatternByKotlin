package com.study.abstract_factory

import com.study.factory_pattern.MathTeacher

class MaleMathTeacher : MathTeacher() {
    override fun sex() {
        println("女性数学老师")
    }

}