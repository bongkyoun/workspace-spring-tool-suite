package com.itwill.qna;

import java.util.List;

import org.springframework.stereotype.Component;

import com.itwill.common.PageMaker;


@Component
public class QnaPageMakerDto {
	public List<Qna> itemList;
	public PageMaker pageMaker;
	public int totRecordCount;
}