/**  
* @Title: BackPageService.java 
* @Package org.rschool.service.impl 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-2-26 下午2:09:11 
* @version V1.0  
*/ 
package org.rschool.service;

import org.he.common.vo.PageBean;

/** 
 * @ClassName: BackPageService 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-2-26 下午2:09:11 
 *  
 */
public interface BackPageService {
	/** 
	* @Title: getStduentPage 
	* @Description: TODO 查询学生信息分页列表
	* @param currentPage 当前页面页号
	* @param college 所在学校
	* @param sclass 所在班级
	* @return   PageBean    返回类型
	* @throws 
	*/ 
	public PageBean getStduentPage(int currentPage,int pageSize,String college,String sclass);
	/** 
	* @Title: getStduentPage 
	* @Description: TODO 查询教师信息分页列表
	* @param currentPage 当前页面页号
	* @param college 所在学校
	* @param sclass 所在班级
	* @return   PageBean    返回类型
	* @throws 
	*/ 
	public PageBean getTeacherPage(int currentPage,int pageSize,String college,String sclass);
}
