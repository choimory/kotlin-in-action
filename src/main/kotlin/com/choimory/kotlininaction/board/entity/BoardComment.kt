package com.choimory.kotlininaction.board.entity

import com.choimory.kotlininaction.common.entity.DatetimeAt
import com.choimory.kotlininaction.member.entity.Member
import javax.persistence.*

@Entity
class BoardComment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,

    @ManyToOne
    @JoinColumn(name = "board_id")
    var board:Board? = null,

    @ManyToOne
    @JoinColumn(name = "parent_comment_id")
    var parent: BoardComment? = null,

    @OneToMany(mappedBy = "parent")
    var children: MutableList<BoardComment> = mutableListOf(),

    @OneToOne
    @JoinColumn(name = "member_id")
    var member:Member? = null,

    var memberName:String? = null,
    var content:String? = null,
) : DatetimeAt(){

}