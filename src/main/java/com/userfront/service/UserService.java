package com.userfront.service;

import com.userfront.domain.User;

public interface UserService {
	
	public User findByUsername(String username);
	
	public User findByEmail(String email);
	
	public boolean checkUserExists(String username, String email);
	
	public boolean checkUsernameExists(String username);
	
	public boolean checkEmailExists(String email);

	void save(User user);

}
