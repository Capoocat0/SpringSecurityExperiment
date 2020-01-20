//package com.security.demo.entity;
//
//import java.io.Serializable;
//import java.util.Collection;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.Size;
//
///**
// *
// * @author 歐炫
// */
//@Entity
//@Table(catalog = "securityscl", schema = "public", uniqueConstraints = {
//	@UniqueConstraint(columnNames = {"display_name"})})
//@NamedQueries({
//	@NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")})
//public class Role implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	@Basic(optional = false)
//	@Column(nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	private Long id;
//
//	@Column(name = "display_name")
//	private String name;
//
//	@JoinTable(name = "users_roles", joinColumns = {
//		@JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
//		@JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)})
//	@ManyToMany
//	private Collection<UserAccount> userAccountCollection;
//
//	@ManyToMany(mappedBy = "roleCollection")
//	private Collection<Privilege> privilegesCollection;
//
//	public Role(final String name) {
//		super();
//		this.name = name;
//	}
//
//	public Role(Long id) {
//		this.id = id;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Collection<UserAccount> getUserAccountCollection() {
//		return userAccountCollection;
//	}
//
//	public void setUserAccountCollection(Collection<UserAccount> userAccountCollection) {
//		this.userAccountCollection = userAccountCollection;
//	}
//
//	public Collection<Privilege> getPrivilegesCollection() {
//		return privilegesCollection;
//	}
//
//	public void setPrivilegesCollection(Collection<Privilege> privilegesCollection) {
//		this.privilegesCollection = privilegesCollection;
//	}
//
//	@Override
//	public int hashCode() {
//		int hash = 0;
//		hash += (id != null ? id.hashCode() : 0);
//		return hash;
//	}
//
//	@Override
//	public boolean equals(Object object) {
//		// TODO: Warning - this method won't work in the case the id fields are not set
//		if (!(object instanceof Role)) {
//			return false;
//		}
//		Role other = (Role) object;
//		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//			return false;
//		}
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "com.security.demo.entity.Role[ id=" + id + " ]";
//	}
//
//}
