package com.itwill.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.qna.mapper.QnaMapper;

@Repository
public class QnaDaoImp implements QnaDao{
	
	@Autowired
	private QnaMapper qnaMapper;

	public QnaDaoImp() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void setQnaMapper(QnaMapper qnaMapper) {
		this.qnaMapper = qnaMapper;
	}



	@Override
	public int qna_insert(Qna qna) {
		return qnaMapper.qna_insert(qna);
	}

	@Override
	public List<Qna> qna_list(int start, int last) {
		return qnaMapper.qna_list(start, last);
	}
	
	@Override
	public List<Qna> selectAll() {
		return qnaMapper.selectAll();
	}

	@Override
	public Qna qna_selectById(int m_id) {
		return qnaMapper.qna_selectById(m_id);
	}

	@Override
	public int qna_update(Qna qna) {
		return qnaMapper.qna_update(qna);
	}

	@Override
	public int qna_delete(int m_id) {
		return qnaMapper.qna_delete(m_id);
	}

	@Override
	public int qna_countAll() {
		return qnaMapper.qna_countAll();
	}

	@Override
	public int qna_reply_insert(Qna qna) {
		return qnaMapper.qna_reply_insert(qna);
	}

	
}
