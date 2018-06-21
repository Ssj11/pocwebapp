package com.capgemini.pocwebapp.dao.api;

import java.util.List;

import com.capgemini.pocwebapp.dao.entity.User;
import com.capgemini.pocwebapp.dao.entity.UserInfo;
import com.capgemini.pocwebapp.dao.entity.UserProfileType;
import com.sun.javafx.collections.MappingChange.Map;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

	List<Object[]> UserProfileType();

	void updateUserInfos(List<UserInfo> p);

}

