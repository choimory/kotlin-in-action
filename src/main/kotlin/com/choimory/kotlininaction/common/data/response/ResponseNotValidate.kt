package com.choimory.kotlininaction.common.data.response

class ResponseNotValidate(
    val field:String? = null,
    val rejectedValue:Any? = null,
    val message:String? = null,
) {
}