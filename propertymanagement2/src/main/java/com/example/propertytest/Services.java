package com.example.propertytest;

import java.util.List;

public interface Services  {

	
	public List<Owner> getAllOwner();
	public Owner getOwner(int ownerId);
	public boolean addOwner(Owner own);
	
	
	
	
	
}
