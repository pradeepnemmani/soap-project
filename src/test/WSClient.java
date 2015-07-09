package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Package Name: test
 * Author: chandrav
 */
public class WSClient
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext( "test/cxf-client.xml" );
//		IUserRegistration userRegistration = (IUserRegistration) ctxt.getBean( "cxfClient" );
//		String regId = userRegistration.registerUser( "Larry", "Page", "larry.page@google.com" );
//		System.out.println( "Registration Id : " + regId );
	}
}
