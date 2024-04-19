package com.test.test.service;

import com.test.test.entity.Board;
import com.test.test.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    public void write(Board board){

        boardRepository.save(board);


    }

}
