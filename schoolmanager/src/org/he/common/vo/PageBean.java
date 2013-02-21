package org.he.common.vo;

import java.util.List;

public class PageBean <T>{
	private int currentPage;//当前页面
	private int pageCount;//总页数
	private int rowCount;//总条数
	private List<T> list;//数据列表
	private int pageSize;//页面大小
	
	public PageBean(int currentPage, int rowCount, List<T> list, int pageSize) {
		super();
		this.currentPage = currentPage;
		this.rowCount = rowCount;
		this.list = list;
		this.pageSize = pageSize;
		this.pageCount= rowCount%pageSize==0?rowCount/pageSize:rowCount/pageSize+1;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
