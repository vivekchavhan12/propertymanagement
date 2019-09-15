package com.example.propertytest;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Property {
@Id
private int pId;
private String pName;
private String pAddress;
private String pLocation;
@ManyToOne(cascade = CascadeType.ALL)
private Owner Owner;
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpAddress() {
	return pAddress;
}
public void setpAddress(String pAddress) {
	this.pAddress = pAddress;
}
public String getpLocation() {
	return pLocation;
}
public void setpLocation(String pLocation) {
	this.pLocation = pLocation;
}
public Owner getOwner() {
	return Owner;
}
public void setOwner(Owner owner) {
	Owner = owner;
}
@Override
public String toString() {
	return "Property [pId=" + pId + ", pName=" + pName + ", pAddress=" + pAddress + ", pLocation=" + pLocation
			+ ", Owner=" + Owner + "]";
}
public Property(int pId, String pName, String pAddress, String pLocation, com.example.propertytest.Owner owner) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.pAddress = pAddress;
	this.pLocation = pLocation;
	Owner = owner;
}
public Property() {
	super();
	// TODO Auto-generated constructor stub
}


}
