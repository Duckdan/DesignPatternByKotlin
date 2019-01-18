package com.study.adapter_pattern

/**
 * 适配器模式：
 * 实质是为了扩展接口，实现数据的整合
 */
fun main(args: Array<String>) {

    var youngGirl: IUserInfo = OuterUserInfo()

    for (i in 1..5) {
        youngGirl.getMobileNumber()
    }

}