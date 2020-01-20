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
//	@NamedQuery(name = "Privileges.findAll", query = "SELECT p FROM Privileges p")})
//public class Privilege implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	@Basic(optional = false)
//	@Column(nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	private Long id;
//
//        @Column(name = "display_name")
//	private String name;
//
//	@JoinTable(name = "roles_privileges", joinColumns = {
//		@JoinColumn(name = "privilege_id", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
//		@JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)})
//	@ManyToMany
//	private Collection<Role> roleCollection;
//
//	public Privilege(final String name) {
//		super();
//		this.name = name;
//	}
//
//	public Privilege(Long id) {
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
//	public Collection<Role> getRoleCollection() {
//		return roleCollection;
//	}
//
//	public void setRoleCollection(Collection<Role> roleCollection) {
//		this.roleCollection = roleCollection;
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
//		if (!(object instanceof Privilege)) {
//			return false;
//		}
//		Privilege other = (Privilege) object;
//		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//			return false;
//		}
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "com.security.demo.entity.Privilege[ id=" + id + " ]";
//	}
//
//}
