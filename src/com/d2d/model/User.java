package com.d2d.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Package Name: com.d2d.model
 * Author: chandrav
 */
@XmlRootElement( name = "user" )
public class User
{
	private String firstName;
	private String lastName;
	private int age;
	private String email;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName( final String firstName )
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName( final String lastName )
	{
		this.lastName = lastName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge( final int age )
	{
		this.age = age;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail( final String email )
	{
		this.email = email;
	}
}
