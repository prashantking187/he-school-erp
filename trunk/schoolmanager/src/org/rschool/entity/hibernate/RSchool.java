package org.rschool.entity.hibernate;

/**
 * RSchool entity. @author MyEclipse Persistence Tools
 */

public class RSchool implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String location;
	private String phone;
	private String information;

	// Constructors

	/** default constructor */
	public RSchool() {
	}

	/** full constructor */
	public RSchool(String name, String location, String phone,
			String information) {
		this.name = name;
		this.location = location;
		this.phone = phone;
		this.information = information;
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInformation() {
		return this.information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

}