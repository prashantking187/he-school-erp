package org.rschool.entity.hibernate;

import java.sql.Blob;
import java.sql.Clob;

/**
 * RTeacher entity. @author MyEclipse Persistence Tools
 */

public class RTeacher implements java.io.Serializable {

	// Fields

	private long id;
	private String name;
	private String tno;
	private String title;
	private String dep;
	private String direction;
	private String degree;
	private long schoolid;
	private long academyid;
	private String tel1;
	private String tel2;
	private String tel3;
	private String email;
	private String qq;
	private Clob hobby;
	private Blob picture;
	private Clob remark;

	// Constructors

	/** default constructor */
	public RTeacher() {
	}

	/** full constructor */
	public RTeacher(String name, String tno, String title, String dep,
			String direction, String degree, long schoolid, long academyid,
			String tel1, String tel2, String tel3, String email, String qq,
			Clob hobby, Blob picture, Clob remark) {
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

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public long getSchoolid() {
		return this.schoolid;
	}

	public void setSchoolid(long schoolid) {
		this.schoolid = schoolid;
	}

	public long getAcademyid() {
		return this.academyid;
	}

	public void setAcademyid(long academyid) {
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

	public Clob getHobby() {
		return this.hobby;
	}

	public void setHobby(Clob hobby) {
		this.hobby = hobby;
	}

	public Blob getPicture() {
		return this.picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public Clob getRemark() {
		return this.remark;
	}

	public void setRemark(Clob remark) {
		this.remark = remark;
	}

}