package com.choimory.kotlininaction.member.entity

import com.choimory.kotlininaction.common.entity.DatetimeAt
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    email:String? = null,
    password:String? = null,
    name:String? = null
) : DatetimeAt() {

    var email:String? = email
        protected set

    var password:String? = password
        protected set

    var name:String? = name
        protected set
}