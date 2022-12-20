package com.choimory.kotlininaction.board.entity

import com.choimory.kotlininaction.common.entity.DatetimeAt
import com.choimory.kotlininaction.member.entity.Member
import javax.persistence.*

@Entity
class Board  (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Int,

    @ManyToOne
    @JoinColumn(name = "member_id")
    private var member:Member? = null,

    private var memberName:String? = null,
    private var title:String? = null,
    private var content:String? = null,
) : DatetimeAt() {

}