package com.d2d.controller;

import com.d2d.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Package Name: com.d2d.controller
 * Author: chandrav
 */
@Path( "/test" )
public class TestController
{
	@GET
	@Path( "/" )
	@Produces( {"application/xml", "application/json"} )
	public User getAllUsers()
	{
		System.out.println( "Inside getAllUsers()" );
		User u = new User();
		u.setFirstName( "Chandra" );
		u.setLastName( "V" );
		u.setEmail( "chandrav@niyasys.com" );
		u.setAge( 22 );

		return u;
	}
}
