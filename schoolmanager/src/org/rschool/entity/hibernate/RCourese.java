package org.rschool.entity.hibernate;

/**
 * RCourese entity. @author MyEclipse Persistence Tools
 */

public class RCourese implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String schoolid;
	private String academyid;
	private String remark;

	// Constructors

	/** default constructor */
	public RCourese() {
	}

	/** full constructor */
	public RCourese(String name, String schoolid, String academyid,
			String remark) {
		this.name = name;
		this.schoolid = schoolid;
		this.academyid = academyid;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}