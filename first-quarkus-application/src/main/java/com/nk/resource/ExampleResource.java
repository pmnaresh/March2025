package com.nk.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class ExampleResource {

	@GET
	public String hello() {

		return "Hello, World!";
	}
}
