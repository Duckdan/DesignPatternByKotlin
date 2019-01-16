package com.study.abstract_factory

import com.study.factory_pattern.ChineseTeacher

class MaleChineseTeacher:ChineseTeacher(){
    override fun sex() {
        println("男性语文老师")
    }

}