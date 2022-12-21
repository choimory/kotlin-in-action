package com.choimory.kotlininaction.board.entity

import com.choimory.kotlininaction.common.entity.DatetimeAt
import com.choimory.kotlininaction.member.entity.Member
import javax.persistence.*

@Entity
data class Board (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,

    @ManyToOne
    @JoinColumn(name = "member_id")
    var member:Member? = null,

    var memberName:String? = null,
    var title:String? = null,
    var content:String? = null,
) : DatetimeAt() {

}