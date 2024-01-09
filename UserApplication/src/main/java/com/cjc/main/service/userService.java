package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.User;

public interface userService {

	public void saveData(User u);

	public User searchUserbyemail(String email);

	public List<User> getAllproducts();

}
