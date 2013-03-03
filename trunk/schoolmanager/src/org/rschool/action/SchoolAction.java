/**  
* @Title: PageAction.java 
* @Package org.rschool.action 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-2-26 下午2:45:19 
* @version V1.0  
*/ 
package org.rschool.action;

import java.util.List;

import org.he.base.action.BaseAction;
import org.he.common.vo.PageBean;
import org.rschool.entity.hibernate.RAcademy;
import org.rschool.entity.hibernate.RClass;
import org.rschool.entity.hibernate.RSchool;
import org.rschool.entity.hibernate.RStudent;
import org.rschool.entity.hibernate.RTeacher;
import org.rschool.service.BackPageService;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * @ClassName: PageAction 
 * @Description:  
 * 1.增加教师
 * 2.批量增加教师
 * 3.批量增加学生
 * 4.修改学生
 * 5.修改教师
 * 6.增加学院
 * 7.修改学院
 * 8.删除学院
 * 9.增加课程
 * 10.修改课程
 * 11.删除课程
 * 12.批量录入成绩
 * 13.修改成绩
 * @author: 黄鹤
 * @date 2013-2-26 下午2:45:19 
 *  
 */
public class SchoolAction extends BaseAction {
	private BackPageService backPageService;//分页服务对象
	private String college;//学校名称
	private String sclass;//班号
	private RStudent student;//学生信息
	private RTeacher teacher;//教师信息
	private RSchool schoole;//学校
	private RAcademy academy;//学院
	private RClass rClass;//班级
	private List<RStudent> studentList;//学生列表
	private List<RTeacher> teacherList;//教师列表

	
	
	/** 
	* @Title: getStudentPage 
	* @Description: TODO  获取学生信息分页列表
	* @return 
	* @throws Exception   
	*/ 
	public String getStudentPage() throws Exception{
		PageBean pageBean = backPageService.getStduentPage(getCurrentPage(), getPageSize(), college, sclass);
		setPageBean(pageBean);
		return SUCCESS;
	}
	
	/** 
	* @Title: addStudentList 
	* @Description: TODO   从excle中添加学生
	* @return 
	* @throws Exception   
	*/ 
	public String addStudentList() throws Exception{
		
		return SUCCESS;
	}
	
	/** 
	* @Title: deleteStudent 
	* @Description: TODO   删除学生
	* @return
	* @throws Exception   
	*/ 
	public String deleteStudent() throws Exception{
		baseService.delete(studentList);
		return SUCCESS;
	}
	
	/** 
	* @Title: showStudent 
	* @Description: TODO   查看学生详情
	* @return   
	*/ 
	public String showStudent(){
		student = (RStudent)baseService.getEntity(RStudent.class, getId());
		return SUCCESS;
	}
	
	/** 
	* @Title: updataStudent 
	* @Description: TODO   修改学生信息
	* @return   
	*/ 
	public String updateStudent(){
		RStudent studentTemp = (RStudent)baseService.getEntity(RStudent.class, student.getId());
		studentTemp.setEmail(student.getEmail());
		studentTemp.setHobby(student.getHobby());
		studentTemp.setQq(student.getQq());
		baseService.update(studentTemp);
		return SUCCESS;
	}
	
	
	/** 
	* @Title: getTeacherPage 
	* @Description: TODO   获取教师信息分页列表
	* @return   
	*/ 
	public String getTeacherPage(){
		PageBean bean = backPageService.getTeacherPage(getCurrentPage(), getPageSize(), college, sclass);
		setPageBean(bean);
		return SUCCESS;
	}
	
	/** 
	* @Title: addTeacher 
	* @Description: TODO   添加教师
	* @return   
	*/ 
	public String addTeacher(){
		baseService.save(teacher);
		setStatus(1);
		setMessage("添加成功！");
		return SUCCESS;
	}
	  
	/** 
	* @Title: updateTeacher 
	* @Description: TODO   修改教师信息
	* @return   
	*/ 
	public String updateTeacher(){
		RTeacher teacherTemp = (RTeacher) baseService.getEntity(RTeacher.class, getId());
		teacherTemp.setDegree(teacher.getDegree());
		teacherTemp.setHobby(teacher.getHobby());
		teacherTemp.setTel1(teacher.getTel1());
		teacherTemp.setEmail(teacher.getEmail());
		baseService.update(teacherTemp);
		setStatus(1);
		setMessage("修改成功！");
		return SUCCESS;
	}
	
	
	/** 
	* @Title: deleteTeacher 
	* @Description: TODO   删除教师信息
	* @return   
	*/ 
	public String deleteTeacher(){
		baseService.delete(teacherList);
		return SUCCESS;
	}
	
	
	/** 
	* @Title: showTeacher 
	* @Description: TODO   查看教师信息
	* @return   
	*/ 
	public String showTeacher(){
		teacher = (RTeacher) baseService.getEntity(RTeacher.class, getId());
		return SUCCESS;
	}
	
	/** 
	* @Title: batchAddStudent 
	* @Description: TODO   从excle批量添加学生
	* @return   
	*/ 
	public String batchAddStudent(){
		
		return SUCCESS;
	}
	
	
	/** --------------------------------setter and getter -----------------------------------------------------------------------
	 * @param backPageService 要设置的 backPageService 
	 */
	public void setBackPageService(BackPageService backPageService) {
		this.backPageService = backPageService;
	}

	/** 
	 * @return college 
	 */
	public String getCollege() {
		return college;
	}

	/** 
	 * @param college 要设置的 college 
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	/** 
	 * @return sclass 
	 */
	public String getSclass() {
		return sclass;
	}

	/** 
	 * @param sclass 要设置的 sclass 
	 */
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}


	/** 
	 * @return schoole 
	 */
	public RSchool getSchoole() {
		return schoole;
	}

	/** 
	 * @param schoole 要设置的 schoole 
	 */
	public void setSchoole(RSchool schoole) {
		this.schoole = schoole;
	}

	/** 
	 * @return academy 
	 */
	public RAcademy getAcademy() {
		return academy;
	}

	/** 
	 * @param academy 要设置的 academy 
	 */
	public void setAcademy(RAcademy academy) {
		this.academy = academy;
	}

	/** 
	 * @return rClass 
	 */
	public RClass getrClass() {
		return rClass;
	}

	/** 
	 * @param rClass 要设置的 rClass 
	 */
	public void setrClass(RClass rClass) {
		this.rClass = rClass;
	}

	/** 
	 * @return studentList 
	 */
	public List<RStudent> getStudentList() {
		return studentList;
	}

	/** 
	 * @param studentList 要设置的 studentList 
	 */
	public void setStudentList(List<RStudent> studentList) {
		this.studentList = studentList;
	}

	/** 
	 * @param student 要设置的 student 
	 */
	public void setStudent(RStudent student) {
		this.student = student;
	}

	/** 
	 * @return backPageService 
	 */
	public BackPageService getBackPageService() {
		return backPageService;
	}

	/** 
	 * @return student 
	 */
	public RStudent getStudent() {
		return student;
	}

	/** 
	 * @return teacher 
	 */
	public RTeacher getTeacher() {
		return teacher;
	}

	/** 
	 * @param teacher 要设置的 teacher 
	 */
	public void setTeacher(RTeacher teacher) {
		this.teacher = teacher;
	}

	/** 
	 * @return teacherList 
	 */
	public List<RTeacher> getTeacherList() {
		return teacherList;
	}

	/** 
	 * @param teacherList 要设置的 teacherList 
	 */
	public void setTeacherList(List<RTeacher> teacherList) {
		this.teacherList = teacherList;
	}
	
}
