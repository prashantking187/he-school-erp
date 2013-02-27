package org.rschool.entity.hibernate;

/**
 * RResourceType entity. @author MyEclipse Persistence Tools
 */

public class RResourceType implements java.io.Serializable {

	// Fields

	private long id;
	private String name;

	// Constructors

	/** default constructor */
	public RResourceType() {
	}

	/** full constructor */
	public RResourceType(String name) {
		this.name = name;
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

}