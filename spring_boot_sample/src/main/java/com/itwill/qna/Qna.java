package com.itwill.qna;

import java.util.Date;

public class Qna {
	private int q_no;
	private String q_title;
	private String q_content;
	private Date q_date;
	private int q_groupno;
	private int q_step;
	private int q_depth;
	private String m_id;
	
	public Qna() {
		// TODO Auto-generated constructor stub
	}

	public Qna(int q_no, String q_title, String q_content, Date q_date, int q_groupno, int q_step, int q_depth,
			String m_id) {
		super();
		this.q_no = q_no;
		this.q_title = q_title;
		this.q_content = q_content;
		this.q_date = q_date;
		this.q_groupno = q_groupno;
		this.q_step = q_step;
		this.q_depth = q_depth;
		this.m_id = m_id;
	}

	public int getQ_no() {
		return q_no;
	}

	public void setQ_no(int q_no) {
		this.q_no = q_no;
	}

	public String getQ_title() {
		return q_title;
	}

	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}

	public String getQ_content() {
		return q_content;
	}

	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}

	public Date getQ_date() {
		return q_date;
	}

	public void setQ_date(Date q_date) {
		this.q_date = q_date;
	}

	public int getQ_groupno() {
		return q_groupno;
	}

	public void setQ_groupno(int q_groupno) {
		this.q_groupno = q_groupno;
	}

	public int getQ_step() {
		return q_step;
	}

	public void setQ_step(int q_step) {
		this.q_step = q_step;
	}

	public int getQ_depth() {
		return q_depth;
	}

	public void setQ_depth(int q_depth) {
		this.q_depth = q_depth;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	@Override
	public String toString() {
		return "Qna [q_no=" + q_no + ", q_title=" + q_title + ", q_content=" + q_content + ", q_date=" + q_date
				+ ", q_groupno=" + q_groupno + ", q_step=" + q_step + ", q_depth=" + q_depth + ", m_id=" + m_id + "]";
	}
	
	
	
}
