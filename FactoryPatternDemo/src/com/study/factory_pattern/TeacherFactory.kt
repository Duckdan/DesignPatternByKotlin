package com.study.factory_pattern

import java.util.*

/**
 * 教师工厂，工厂方法模式
 */
class TeacherFactory {

    companion object {
        /**
         * 延迟初始化，避免创建过多对象
         */
        private var teachers = mutableMapOf<String, Teacher>()
        fun createTeacher(clazz: Class<*>): Teacher {
            lateinit var teacher: Teacher
            if (teachers.containsKey(clazz.simpleName)) {
                teacher = teachers[clazz.simpleName] as Teacher
            } else {
                teacher = Class.forName(clazz.name).newInstance() as Teacher
                teachers[clazz.simpleName] = teacher
            }
            return teacher
        }

        fun createTeacher(): Teacher {
            val concreteTeacherList = ClassUtils.getAllClassByInterface(Teacher::class.java)
            var random = Random()
            val rand = random.nextInt(concreteTeacherList.size)

            return createTeacher(concreteTeacherList[rand])
        }
    }
}