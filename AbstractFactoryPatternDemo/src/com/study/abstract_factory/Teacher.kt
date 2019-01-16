package com.study.abstract_factory

/**
 * 定义老师的接口
 */
interface Teacher {
    /**
     * 教授课程
     */
    fun teachClass(teacherName: String)

    fun sex()
}