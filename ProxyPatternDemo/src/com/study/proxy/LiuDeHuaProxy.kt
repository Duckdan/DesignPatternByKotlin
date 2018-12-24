@file:JvmName("StarCompanyProxy")
package com.study.proxy

class StarCompanyProxy : StarCompany {

    var starCompany: StarCompany

    /**
     * 默认就是刘德华
     */
    constructor(){
        starCompany=LiuDeHua()
    }


    constructor(starCompany: StarCompany) : this() {
        this.starCompany=starCompany
    }

    override fun singingMusic(str: String) {
        starCompany.singingMusic(str)
    }

}