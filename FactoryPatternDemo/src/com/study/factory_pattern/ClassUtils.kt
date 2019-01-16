package com.study.factory_pattern

import java.io.File
import kotlin.test.assert

class ClassUtils {
    companion object {
        /**
         * 给一个接口，返回这个接口的所有实现类
         */
        fun getAllClassByInterface(clazz: Class<*>): List<Class<*>> {
            var returnClassList = arrayListOf<Class<*>>()
            //如果不是一个接口，则不做处理
            if (clazz.isInterface) {
                //反引号可以转移关键字
                val packageName = clazz.`package`.name
                val allClass = getClasses(packageName)
                for (it in allClass) {
                    if (clazz.isAssignableFrom(it)) {
                        if (clazz != it) {
                            returnClassList.add(it)
                        }
                    }
                }
            }

            return returnClassList
        }

        /**
         * 根据对应包名获得当前包下以及子包下的所有类
         */
        private fun getClasses(packageName: String): List<Class<*>> {
            val classLoader = Thread.currentThread().contextClassLoader
            val path = packageName.replace('.', '/')
            val resources = classLoader.getResources(path)
            val dirs = arrayListOf<File>()
            while (resources.hasMoreElements()) {
                val resource = resources.nextElement()
                dirs.add(File(resource.file))
            }
            val classes = arrayListOf<Class<*>>()
            for (it in dirs) {
                classes.addAll(findClasses(it, packageName))
            }
            return classes
        }

        /**
         * 根据对应包名查找当前包下以及子包下的所有类
         */
        private fun findClasses(directory: File, packageName: String): List<Class<*>> {
            var classes = arrayListOf<Class<*>>()
            directory.takeIf { it.exists() }?.run {
                val files = this.listFiles()
                for (it in files) {
                    //强转
                    if (it?.isDirectory!!) {
                        assert(!it.name.contains("."))
                        classes.addAll(findClasses(it, "$packageName.${it.name}"))
                    } else if (it?.name?.endsWith(".class")!!) {
                        classes.add(Class.forName("$packageName.${it.name.substring(0, it.name.length - 6)}"))
                    }
                }
                return classes
            } ?: return classes

        }
    }
}