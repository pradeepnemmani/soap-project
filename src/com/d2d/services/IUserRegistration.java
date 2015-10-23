package com.d2d.services;

import com.d2d.model.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Package Name: com.d2d.ws.registerUser
 * Author: pradeepN
 */
@WebService( name = "RegisterUserInterface" )
@SOAPBinding( style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE, use = SOAPBinding.Use.LITERAL )
public interface IUserRegistration
{
	@WebMethod( operationName = "registerUser" )
	@WebResult( name = "registrationId" )
	String registerUser( @WebParam( name = "user" ) User user );

	@WebMethod( operationName = "getRegisteredUsers" )
	@WebResult( name = "registeredUsers" )
	List<User> getRegisteredUsers();
}
