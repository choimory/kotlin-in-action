package com.choimory.kotlininaction.common.data.response

class ResponsePagination(
    val page:Int,
    val size:Int,
    val totalPage:Int,
    val totalCount:Int,
) {
}