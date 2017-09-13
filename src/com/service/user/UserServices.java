package com.service.user;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/user/service/")
public class UserServices {

	@PUT
	@Path("/create")
	public void createUser()
	{
		System.out.println("Inside the create method ");
	}
	@GET
	public void getUser()
	{
		System.out.println("Inside the getUser method ");
	}
	@POST
	public void updateUser()
	{
		System.out.println("Inside the updateUser method ");
	}
	@DELETE
	public void deleteUser()
	{
		System.out.println("Inside the delete method ");
	}
	@Path("/special")
	public SpecialUser getSpecialUser()
	{
		return new SpecialUser();
	}
}
