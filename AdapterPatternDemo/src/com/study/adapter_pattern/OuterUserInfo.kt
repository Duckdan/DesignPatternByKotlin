package com.study.adapter_pattern

class OuterUserInfo : OuterUser(), IUserInfo {

    var baseInfo = super.getUserBaseInfo()
    var homeInfo = super.getUserHomeInfo()
    var officeInfo = super.getUserOfficeInfo()

    override fun getUserName(): String {
        val userName = this.baseInfo["userName"]
        println("用户姓名:$userName")
        return userName!!
    }

    override fun getMobileNumber(): String {
        val mobileNumber = this.baseInfo["mobileNumber"]
        println("移动电话:$mobileNumber")
        return mobileNumber!!
    }

    override fun getHomeTelNumber(): String {
        val homeTelNumber = this.homeInfo["homeTelNumber"]
        println("家庭地址:$homeTelNumber")
        return homeTelNumber!!
    }


    override fun getHomeAddress(): String {
        val homeAddress = this.homeInfo["homeAddress"]
        println("家庭地址:$homeAddress")
        return homeAddress!!
    }

    override fun getJobPosition(): String {
        val jobPosition = this.officeInfo["jobPosition"]
        println("职位:$jobPosition")
        return jobPosition!!
    }

    override fun getOfficeTelNumber(): String {
        val officeTelNumber = this.officeInfo["officeTelNumber"]
        println("办公电话:$officeTelNumber")
        return officeTelNumber!!
    }

}