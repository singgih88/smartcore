package com.media.smartcore.entity;
// Generated Aug 25, 2017 3:08:59 PM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * ScGroup generated by hbm2java
 */
@Entity
@Table(name = "SC_GROUP")
public class ScGroup extends BaseEntity implements java.io.Serializable {

	private String name;
	private String creatorId;
	private Date createDate;

	public ScGroup() {
	}

	public ScGroup(String id) {
		this.id = id;
	}

	public ScGroup(String id, String name, String creatorId, Date createDate) {
		this.id = id;
		this.name = name;
		this.creatorId = creatorId;
		this.createDate = createDate;
	}

	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)")
	public String getId() {
		return this.id;
	}

	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CREATOR_ID", length = 64)
	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", length = 7)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
