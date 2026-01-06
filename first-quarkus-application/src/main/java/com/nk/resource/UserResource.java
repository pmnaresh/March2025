package com.nk.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import com.nk.entity.User;
import com.nk.service.UserService;

/**
 * @author Naresh kumar
 *
 */

@Path("/users")
@ApplicationScoped
public class UserResource {

	@Inject
	UserService userService;
	
//	{
//		  "userId": 12,
//		  "userFirstName": "Naresh",
//		  "userLastName": "kumar",
//		  "userContactNumber": 9908692445,
//		  "userAddress": "angallu"
//		  
//		}

	@POST
	@Path("/addUser")
	public Response createUser(@RequestBody User user) {
		System.out.println("Received user: " + user);
		return userService.createUserRecord(user);
	}

}
