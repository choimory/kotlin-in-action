package com.choimory.kotlininaction.board.entity

import com.choimory.kotlininaction.common.entity.DatetimeAt
import com.choimory.kotlininaction.member.entity.Member
import javax.persistence.*

@Entity
class Board (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? = null,
    member:Member? = null,
    memberName:String? = null,
    title:String? = null,
    content:String? = null,
) : DatetimeAt() {
    @ManyToOne
    @JoinColumn(name = "member_id")
    var member:Member? = member
        protected set

    var memberName:String? = memberName
        protected set

    var title:String? = title
        protected set

    var content:String? = content
        protected set
}