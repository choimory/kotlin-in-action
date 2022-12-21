package com.choimory.kotlininaction.common.data.request

class RequestPagination(
    private val DEFAULT_PAGE:Int = 1,
    private val DEFAULT_SIZE:Int = 20,
    private val SORT_SEPARATOR:String = ":",
    private val SORT_PATTERN:String = "prop:direction",

    val page:Int = DEFAULT_PAGE,
    val size:Int = DEFAULT_SIZE,
    val sort:MutableList<String> = mutableListOf()
) {
}