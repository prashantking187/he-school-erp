package org.rschool.entity.hibernate;

/**
 * RClass entity. @author MyEclipse Persistence Tools
 */

public class RClass implements java.io.Serializable {

	// Fields

	private long id;
	private String cno;
	private long stunum;
	private String direction;
	private long teacherid;
	private long monitorid;
	private long schoolid;
	private long academyid;

	// Constructors

	/** default constructor */
	public RClass() {
	}

	/** full constructor */
	public RClass(String cno, long stunum, String direction, long teacherid,
			long monitorid, long schoolid, long academyid) {
		this.cno = cno;
		this.stunum = stunum;
		this.direction = direction;
		this.teacherid = teacherid;
		this.monitorid = monitorid;
		this.schoolid = schoolid;
		this.academyid = academyid;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCno() {
		return this.cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public long getStunum() {
		return this.stunum;
	}

	public void setStunum(long stunum) {
		this.stunum = stunum;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public long getTeacherid() {
		return this.teacherid;
	}

	public void setTeacherid(long teacherid) {
		this.teacherid = teacherid;
	}

	public long getMonitorid() {
		return this.monitorid;
	}

	public void setMonitorid(long monitorid) {
		this.monitorid = monitorid;
	}

	public long getSchoolid() {
		return this.schoolid;
	}

	public void setSchoolid(long schoolid) {
		this.schoolid = schoolid;
	}

	public long getAcademyid() {
		return this.academyid;
	}

	public void setAcademyid(long academyid) {
		this.academyid = academyid;
	}

}