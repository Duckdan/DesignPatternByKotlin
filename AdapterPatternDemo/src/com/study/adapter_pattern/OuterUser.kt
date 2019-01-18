package com.study.adapter_pattern

open class OuterUser : IOuterUser {
    override fun getUserBaseInfo(): MutableMap<String, String> {
        var baseInfoMap = mutableMapOf<String, String>()
        baseInfoMap["userName"] = "这个员工叫马云....."
        baseInfoMap["mobileNumber"] = "这个员工电话是...."
        return baseInfoMap
    }

    override fun getUserHomeInfo(): MutableMap<String, String> {
        var homeInfo = mutableMapOf<String, String>()
        homeInfo["homeTelNumber"] = "员工的家庭电话是...."
        homeInfo["homeAddress"] = "员工的家庭地址是...."
        return homeInfo
    }

    override fun getUserOfficeInfo(): MutableMap<String, String> {
        var officeInfo = mutableMapOf<String, String>()
        officeInfo["jobPosition"] = "这个人的职位是阿里巴巴大老板...."
        officeInfo["officeTelNumber"] = "员工的办公电话是...."
        return officeInfo
    }

}