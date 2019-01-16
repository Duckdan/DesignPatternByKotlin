package com.study.abstract_factory

import com.study.factory_pattern.MathTeacher

class FemaleMathTeacher : MathTeacher() {
    override fun sex() {
        println("女性数学老师")
    }

}