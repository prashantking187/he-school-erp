package org.rschool.entity.hibernate;

/**
 * RTeacher entity. @author MyEclipse Persistence Tools
 */

public class RTeacher implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String tno;
	private String title;
	private String dep;
	private String direction;
	private String degree;
	private Long schoolid;
	private Long academyid;
	private String tel1;
	private String tel2;
	private String tel3;
	private String email;
	private String qq;
	private String hobby;
	private String picture;
	private String remark;

	// Constructors

	/** default constructor */
	public RTeacher() {
	}

	/** full constructor */
	public RTeacher(String name, String tno, String title, String dep,
			String direction, String degree, Long schoolid, Long academyid,
			String tel1, String tel2, String tel3, String email, String qq,
			String hobby, String picture, String remark) {
		this.name = name;
		this.tno = tno;
		this.title = title;
		this.dep = dep;
		this.direction = direction;
		this.degree = degree;
		this.schoolid = schoolid;
		this.academyid = academyid;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.tel3 = tel3;
		this.email = email;
		this.qq = qq;
		this.hobby = hobby;
		this.picture = picture;
		this.remark = remark;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTno() {
		return this.tno;
	}

	public void setTno(String tno) {
		this.tno = tno;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDep() {
		return this.dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Long getSchoolid() {
		return this.schoolid;
	}

	public void setSchoolid(Long schoolid) {
		this.schoolid = schoolid;
	}

	public Long getAcademyid() {
		return this.academyid;
	}

	public void setAcademyid(Long academyid) {
		this.academyid = academyid;
	}

	public String getTel1() {
		return this.tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return this.tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel3() {
		return this.tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getHobby() {
		return this.hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}