package com.study.facade_pattern

/**
 * 先进邮局：将发送信件的过程封装为一个方法暴露给外部，方便客户端调用
 *
 * 同时可以在这里检测寄信的内容，有点类似APO的编程思想
 */
class PostOffice {
    var letterProcess = LetterProcessImpl()


    fun sendLetter(context: String, address: String) {
        /**
         * 写信
         */
        letterProcess.writeContext(context)

        /**
         * 填写信封
         */
        letterProcess.fillEnvelope(address)


        /**
         * 将信装入到信封
         */
        letterProcess.letterInotoEnvelope()

        /**
         * 寄信
         */
        letterProcess.sendLetter()
    }
}