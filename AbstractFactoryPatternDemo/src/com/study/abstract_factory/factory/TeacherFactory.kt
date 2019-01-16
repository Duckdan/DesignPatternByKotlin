package com.study.abstract_factory.factory

import com.study.abstract_factory.Teacher
import com.study.abstract_factory.TeacherFactory
import com.study.abstract_factory.define_enum.TeacherEnum
import com.study.abstract_factory.define_enum.exec

abstract class TeacherFactoryImpl : TeacherFactory {
    protected fun createTeacher(teacherEnum: TeacherEnum): Teacher {
        lateinit var teacher: Teacher
        if (exec(teacherEnum) != "") {
            teacher = Class.forName(exec(teacherEnum)).newInstance() as Teacher
        }
        return teacher
    }
}