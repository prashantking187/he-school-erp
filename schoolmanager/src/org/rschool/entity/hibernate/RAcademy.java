package org.rschool.entity.hibernate;

/**
 * RAcademy entity. @author MyEclipse Persistence Tools
 */

public class RAcademy implements java.io.Serializable {

	// Fields

	private long id;
	private String name;
	private long schoolid;

	// Constructors

	/** default constructor */
	public RAcademy() {
	}

	/** full constructor */
	public RAcademy(String name, long schoolid) {
		this.name = name;
		this.schoolid = schoolid;
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

	public long getSchoolid() {
		return this.schoolid;
	}

	public void setSchoolid(long schoolid) {
		this.schoolid = schoolid;
	}

}