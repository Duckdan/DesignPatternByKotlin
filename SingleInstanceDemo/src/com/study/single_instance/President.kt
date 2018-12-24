package com.study.single_instance

class President {
    private constructor()

    companion object {
        fun  getInstance(): President {
            return Holder.instance
        }
    }

    private object Holder {
        var instance = President()
    }

    fun systemOut(){
        println(this)
    }
}