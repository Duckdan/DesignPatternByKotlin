package com.study.facade_pattern

class LetterProcessImpl : LetterProcess {
    override fun writeContext(context: String) {
        println("填写信的内容$context")
    }

    override fun fillEnvelope(address: String) {
        println("填写信封$address")
    }

    override fun letterInotoEnvelope() {
        println("将信件投入到信封中")
    }

    override fun sendLetter() {
        println("寄信")
    }

}