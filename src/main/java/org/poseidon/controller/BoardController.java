package org.poseidon.controller;

import java.util.List;

import org.poseidon.dto.BoardDTO;
import org.poseidon.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//게시판 관련 기능을 여기에 넣을 것.

@Controller
public class BoardController {
	
	//서비스와 연결하기
	@Autowired
	private BoardService boardService;

	@GetMapping("/board")
	public String board(Model model) {
		//DB에서 값을 불러와서 화면에 찍어주고 싶어요
		//				model					jsp
		//Controller = 흐름제어
		//Service	 = 로직
		//Repository = DAO
		
		//service에게 일 시키기
		System.out.println("컨트롤러입니다.");
		List<BoardDTO> list = boardService.boardList();
		
		//붙이기
		model.addAttribute("list", list); // 이름, 값
		
		return "board"; // jsp file name
	}
	
	@PostMapping("/board")
	public String board2() { // 이름 다르게. 서블릿 때처럼 이름 같으면 충돌 생긴다.
		return "board"; // jsp file name
	}
	
}
