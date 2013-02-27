package org.rschool.entity.hibernate;

import java.sql.Clob;

/**
 * RCourese entity. @author MyEclipse Persistence Tools
 */

public class RCourese implements java.io.Serializable {

	// Fields

	private long id;
	private String name;
	private String schoolid;
	private String academyid;
	private Clob remark;

	// Constructors

	/** default constructor */
	public RCourese() {
	}

	/** full constructor */
	public RCourese(String name, String schoolid, String academyid, Clob remark) {
		this.name = name;
		this.schoolid = schoolid;
		this.academyid = academyid;
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

	public String getSchoolid() {
		return this.schoolid;
	}

	public void setSchoolid(String schoolid) {
		this.schoolid = schoolid;
	}

	public String getAcademyid() {
		return this.academyid;
	}

	public void setAcademyid(String academyid) {
		this.academyid = academyid;
	}

	public Clob getRemark() {
		return this.remark;
	}

	public void setRemark(Clob remark) {
		this.remark = remark;
	}

}