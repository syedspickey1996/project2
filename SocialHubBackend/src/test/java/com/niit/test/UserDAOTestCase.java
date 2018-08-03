package com.niit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.model.UserDetail;



public class UserDAOTestCase
{
	static UserDAO userDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");
		
	}
	
	@Test
	public void registerUserTestCase()
	{
		UserDetail userDetail=new UserDetail();
		
		userDetail.setLoginname("syed1");
		userDetail.setPassword("syed");
		userDetail.setUsername("syed1");
		userDetail.setEmailid("syedshaha96@gmail.com");
		userDetail.setRole("ROLE_ADMIN");
		userDetail.setAddress("chennai");
		userDetail.setMobile("9789988976");
		
		assertTrue("Problem in Registering the User:",userDAO.registerUser(userDetail));
	}
	@Ignore
	@Test
	public void updateUserTestCase()
	{
		UserDetail userDetail=userDAO.getUser("rajesh");
		userDetail.setMobile("9988987755");
		
		assertTrue("Problem in Updating User:",userDAO.updateUser(userDetail));
	}
	
	@Test
	public void checkLoginTestCase()
	{
		UserDetail userDetail=new UserDetail();
		userDetail.setLoginname("rajesh");
		userDetail.setPassword("pass123");
		
		UserDetail userDetail1=userDAO.checkUser(userDetail);
		
		assertNotNull("Problem in loginCheck",userDetail1);
		System.out.println("User Name:"+userDetail1.getUsername());
	}
}
