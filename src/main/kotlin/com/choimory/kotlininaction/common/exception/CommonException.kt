package com.choimory.kotlininaction.common.exception

import org.springframework.http.HttpStatus

class CommonException (
    val httpStatus:HttpStatus,
    val status:Int? = httpStatus.value(),
    val msg:String? = httpStatus.reasonPhrase,
) : RuntimeException () {
}