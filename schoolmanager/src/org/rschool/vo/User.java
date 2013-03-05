/**  
* @Title: User.java 
* @Package org.rschool.vo 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-3-3 下午3:14:29 
* @version V1.0  
*/ 
package org.rschool.vo;

/** 
 * @ClassName: User 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-3-3 下午3:14:29 
 *  
 */
public class User extends org.ralasafe.user.User{
	private Long id;
	private String name;
	private String loginName;
	private String password;
	private Long schoolId;
	private Long academyId;
	private Long classId;
	private String isManager;
	private String schoolLevel;
	/** 
	 * @return id 
	 */
	public Long getId() {
		return id;
	}
	/** 
	 * @param id 要设置的 id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/** 
	 * @return name 
	 */
	public String getName() {
		return name;
	}
	/** 
	 * @param name 要设置的 name 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** 
	 * @return loginName 
	 */
	public String getLoginName() {
		return loginName;
	}
	/** 
	 * @param loginName 要设置的 loginName 
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/** 
	 * @return password 
	 */
	public String getPassword() {
		return password;
	}
	/** 
	 * @param password 要设置的 password 
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/** 
	 * @return isManager 
	 */
	public String getIsManager() {
		return isManager;
	}
	/** 
	 * @param isManager 要设置的 isManager 
	 */
	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}
	/** 
	 * @return schoolId 
	 */
	public Long getSchoolId() {
		return schoolId;
	}
	/** 
	 * @param schoolId 要设置的 schoolId 
	 */
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	/** 
	 * @return academyId 
	 */
	public Long getAcademyId() {
		return academyId;
	}
	/** 
	 * @param academyId 要设置的 academyId 
	 */
	public void setAcademyId(Long academyId) {
		this.academyId = academyId;
	}
	/** 
	 * @return classId 
	 */
	public Long getClassId() {
		return classId;
	}
	/** 
	 * @param classId 要设置的 classId 
	 */
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	/** 
	 * @return schoolLevel 
	 */
	public String getSchoolLevel() {
		return schoolLevel;
	}
	/** 
	 * @param schoolLevel 要设置的 schoolLevel 
	 */
	public void setSchoolLevel(String schoolLevel) {
		this.schoolLevel = schoolLevel;
	}
	
	
}
