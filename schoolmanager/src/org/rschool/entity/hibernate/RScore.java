package org.rschool.entity.hibernate;

import java.sql.Clob;

/**
 * RScore entity. @author MyEclipse Persistence Tools
 */

public class RScore implements java.io.Serializable {

	// Fields

	private long id;
	private String studentid;
	private String sclassid;
	private String collegeid;
	private String major;
	private String courseid;
	private double score;
	private double credit;
	private Clob remark;

	// Constructors

	/** default constructor */
	public RScore() {
	}

	/** full constructor */
	public RScore(String studentid, String sclassid, String collegeid,
			String major, String courseid, double score, double credit,
			Clob remark) {
		this.studentid = studentid;
		this.sclassid = sclassid;
		this.collegeid = collegeid;
		this.major = major;
		this.courseid = courseid;
		this.score = score;
		this.credit = credit;
		this.remark = remark;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentid() {
		return this.studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getSclassid() {
		return this.sclassid;
	}

	public void setSclassid(String sclassid) {
		this.sclassid = sclassid;
	}

	public String getCollegeid() {
		return this.collegeid;
	}

	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCourseid() {
		return this.courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public double getScore() {
		return this.score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getCredit() {
		return this.credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public Clob getRemark() {
		return this.remark;
	}

	public void setRemark(Clob remark) {
		this.remark = remark;
	}

}