package org.rschool.entity.hibernate;

/**
 * RClass entity. @author MyEclipse Persistence Tools
 */

public class RClass implements java.io.Serializable {

	// Fields

	private Long id;
	private String cno;
	private Long stunum;
	private String direction;
	private Long teacherid;
	private Long monitorid;
	private Long schoolid;
	private Long academyid;

	// Constructors

	/** default constructor */
	public RClass() {
	}

	/** full constructor */
	public RClass(String cno, Long stunum, String direction, Long teacherid,
			Long monitorid, Long schoolid, Long academyid) {
		this.cno = cno;
		this.stunum = stunum;
		this.direction = direction;
		this.teacherid = teacherid;
		this.monitorid = monitorid;
		this.schoolid = schoolid;
		this.academyid = academyid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCno() {
		return this.cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public Long getStunum() {
		return this.stunum;
	}

	public void setStunum(Long stunum) {
		this.stunum = stunum;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Long getTeacherid() {
		return this.teacherid;
	}

	public void setTeacherid(Long teacherid) {
		this.teacherid = teacherid;
	}

	public Long getMonitorid() {
		return this.monitorid;
	}

	public void setMonitorid(Long monitorid) {
		this.monitorid = monitorid;
	}

	public Long getSchoolid() {
		return this.schoolid;
	}

	public void setSchoolid(Long schoolid) {
		this.schoolid = schoolid;
	}

	public Long getAcademyid() {
		return this.academyid;
	}

	public void setAcademyid(Long academyid) {
		this.academyid = academyid;
	}

}