package com.d2d.services;

import com.d2d.model.User;

import javax.jws.WebService;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Package Name: com.d2d.ws.registerUser
 * Author: chandrav
 */
@WebService(endpointInterface = "com.d2d.services.IUserRegistration", serviceName = "RegisterUserService", portName = "RegisterUserServicePort")
public class UserRegistration implements IUserRegistration
{
	private final static String FILE_NAME = "F:\\tmp\\registration.txt";
	private static Random random = new Random();

	@Override
	public String registerUser( final User user )
	{
		if ( user != null )
		{
			return registerUserDetails( user );
		}
		return null;
	}

	@Override
	public List<User> getRegisteredUsers()
	{
		List<User> registeredUsers = new ArrayList<>();

		synchronized ( this )
		{
			try ( BufferedReader br = new BufferedReader( new FileReader( FILE_NAME ) ) )
			{
				String userDetails = null;

				while ( ( userDetails = br.readLine() ) != null )
				{
					String[] tokens = userDetails.split( "#" );
					if ( tokens != null && tokens.length == 5 )
					{
						User user = new User();
						user.setFirstName( tokens[1] );
						user.setLastName( tokens[2] );
						user.setEmail( tokens[3] );
						user.setAge( Integer.valueOf( tokens[4] ) );
						registeredUsers.add( user );
					}
				}
			}
			catch ( Exception ex )
			{
				System.err.println( ex.getMessage() );
			}
		}

		return registeredUsers;
	}

	private String registerUserDetails( User user )
	{
		String registrationId = "RG" + random.nextInt( 10000 );

		synchronized ( this )
		{
			try ( BufferedWriter br = new BufferedWriter( new FileWriter( FILE_NAME, true ) ) )
			{
				// registrationid#firstName#lastName#email#age
				String line = registrationId + "#" + user.getFirstName() + "#" + user.getLastName() + "#" + user.getEmail() + "#" + user.getAge() + "\n";
				br.write( line );
			}
			catch ( Exception ex )
			{
				registrationId = null;
				ex.printStackTrace();
			}
		}
		return registrationId;
	}
}
