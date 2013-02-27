package org.rschool.entity.hibernate;

/**
 * RResource entity. @author MyEclipse Persistence Tools
 */

public class RResource implements java.io.Serializable {

	// Fields

	private long id;
	private String name;
	private long typeid;

	// Constructors

	/** default constructor */
	public RResource() {
	}

	/** full constructor */
	public RResource(String name, long typeid) {
		this.name = name;
		this.typeid = typeid;
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

	public long getTypeid() {
		return this.typeid;
	}

	public void setTypeid(long typeid) {
		this.typeid = typeid;
	}

}