package org.rschool.entity.hibernate;

/**
 * RStudent entity. @author MyEclipse Persistence Tools
 */

public class RStudent implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String sno;
	private String sclass;
	private String college;
	private String major;
	private String tel1;
	private String tel2;
	private String tel3;
	private String email;
	private String qq;
	private String hobby;
	private String pic;
	private Double score;
	private String remark;

	// Constructors

	/** default constructor */
	public RStudent() {
	}

	/** full constructor */
	public RStudent(String name, String sno, String sclass, String college,
			String major, String tel1, String tel2, String tel3, String email,
			String qq, String hobby, String pic, Double score, String remark) {
		this.name = name;
		this.sno = sno;
		this.sclass = sclass;
		this.college = college;
		this.major = major;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.tel3 = tel3;
		this.email = email;
		this.qq = qq;
		this.hobby = hobby;
		this.pic = pic;
		this.score = score;
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

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSclass() {
		return this.sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getTel1() {
		return this.tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return this.tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel3() {
		return this.tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getHobby() {
		return this.hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}