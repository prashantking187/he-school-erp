/**  
* @Title: PageDaoImpl.java 
* @Package org.rschool.dao.impl 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-2-26 下午1:59:47 
* @version V1.0  
*/ 
package org.rschool.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.he.common.hibernate3.support.YeekuHibernateDaoSupport;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.rschool.dao.PageDao;
import org.rschool.entity.hibernate.RAcademy;
import org.rschool.entity.hibernate.RClass;
import org.rschool.entity.hibernate.RStudent;
import org.rschool.entity.hibernate.RTeacher;
import org.springframework.orm.hibernate3.HibernateCallback;

/** 
 * @ClassName: PageDaoImpl 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-2-26 下午1:59:47 
 *  
 */
public class PageDaoImpl extends YeekuHibernateDaoSupport implements PageDao {
	private String hql ="";
	/* (非 Javadoc) 
	 * <p>Title: getStudentList</p>
	 * <p>Description: </p>
	 * @see org.rschool.dao.impl.PageDao#getStudentList(int, int, java.lang.Object[]) 
	 */
	public List<RStudent> getStudentList(int offset, int pageSize,
			Object... values) {
		 hql = "from RStudent where 1 = 1 ";
		if(values[0]!=null&&!"".equals(values[0])){
			hql += " and college = '"+values[0]+"'";
		}
		if(values[1]!=null&&!"".equals(values[1])){
			hql += " and sclass = '"+values[1]+"'";
		}
		List<RStudent> list = findByPage(hql, offset, pageSize) ;
		return list;
	}

	/* (非 Javadoc) 
	 * <p>Title: getStudentCount</p>
	 * <p>Description: </p>
	 * @see org.rschool.dao.impl.PageDao#getStudentCount(java.lang.Object[]) 
	 */
	public int getStudentCount(Object... values) {
		 hql = "from RStudent where 1 = 1 ";
		if(values[0]!=null&&!"".equals(values[0])){
			hql += " and college = '"+values[0]+"'";
		}
		if(values[1]!=null&&!"".equals(values[1])){
			hql += " and sclass = '"+values[1]+"'";
		}
		return getCount(hql);
	}

	/* (非 Javadoc) 
	* <p>Title: getTeacherCount</p>
	* <p>Description: </p>
	* @see org.rschool.dao.PageDao#getTeacherCount(java.lang.Object[]) 
	*/ 
	public int getTeacherCount(Object... values) {
		hql = "from RTeacher where 1=1 ";
		if(values[0]!=null&&!"".equals(values[0])){
			hql+=" ";
			
		}
////		if(){
//			
//			
//		}
		return 0;
	}

	/* (非 Javadoc) 
	* <p>Title: getTeacherList</p>
	* <p>Description: </p>
	* @see org.rschool.dao.PageDao#getTeacherList(int, int, java.lang.Object[]) 
	*/ 
	public List<RTeacher> getTeacherList(int offset, int pageSize,
			Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (非 Javadoc) 
	* <p>Title: getAcademyCount</p>
	* <p>Description: </p>
	* @see org.rschool.dao.PageDao#getAcademyCount(java.lang.Object[]) 
	*/ 
	public int getAcademyCount(Object... values) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (非 Javadoc) 
	* <p>Title: getAcademyList</p>
	* <p>Description: </p>
	* @see org.rschool.dao.PageDao#getAcademyList(int, int, java.lang.Object[]) 
	*/ 
	public List<RAcademy> getAcademyList(int offset, int pageSize,
			Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (非 Javadoc) 
	* <p>Title: getClassList</p>
	* <p>Description: </p>
	* @see org.rschool.dao.PageDao#getClassList(int, int, java.lang.Object[]) 
	*/ 
	public List<RClass> getClassList(int offset, int pageSize, Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (非 Javadoc) 
	* <p>Title: getClassCount</p>
	* <p>Description: </p>
	* @see org.rschool.dao.PageDao#getClassCount(java.lang.Object[]) 
	*/ 
	public int getClassCount(Object... values) {
		// TODO Auto-generated method stub
		return 0;
	}

}
