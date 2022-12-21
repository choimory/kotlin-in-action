package com.choimory.kotlininaction.common.data.response


class CommonResponse<T> (
    val status:Int? = null,
    val message:String? = null,
    val data:T? = null,
){
}