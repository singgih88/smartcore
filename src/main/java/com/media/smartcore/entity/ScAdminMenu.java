package com.media.smartcore.entity;
// Generated Aug 25, 2017 9:03:31 AM by Hibernate Tools 3.5.0.Final

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
 * ScAdminMenu generated by hbm2java
 */
@Entity
@Table(name = "SC_ADMIN_MENU")
public class ScAdminMenu extends BaseEntity implements java.io.Serializable {

	private String url;
	private String title;
	private String description;
	private Integer type;
	private String parentId;
	private Integer status;
	private String scRightAlias;
	private String icon;
	private String alias;
	private String creatorId;
	private Date createDate;

	public ScAdminMenu() {
	}

	public ScAdminMenu(String id) {
		this.id = id;
	}

	public ScAdminMenu(String id, String url, String title, String description, Integer type, String parentId,
			Integer status, String scRightAlias, String icon, String alias, String creatorId, Date createDate) {
		this.id = id;
		this.url = url;
		this.title = title;
		this.description = description;
		this.type = type;
		this.parentId = parentId;
		this.status = status;
		this.scRightAlias = scRightAlias;
		this.icon = icon;
		this.alias = alias;
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
	@Column(name = "URL", length = 500)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "TITLE", length = 500)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "DESCRIPTION", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "TYPE", precision = 4, scale = 0)
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "PARENT_ID", length = 64)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(name = "STATUS", precision = 4, scale = 0)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "SC_RIGHT_ALIAS", length = 500)
	public String getScRightAlias() {
		return this.scRightAlias;
	}

	public void setScRightAlias(String scRightAlias) {
		this.scRightAlias = scRightAlias;
	}

	@Column(name = "ICON", length = 50)
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "ALIAS", length = 100)
	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
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
