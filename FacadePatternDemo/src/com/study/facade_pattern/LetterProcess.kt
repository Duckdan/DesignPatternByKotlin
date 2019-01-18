package com.study.facade_pattern

/**
 * 定义一个发送写信的过程
 */
interface LetterProcess {
    /**
     * 定义写信的内容
     */
    fun writeContext(context: String)

    /**
     * 其次写信封
     */
    fun fillEnvelope(address: String)

    /**
     * 将信封装入到信封中
     */
    fun letterInotoEnvelope()

    /**
     * 寄信
     */
    fun sendLetter()
}