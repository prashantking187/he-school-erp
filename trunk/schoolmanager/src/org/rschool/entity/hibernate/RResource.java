package org.rschool.entity.hibernate;

/**
 * RResource entity. @author MyEclipse Persistence Tools
 */

public class RResource implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Long typeid;

	// Constructors

	/** default constructor */
	public RResource() {
	}

	/** full constructor */
	public RResource(String name, Long typeid) {
		this.name = name;
		this.typeid = typeid;
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

	public Long getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

}