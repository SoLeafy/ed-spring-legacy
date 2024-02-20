package org.poseidon.service;
//Controller의 요청에 맞추어
//Repository에서 받은 정보를 가공하여
//Controller에게 넘겨주는 비즈니스 로직

import java.util.List;

import org.poseidon.dao.BoardDAO;
import org.poseidon.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> boardList() {
		System.out.println("서비스 입니다.");
		//List<BoardDTO> list = boardDAO.boardList();
		//return list;
		return boardDAO.boardList();
	}
	
}
