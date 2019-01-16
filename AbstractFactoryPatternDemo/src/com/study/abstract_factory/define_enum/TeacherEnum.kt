package com.study.abstract_factory.define_enum

sealed class TeacherEnum {
    //必须添加var修饰符
    //语文
    class FemaleChineseTeacherEnum(var className: String = "com.study.abstract_factory.FemaleChineseTeacher") : TeacherEnum()

    class MaleChineseTeacherEnum(var className: String = "com.study.abstract_factory.MaleChineseTeacher") : TeacherEnum()
    //数据
    class FemaleMathTeacherEnum(var className: String = "com.study.abstract_factory.FemaleMathTeacher") : TeacherEnum()

    class MaleMathTeacherEnum(var className: String = "com.study.abstract_factory.MaleMathTeacher") : TeacherEnum()
    //英语
    class FemaleEnglishTeacherEnum(var className: String = "com.study.abstract_factory.FemaleEnglishTeacher") : TeacherEnum()

    class MaleEnglishTeacherEnum(var className: String = "com.study.abstract_factory.MaleEnglishTeacher") : TeacherEnum()
}

/**
 * 只有全部写完时，when才不会报错
 */
fun exec(teacherEnum: TeacherEnum): String = when (teacherEnum) {
    is TeacherEnum.FemaleChineseTeacherEnum -> teacherEnum.className
    is TeacherEnum.MaleChineseTeacherEnum -> teacherEnum.className


    is TeacherEnum.FemaleMathTeacherEnum -> teacherEnum.className
    is TeacherEnum.MaleMathTeacherEnum -> teacherEnum.className

    is TeacherEnum.FemaleEnglishTeacherEnum -> teacherEnum.className
    is TeacherEnum.MaleEnglishTeacherEnum -> teacherEnum.className
}