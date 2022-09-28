package com.itwill.qna;

import java.util.List;

public interface QnaService {
	
	int qna_insert(Qna qna);

	List<Qna> qna_list(int start, int last);

	Qna qna_selectById(int m_id);

	int qna_update(Qna vo);

	int qna_delete(int m_id);
	
	int qna_countAll();

	int qna_reply_insert(Qna qna);
	
	List<Qna> selectAll();
	
	QnaPageMakerDto qna_list(int currentPage);
}
