package com.example.propertytest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceImpl implements Services{

	static {
		System.out.println("service");
	}	
	@Autowired
	Dao dao;
	
	
	@Override
	public List<Owner> getAllOwner() {

		return dao.findAll();
	}

	@Override
	public Owner getOwner(int ownerId) {

		List<Owner> own = getAllOwner();
		for(Owner owner:own) {
			if(owner.getOwnerId()==ownerId) {
				dao.findById(ownerId);
				System.out.println("Owner found");
				return owner;
			}
		}
		
		
		return null;
	}

	@Override
	public boolean addOwner(Owner own) {
		dao.save(own);
		return true;
	}

}
