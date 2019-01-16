package com.study.abstract_factory

import com.study.factory_pattern.EnglishTeacher

class MaleEnglishTeacher : EnglishTeacher() {
    override fun sex() {
        println("男性英语老师")
    }

}