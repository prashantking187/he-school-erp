/**  
* @Title: TeacherEdaoImpl.java 
* @Package org.rschool.excledao 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-3-2 下午2:21:41 
* @version V1.0  
*/ 
package org.rschool.excledao.impl;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import org.rschool.entity.hibernate.RTeacher;
import org.rschool.excledao.TeacherEdao;

/** 
 * @ClassName: TeacherEdaoImpl 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-3-2 下午2:21:41 
 *  
 */
public class TeacherEdaoImpl implements TeacherEdao {

	/* (非 Javadoc) 
	 * <p>Title: getTeacherList</p>
	 * <p>Description: </p>
	 * @see org.rschool.excledao.TeacherEdao#getTeacherList(java.io.InputStream) 
	 */
	public List<RTeacher> getTeacherList(InputStream inputStream) {
		
		return null;
	}

	/* (非 Javadoc) 
	 * <p>Title: wirteTeacherList</p>
	 * <p>Description: </p>
	 * @see org.rschool.excledao.TeacherEdao#wirteTeacherList(java.util.Collection, java.io.File) 
	 */
	public boolean wirteTeacherList(Collection<RTeacher> collection, File file) {
		return false;
	}

}
