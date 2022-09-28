package com.itwill.qna.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwill.qna.Qna;
import com.itwill.qna.QnaService;

@Controller
public class QnaController {
	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String root() {
        return "index";
    }
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value="board", method=RequestMethod.GET)
    public String board() {
        return "board";
    }
	
    @RequestMapping(value="boardList", method=RequestMethod.GET)
    @ResponseBody
    public List<Qna> boardList(){
    	System.out.println(qnaService.selectAll());
        return qnaService.selectAll();
    }
}

