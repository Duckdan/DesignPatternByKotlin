package com.study.abstract_factory

/**
 * 老师工厂
 */
interface TeacherFactory {
    /**
     * 创建语文老师
     */
    fun createChineseTeacher(): Teacher

    /**
     * 创建英语老师
     */
    fun createEnglistTeacher(): Teacher

    /**
     * 创建数学老师
     */
    fun createMathTeacher(): Teacher
}