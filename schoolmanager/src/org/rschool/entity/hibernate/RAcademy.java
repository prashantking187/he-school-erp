package org.rschool.entity.hibernate;

/**
 * RAcademy entity. @author MyEclipse Persistence Tools
 */

public class RAcademy implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Long schoolid;

	// Constructors

	/** default constructor */
	public RAcademy() {
	}

	/** full constructor */
	public RAcademy(String name, Long schoolid) {
		this.name = name;
		this.schoolid = schoolid;
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

	public Long getSchoolid() {
		return this.schoolid;
	}

	public void setSchoolid(Long schoolid) {
		this.schoolid = schoolid;
	}

}