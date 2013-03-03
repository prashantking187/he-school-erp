/**  
 * @Title: BackPageServiceImpl.java 
 * @Package org.rschool.service.impl 
 * @Description: TODO 
 * @author A18ccms A18ccms_gmail_com  
 * @date 2013-2-26 下午2:35:31 
 * @version V1.0  
 */
package org.rschool.service.impl;

import java.util.List;

import org.he.common.vo.PageBean;
import org.rschool.dao.PageDao;
import org.rschool.entity.hibernate.RStudent;
import org.rschool.entity.hibernate.RTeacher;
import org.rschool.service.BackPageService;

/**
 * @ClassName: BackPageServiceImpl
 * @Description:
 * @author: 黄鹤
 * @date 2013-2-26 下午2:35:31
 * 
 */
public class BackPageServiceImpl implements BackPageService {
	/**
	 * @Fields pageDao : TODO 分页dao
	 */
	private PageDao pageDao;

	
	public void setPageDao(PageDao pageDao) {
		this.pageDao = pageDao;
	}
	/*
	 * (非 Javadoc) <p>Title: getStduentPage</p> <p>Description: </p>
	 * 
	 * @see org.rschool.service.BackPageService#getStduentPage(int, int,
	 * java.lang.String, java.lang.String)
	 */
	public PageBean getStduentPage(int currentPage,int pageSize, String college,
			String sclass) {
		int count =  pageDao.getStudentCount(college,sclass);
		int offset = pageSize*(currentPage-1); 
		List<RStudent> list = pageDao.getStudentList(offset, pageSize, college,sclass);
		PageBean<RStudent> page = new PageBean(currentPage, count, list, pageSize);
		return page;
	}
	/* (非 Javadoc) 
	* <p>Title: getTeacherPage</p>
	* <p>Description: </p>
	* @see org.rschool.service.BackPageService#getTeacherPage(int, int, java.lang.String, java.lang.String) 
	*/ 
	public PageBean getTeacherPage(int currentPage, int pageSize,
			String college, String sclass) {
		int count =  pageDao.getTeacherCount(college,sclass);
		int offset = pageSize*(currentPage-1); 
		List<RTeacher> list = pageDao.getTeacherList(offset, pageSize, college,sclass);
		PageBean<RTeacher> page = new PageBean(currentPage, count, list, pageSize);
		return page;
	}
}
