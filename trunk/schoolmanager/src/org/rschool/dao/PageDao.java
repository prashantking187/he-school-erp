package org.rschool.dao;

import java.util.List;

import org.rschool.entity.hibernate.RAcademy;
import org.rschool.entity.hibernate.RClass;
import org.rschool.entity.hibernate.RStudent;
import org.rschool.entity.hibernate.RTeacher;

/** 
* @ClassName: PageDao 
* @Description:  
* @author: 黄鹤
* @date 2013-2-26 下午1:49:14 
*  
*/ 
public interface PageDao {
	
	/** 
	* @Title: getStudentList 
	* @Description: TODO 按条件查询学生信息，返回学生信息列表
	* @param offset  首条记录位置
	* @param pageSize 返回的记录条数
	* @param values 查询条件
	* @return  List<RStudent>    返回学生信息列表
	* @throws 
	*/ 
	public List<RStudent> getStudentList(int offset,int pageSize,Object... values);
	/** 
	* @Title: getStudentCount 
	* @Description: TODO  按条件查询学生，返回学生总数
	* @param values 条件
	* @return  int    学生人数总数
	* @throws 
	*/ 
	public int getStudentCount(Object... values);
	/** 
	* @Title: getTeacherCount 
	* @Description: TODO   按条件查询学院信息，返回学院信息列表
	* @param values 查询条件 
	* @return   学院人数个数
	*/ 
	public int getTeacherCount(Object... values);
	/** 
	* @Title: getTeacherList 
	* @Description: TODO   
	* @param offset
	* @param pageSize
	* @param values 查询条件
	* @return   学院信息列表
	*/ 
	public List<RTeacher> getTeacherList(int offset, int pageSize,Object... values);
	/** 
	* @Title: getAcademyCount 
	* @Description: TODO   按条件查询学院信息，返回学院信息列表
	* @param values 查询条件 
	* @return   学院人数个数
	*/ 
	public int getAcademyCount(Object... values);
	/** 
	* @Title: getAcademyList 
	* @Description: TODO   
	* @param offset
	* @param pageSize
	* @param values 查询条件
	* @return   学院信息列表
	*/ 
	public List<RAcademy> getAcademyList(int offset, int pageSize,Object... values);
	
	
	
	/** 
	* @Title: getClassList 
	* @Description: TODO 按条件查询班级信息，返回班级信息列表
	* @param offset  首条记录位置
	* @param pageSize 返回的记录条数
	* @param values 查询条件
	* @return  List<RClass>    返回班级信息列表
	* @throws 
	*/ 
	public List<RClass> getClassList(int offset,int pageSize,Object... values);
	/** 
	* @Title: getClassCount 
	* @Description: TODO  按条件查询班级，返回班级总数
	* @param values 条件
	* @return  int    班级人数总数
	* @throws 
	*/ 
	public int getClassCount(Object... values);
	
}
