package com.study.abstract_factory.factory

import com.study.abstract_factory.Teacher
import com.study.abstract_factory.define_enum.TeacherEnum

class MaleTeacherFactory : TeacherFactoryImpl() {
    override fun createChineseTeacher(): Teacher {
        return createTeacher(TeacherEnum.MaleChineseTeacherEnum())
    }

    override fun createEnglistTeacher(): Teacher {
        return createTeacher(TeacherEnum.MaleEnglishTeacherEnum())
    }

    override fun createMathTeacher(): Teacher {
        return createTeacher(TeacherEnum.MaleMathTeacherEnum())
    }

}