package com.choimory.kotlininaction.board.entity

import com.choimory.kotlininaction.common.entity.DatetimeAt
import com.choimory.kotlininaction.member.entity.Member
import javax.persistence.*

@Entity
class BoardComment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? = null,
    board:Board? = null,
    parent: BoardComment? = null,
    children: MutableList<BoardComment> = mutableListOf(),
    member:Member? = null,
    memberName:String? = null,
    content:String? = null,
) : DatetimeAt(){
    @ManyToOne
    @JoinColumn(name = "board_id")
    var board: Board? = board
        protected set

    @ManyToOne
    @JoinColumn(name = "parent_comment_id")
    var parent: BoardComment? = parent
        protected set

    @OneToMany(mappedBy = "parent")
    protected val mutableChildren: MutableList<BoardComment> = children
    val children: List<BoardComment> get() = mutableChildren.toList()
    /*var children: MutableList<BoardComment> = children
        protected set*/

    @OneToOne
    @JoinColumn(name = "member_id")
    var member: Member? = member
        protected set

    var memberName: String? = memberName
        protected set

    var content: String? = content
        protected set
}