package com.choimory.kotlininaction.board.service

import com.choimory.kotlininaction.board.entity.Board
import com.choimory.kotlininaction.board.repository.BoardRepository
import com.choimory.kotlininaction.common.data.response.CommonResponse
import com.choimory.kotlininaction.common.exception.CommonException
import lombok.extern.slf4j.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class BoardService (
    private val boardRepository:BoardRepository
) {
    fun find(id:Long):CommonResponse<Board>{
        val board:Board = boardRepository.findById(id)
            .orElseThrow { CommonException(HttpStatus.NOT_FOUND) }

        return CommonResponse(
            status = HttpStatus.OK.value(),
            message = HttpStatus.OK.reasonPhrase,
            data = board
        )
    }

    fun findAll(){
        return;
    }

    fun register(){
        return;
    }

    fun modify(){
        return;
    }

    fun delete(){
        return;
    }
}