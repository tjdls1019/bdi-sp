package com.bdi.sp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.vo.Board;
import com.bdi.sp.vo.Japan;

@Controller
public class JSONTestController {

	@RequestMapping(value="/test",method=RequestMethod.GET)
	public @ResponseBody Japan getTest(@ModelAttribute Japan j, 
			@RequestParam(required=false) String str) {
		System.out.println("str : " + str);
		return j;
	}
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public @ResponseBody Board postTest(
			@RequestBody Board bi) {
		System.out.println(bi);
		return bi;
	}
	
	@RequestMapping(value="/test",method=RequestMethod.PUT)
	public @ResponseBody Board putTest(
			@RequestBody Board bi) {
		System.out.println(bi);
		return bi;
	}
	
	@RequestMapping(value="/test",method=RequestMethod.DELETE)
	public @ResponseBody Board deleteTest(
			@RequestBody Board bi) {
		System.out.println(bi);
		return bi;
	}
}
