package com.study.adapter_pattern

interface IOuterUser {
    //获取用户信息
    fun getUserBaseInfo(): MutableMap<String, String>


    //用户的家庭信息
    fun getUserHomeInfo(): MutableMap<String, String>

    //工作区域信息
    fun getUserOfficeInfo(): MutableMap<String, String>

}