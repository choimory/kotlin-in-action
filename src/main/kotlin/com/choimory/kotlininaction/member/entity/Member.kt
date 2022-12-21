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
    var id:Long? = null,
    var email:String? = null,
    var password:String? = null,
    var name:String? = null
) : DatetimeAt() {

}