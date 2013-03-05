/**  
* @Title: SchoolDao.java 
* @Package org.rschool.dao 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-3-3 下午4:21:11 
* @version V1.0  
*/ 
package org.rschool.dao;

import org.rschool.entity.hibernate.RAcademy;

/** 
 * @ClassName: SchoolDao 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-3-3 下午4:21:11 
 *  
 */
public interface SchoolDao {
	public RAcademy getAcademyByName(String name);
}
