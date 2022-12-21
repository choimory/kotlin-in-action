package com.choimory.kotlininaction.board.repository

import com.choimory.kotlininaction.board.entity.Board
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository:JpaRepository<Board, Long> {
}