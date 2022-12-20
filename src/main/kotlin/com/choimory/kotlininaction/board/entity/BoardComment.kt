package com.choimory.kotlininaction.board.entity

import com.choimory.kotlininaction.common.entity.DatetimeAt
import com.choimory.kotlininaction.member.entity.Member
import javax.persistence.*

@Entity
class BoardComment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Int? = null,

    @ManyToOne
    @JoinColumn(name = "board_id")
    private var board:Board? = null,

    @ManyToOne
    @JoinColumn(name = "parent_comment_id")
    private var parent: BoardComment? = null,

    @OneToMany(mappedBy = "parent")
    private var children: MutableList<BoardComment> = mutableListOf(),

    @OneToOne
    @JoinColumn(name = "member_id")
    private var member:Member? = null,

    private var memberName:String? = null,
    private var content:String? = null,
) : DatetimeAt(){

}