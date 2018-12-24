package com.study.single_instance

object PresidentJava {
    var presidentJava: PresidentJava? = null

    val instance: PresidentJava
        @Synchronized get() {
            if (presidentJava == null) {
                presidentJava = PresidentJava
            }
            return presidentJava!!
        }

    fun systemOut(){
        println(this)
    }
}
