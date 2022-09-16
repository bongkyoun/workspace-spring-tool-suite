package com.itwill.ajax;

import java.util.List;



public class NewsListResult {
	private int code;
	private List<News> newsList;

	public int getCount() {
		return code;
	}

	public void setCount(int count) {
		this.code = count;
	}

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}

}
