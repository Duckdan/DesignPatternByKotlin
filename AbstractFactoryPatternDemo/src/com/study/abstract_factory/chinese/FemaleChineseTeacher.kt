package com.study.abstract_factory

import com.study.factory_pattern.ChineseTeacher

class FemaleChineseTeacher : ChineseTeacher() {
    override fun sex() {
        println("女性语文老师")
    }

}