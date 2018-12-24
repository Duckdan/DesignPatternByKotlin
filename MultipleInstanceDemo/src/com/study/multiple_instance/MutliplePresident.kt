package com.study.multiple_instance

import java.util.*

class MultiplePresident {


    private constructor()

    private constructor(info: String) : this() {
        presidentInfoList.add(info)
    }

    companion object {
        private var maxNumOfPresident: Int = 2
        private var presidentInfoList = arrayListOf<String>()
        private var presidentList = arrayListOf<MultiplePresident>()
        private var countNumOfPresident = 0

        /**
         * 初始化对象
         */
        init {
            for (i in 0..maxNumOfPresident) {
                presidentList.add(MultiplePresident("总${i}裁"))
            }
        }

        val instance: MultiplePresident
            /**
             * 获取相应实例
             */
            get() {
                var random = Random()
                countNumOfPresident = random.nextInt(maxNumOfPresident)
                return presidentList[countNumOfPresident]
            }
    }

    /**
     * 打印相应实例的数据
     */
    fun presidentInfo() {
        println(presidentInfoList[countNumOfPresident])
    }
}