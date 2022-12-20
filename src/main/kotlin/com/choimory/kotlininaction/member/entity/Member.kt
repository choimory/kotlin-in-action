package com.choimory.kotlininaction.member.entity

import com.choimory.kotlininaction.common.entity.DatetimeAt
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Int? = null,
    private var email:String? = null,
    private var password:String? = null,
    private var name:String? = null
) : DatetimeAt() {

}