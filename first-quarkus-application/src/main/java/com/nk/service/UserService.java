package com.nk.service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;

import com.nk.entity.User;
import com.nk.repository.UserRepository;


/**
 * @author Naresh kumar
 *
 */

@ApplicationScoped
public class UserService {

	@Inject
	UserRepository userRepo;

	@Transactional
	public Response createUserRecord(User user) {
		user.setCreatedTimeStamp(Timestamp.valueOf(LocalDateTime.now()));
		userRepo.persistAndFlush(user);
		System.out.println("Saved successfully");
		return Response.ok("User added").build();
	}

}
