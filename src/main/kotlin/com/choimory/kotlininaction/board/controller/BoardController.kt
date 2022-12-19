package com.choimory.kotlininaction.board.controller

import com.choimory.kotlininaction.board.service.BoardService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.Min

@RestController
@RequestMapping("/article")
@Validated
class BoardController constructor(private val boardService: BoardService){
    @GetMapping("/{id}")
    fun find(@PathVariable("id")
             @Min(1) id:Int):Int{
        return boardService.find(id);
    }

    @GetMapping
    fun findAll(){
        return boardService.findAll();
    }

    @PostMapping
    fun register(){
        return boardService.register();
    }

    @PatchMapping("/{id}")
    fun modify(@PathVariable("id")
               @Min(1) id:Int){
        return boardService.modify();
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id")
               @Min(1) id:Int){
        return boardService.delete();
    }
}