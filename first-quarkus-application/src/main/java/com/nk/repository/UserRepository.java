package com.nk.repository;

import javax.enterprise.context.ApplicationScoped;

import com.nk.entity.User;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

/**
 * @author Naresh kumar
 *
 */

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User, Integer> {
	
}
