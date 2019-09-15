package com.example.propertytest;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {
    @Id
	private int ownerId;
	private String ownerName;
	private String email;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "Owner")
	List<Property> property;
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Property> getProperty() {
		return property;
	}
	public void setProperty(List<Property> property) {
		this.property = property;
	}
	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", email=" + email + ", property=" + property
				+ "]";
	}
	public Owner(int ownerId, String ownerName, String email, List<Property> property) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.email = email;
		this.property = property;
	}
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
