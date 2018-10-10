package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.dao.BoardDAO;
import com.bdi.sp.vo.Board;

@Controller
public class BoardController {
	@Autowired
	private BoardDAO bdao;
	
	@RequestMapping(value="/Board", method=RequestMethod.GET)
	public @ResponseBody List<Board> BoardList(@ModelAttribute Board bi) {
		return bdao.getBoardList(bi);
	}
	
	@RequestMapping(value="/Board/{binum}", method=RequestMethod.GET)
	public @ResponseBody Board Board(@PathVariable int binum) {
		return bdao.getBoard(binum);
	}
	@RequestMapping(value="/Board", method=RequestMethod.PUT)
	public @ResponseBody String updateBoard(@RequestBody Board bi) {
		return bdao.updateBoard(bi) + "";
	}
	
	@RequestMapping(value="/Board", method=RequestMethod.POST)
	public @ResponseBody String insrtBoard(@RequestBody Board bi) {
		return bdao.insertBoard(bi) + "";
	}
	
	@RequestMapping(value="/Board/{binum}", method=RequestMethod.DELETE)
	public @ResponseBody String deleteBoard(@PathVariable int binum) {
		return bdao.deleteBoard(binum) + "";
	}

}
