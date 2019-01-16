package com.study.abstract_factory.factory

import com.study.abstract_factory.Teacher
import com.study.abstract_factory.define_enum.TeacherEnum

class FeFemaleTeacherFactory : TeacherFactoryImpl() {
    override fun createChineseTeacher(): Teacher {
        return createTeacher(TeacherEnum.FemaleChineseTeacherEnum())
    }

    override fun createEnglistTeacher(): Teacher {
        return createTeacher(TeacherEnum.FemaleEnglishTeacherEnum())
    }

    override fun createMathTeacher(): Teacher {
        return createTeacher(TeacherEnum.FemaleMathTeacherEnum())
    }

}