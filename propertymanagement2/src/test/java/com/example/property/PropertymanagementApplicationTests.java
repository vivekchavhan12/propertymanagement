package com.example.property;

import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.propertytest.Owner;
import com.example.propertytest.Property;

import junit.framework.Assert;

public class PropertymanagementApplicationTests {
	  
	@Test
	public void testGetOwnerListSuccess() throws URISyntaxException, JSONException
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + 8080 + "/";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     System.out.println(result.getBody());
	     JSONArray arr = new JSONArray(result.getBody());
	     
	    for(int i=0; i<=arr.length()-1;i++) {
	    	//JSONObject owner = new JSONObject(arr[i]);
	    	JSONObject owner = arr.getJSONObject(i);
	    	Property pro = new Property();
	    Owner own = new Owner();
	    own.setEmail(owner.getString("email"));
	    own.setOwnerId(owner.getInt("ownerId"));
	    own.setOwnerName(owner.getString("ownerName"));
	   // own.setProperty(pro);
	    System.out.println(result.getStatusCode());
	     System.out.println("owner "+owner);
	     
		Assert.assertEquals(true, result.getBody().equals(own));
	     System.out.println("own "+own);
		
	}
	}
}