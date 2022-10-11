package com.itwill.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.common.PageMaker;
import com.itwill.qna.mapper.QnaMapper;

@Service
public class QnaServiceImp implements QnaService{
	
	@Autowired
	private QnaDao qnaDao;

	public void setQnaDao(QnaDao qnaDao) {
		this.qnaDao = qnaDao;
	}
	
	public QnaServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Qna> selectAll() {
		return qnaDao.selectAll();
	}
	

	@Override
	public int qna_insert(Qna qna) {
		return qnaDao.qna_insert(qna);
	}

	@Override
	public List<Qna> qna_list(int start, int last) {
		return qnaDao.qna_list(start, last);
	}

	@Override
	public Qna qna_selectById(int m_id) {
		return qnaDao.qna_selectById(m_id);
	}

	@Override
	public int qna_update(Qna qna) {
		return qnaDao.qna_update(qna);
	}

	@Override
	public int qna_delete(int m_id) {
		return qnaDao.qna_delete(m_id);
	}

	@Override
	public int qna_countAll() {
		return qnaDao.qna_countAll();
	}

	@Override
	public int qna_reply_insert(Qna qna) {
		return qnaDao.qna_reply_insert(qna);
	}

	@Override
	public QnaPageMakerDto qna_list(int currentPage) {
		//1.전체글의 갯수
				int totalRecordCount = qnaDao.qna_countAll();
				//2.paging계산(PageMaker 유틸클래스)
				PageMaker pageMaker=new PageMaker(totalRecordCount,currentPage);
				
				//3.게시물데이타 얻기
				List<Qna> boardList=
						qnaDao.qna_list(pageMaker.getPageBegin(),
													pageMaker.getPageEnd());
				
				QnaPageMakerDto pageMakerBoardList=new QnaPageMakerDto();
				pageMakerBoardList.totRecordCount=totalRecordCount;
				pageMakerBoardList.itemList=boardList;
				pageMakerBoardList.pageMaker=pageMaker;
				return pageMakerBoardList;
	}
	
}
