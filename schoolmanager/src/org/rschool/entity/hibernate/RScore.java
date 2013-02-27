package org.rschool.entity.hibernate;

/**
 * RScore entity. @author MyEclipse Persistence Tools
 */

public class RScore implements java.io.Serializable {

	// Fields

	private Long id;
	private String studentid;
	private String sclassid;
	private String collegeid;
	private String major;
	private String courseid;
	private Double score;
	private Double credit;
	private String remark;

	// Constructors

	/** default constructor */
	public RScore() {
	}

	/** full constructor */
	public RScore(String studentid, String sclassid, String collegeid,
			String major, String courseid, Double score, Double credit,
			String remark) {
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getCredit() {
		return this.credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}