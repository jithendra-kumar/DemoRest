package com.practice.DemoRest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresources")
public class AlianResources {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List <Alian> getResources() {
		
		
		Alian a1=new Alian();
		
		
		a1.setName("Jithendra");
		a1.setCount(99);
		
		Alian a2= new Alian();
		a2.setName("Likith");
		a2.setCount(100);
		
		List <Alian> list = Arrays.asList(a1,a2);
		
		return list;
		
		
		
		
	}

}
