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
//import javax.persistence.ManyToMany;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
///**
// *
// * @author 歐炫
// */
//@Entity
//@Table(name = "user_account", catalog = "securityscl", schema = "public")
//@NamedQueries({
//	@NamedQuery(name = "UserAccount.findAll", query = "SELECT u FROM UserAccount u")})
//public class UserAccount implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	@Basic(optional = false)
//	@Column(name = "id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	private Long id;
//
//	@Basic(optional = false)
//	@Column(name = "fullname", nullable = false, length = 2147483647)
//	@NotNull
//	private String fullname;
//	// @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
//	@Basic(optional = false)
//	@Column(name = "email", nullable = false, length = 2147483647)
//	@NotNull
//	private String email;
//
//	@Basic(optional = false)
//	@Column(name = "shadow", nullable = false, length = 2147483647)
//	@NotNull
//	private String shadow;
//
//	@Basic(optional = false)
//	@Column(name = "enabled", nullable = false)
//	@NotNull
//	private boolean enabled;
//
//	@ManyToMany(mappedBy = "userAccountCollection")
//	private Collection<Role> roleCollection;
//
//	public UserAccount() {
//		super();
//		this.shadow = "123";
//		this.enabled = false;
//	}
//
//	public UserAccount(Long id) {
//		this.id = id;
//	}
//
//	public UserAccount(Long id, String fullname, String email, String shadow, boolean enabled) {
//		this.id = id;
//		this.fullname = fullname;
//		this.email = email;
//		this.shadow = shadow;
//		this.enabled = enabled;
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
//	public String getFullname() {
//		return fullname;
//	}
//
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getShadow() {
//		return shadow;
//	}
//
//	public void setShadow(String shadow) {
//		this.shadow = shadow;
//	}
//
//	public boolean isEnabled() {
//		return enabled;
//	}
//
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
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
//		if (!(object instanceof UserAccount)) {
//			return false;
//		}
//		UserAccount other = (UserAccount) object;
//		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//			return false;
//		}
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "com.security.demo.entity.UserAccount[ id=" + id + " ]";
//	}
//
//}
