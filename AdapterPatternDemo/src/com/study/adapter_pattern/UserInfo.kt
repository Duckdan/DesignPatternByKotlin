package com.study.adapter_pattern

class UserInfo : IUserInfo {
    override fun getUserName(): String {
        println("获取用户姓名...")
        return ""
    }

    override fun getHomeAddress(): String {
        println("获取用户家庭地址")
        return ""
    }

    override fun getMobileNumber(): String {
        println("获取移动电话")
        return ""
    }

    override fun getOfficeTelNumber(): String {
        println("获取办公电话")
        return ""
    }

    override fun getJobPosition(): String {
        println("获取职位信息")
        return ""
    }

    override fun getHomeTelNumber(): String {
        println("获取用户家庭电话")
        return ""
    }

}