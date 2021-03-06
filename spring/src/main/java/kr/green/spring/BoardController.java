package kr.green.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import kr.green.spring.service.BoardService;
import kr.green.spring.vo.BoardVO;


@Controller
@RequestMapping(value="/board")
public class BoardController {
	 
	@Autowired
	BoardService boardService;

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String boardListGet(Model model) {
		ArrayList<BoardVO> boardList = boardService.getBoardList();
		
		model.addAttribute("list", boardList);
		return "board/list";
	}
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public String boarddisplayGet(Model model, Integer num) {
		//조회수 증가
		boardService.updateViews(num);
		BoardVO bVo = boardService.getBoard(num);
		
		model.addAttribute("board", bVo);
		return "board/display";
	}
	
}


