package com.cjc.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.User;
import com.cjc.main.repository.UserRepository;
import com.cjc.main.service.userService;

@Service
public class Userserviceimpl implements userService{

	@Autowired
	UserRepository ur;
	
	@Override
	public void saveData(User u) {
		
		ur.save(u);
	}
	
	@Override
	public List<User> getAllproducts() {


		return (List<User>) ur.findAll();
	}


	@Override
	public User searchUserbyemail(String email) {
		// TODO Auto-generated method stub
		return ur.findByEmail(email);
	}


	@Override
	public User getSingleData(int userid) {
		// TODO Auto-generated method stub
		Optional<User> u = ur.findById(userid);
		return u.get();
	}

	

}
