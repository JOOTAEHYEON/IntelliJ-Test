package com.test.test.controller;


import com.test.test.entity.Board;
import com.test.test.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.datatransfer.Clipboard;

@Controller
public class testcontroller {

    @Autowired
    private final  BoardService boardService;

    public testcontroller(BoardService boardService) {
        this.boardService = boardService;
    }


    @GetMapping("/test/write")
    public String boardWriteForm(){


        return "boardwrite";
    }

    @PostMapping("/test/write1") //글쓰기 클릭 서버 부분
    public String boardWrite1(Board board){

        boardService.write(board);
        System.out.println("제목:"+board.getTitle());
        System.out.println("내용은:"+board.getContent());

        return "";

    }

}

