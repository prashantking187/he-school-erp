/**  
* @Title: TeacherEdao.java 
* @Package org.rschool.excledao 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-3-2 下午2:13:13 
* @version V1.0  
*/ 
package org.rschool.excledao;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import org.rschool.entity.hibernate.RTeacher;

/** 
 * @ClassName: TeacherEdao 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-3-2 下午2:13:13 
 *  
 */
public interface TeacherEdao {
	/** 
	* @Title: getTeacherList 
	* @Description: TODO   从文件流中获取教师信息列表
	* @param inputStream
	* @return   
	*/ 
	public List<RTeacher> getTeacherList(InputStream inputStream);
	/** 
	* @Title: wirteTeacherList 
	* @Description: TODO    将教师信息写入文件中
	* @param collection
	* @param file
	* @return   
	*/ 
	public boolean wirteTeacherList(Collection<RTeacher> collection,File file);
}
