package com.niit.dao;

import com.niit.model.UserDetail;

public interface UserDAO
{
public boolean registerUser(UserDetail userDetail);
public boolean updateUser(UserDetail userDetail);
public UserDetail getUser(String loginname);
public UserDetail checkUser(UserDetail userDetail);
}
