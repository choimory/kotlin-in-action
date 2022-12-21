package com.choimory.kotlininaction.board.controller

import com.choimory.kotlininaction.board.entity.Board
import com.choimory.kotlininaction.board.service.BoardService
import com.choimory.kotlininaction.common.data.response.CommonResponse
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.constraints.Min

@RestController
@RequestMapping("/article")
@Validated
class BoardController (
    private val boardService: BoardService
){
    @GetMapping("/{id}")
    fun find(@PathVariable("id")
             @Min(1) id:Long): CommonResponse<Board> = boardService.find(id)

    @GetMapping
    fun findAll() = boardService.findAll()

    @PostMapping
    fun register() = boardService.register()

    @PatchMapping("/{id}")
    fun modify(@PathVariable("id")
               @Min(1) id:Int) = boardService.modify()

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id")
               @Min(1) id:Int) = boardService.delete()
}