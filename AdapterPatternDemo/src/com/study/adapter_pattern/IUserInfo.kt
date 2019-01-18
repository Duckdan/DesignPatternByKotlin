package com.study.adapter_pattern

/**
 * 当前系统用户的信息模型
 */
interface IUserInfo {
    //获取用户姓名
    fun getUserName(): String

    //手机号码
    fun getMobileNumber(): String

    //获得家庭地址
    fun getHomeAddress(): String

    //获得家庭电话
    fun getHomeTelNumber(): String

    //办公电话
    fun getOfficeTelNumber(): String

    //获取职位信息
    fun getJobPosition(): String


}