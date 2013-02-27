package org.rschool.entity.hibernate;

/**
 * RClassId entity. @author MyEclipse Persistence Tools
 */

public class RClassId implements java.io.Serializable {

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
	public RClassId() {
	}

	/** full constructor */
	public RClassId(Long id, String cno, Long stunum, String direction,
			Long teacherid, Long monitorid, Long schoolid, Long academyid) {
		this.id = id;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RClassId))
			return false;
		RClassId castOther = (RClassId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getCno() == castOther.getCno()) || (this.getCno() != null
						&& castOther.getCno() != null && this.getCno().equals(
						castOther.getCno())))
				&& ((this.getStunum() == castOther.getStunum()) || (this
						.getStunum() != null && castOther.getStunum() != null && this
						.getStunum().equals(castOther.getStunum())))
				&& ((this.getDirection() == castOther.getDirection()) || (this
						.getDirection() != null
						&& castOther.getDirection() != null && this
						.getDirection().equals(castOther.getDirection())))
				&& ((this.getTeacherid() == castOther.getTeacherid()) || (this
						.getTeacherid() != null
						&& castOther.getTeacherid() != null && this
						.getTeacherid().equals(castOther.getTeacherid())))
				&& ((this.getMonitorid() == castOther.getMonitorid()) || (this
						.getMonitorid() != null
						&& castOther.getMonitorid() != null && this
						.getMonitorid().equals(castOther.getMonitorid())))
				&& ((this.getSchoolid() == castOther.getSchoolid()) || (this
						.getSchoolid() != null
						&& castOther.getSchoolid() != null && this
						.getSchoolid().equals(castOther.getSchoolid())))
				&& ((this.getAcademyid() == castOther.getAcademyid()) || (this
						.getAcademyid() != null
						&& castOther.getAcademyid() != null && this
						.getAcademyid().equals(castOther.getAcademyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getCno() == null ? 0 : this.getCno().hashCode());
		result = 37 * result
				+ (getStunum() == null ? 0 : this.getStunum().hashCode());
		result = 37 * result
				+ (getDirection() == null ? 0 : this.getDirection().hashCode());
		result = 37 * result
				+ (getTeacherid() == null ? 0 : this.getTeacherid().hashCode());
		result = 37 * result
				+ (getMonitorid() == null ? 0 : this.getMonitorid().hashCode());
		result = 37 * result
				+ (getSchoolid() == null ? 0 : this.getSchoolid().hashCode());
		result = 37 * result
				+ (getAcademyid() == null ? 0 : this.getAcademyid().hashCode());
		return result;
	}

}