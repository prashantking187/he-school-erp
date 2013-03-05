/**  
* @Title: SchoolDaoImpl.java 
* @Package org.rschool.dao.impl 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-3-3 下午4:22:06 
* @version V1.0  
*/ 
package org.rschool.dao.impl;

import java.util.List;

import org.he.common.hibernate3.support.YeekuHibernateDaoSupport;
import org.rschool.dao.SchoolDao;
import org.rschool.entity.hibernate.RAcademy;

/** 
 * @ClassName: SchoolDaoImpl 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-3-3 下午4:22:06 
 *  
 */
public class SchoolDaoImpl extends YeekuHibernateDaoSupport implements SchoolDao {
	private String hql ="";
	/* (非 Javadoc) 
	 * <p>Title: getAcademyByName</p>
	 * <p>Description: </p>
	 * @see org.rschool.dao.SchoolDao#getAcademyByName(java.lang.String) 
	 */
	public RAcademy getAcademyByName(String name) {
		List<RAcademy> list ;
		hql = "from RAcademy where name = ?";
		list = getHibernateTemplate().find(hql,name);
		if(list.isEmpty()){
			return null;
		}
		return list.get(0);
	}

}
