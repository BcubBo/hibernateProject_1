package test;

import java.util.Iterator;
import java.util.List;

import biz.UserBiz;
import po.User;

public class Test {
	
	public static void main(String[]args){
		
		
		User user = new User();
		user.setId(1005);
		user.setName("dynamicTest_changedTest");
		user.setPassword("223gdserds");
		
		UserBiz biz = new UserBiz();
		//List<User> users = biz.findUsers(null);
		
		 biz.test(user);
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");/*
		for(User u:users){
			
			System.out.println(u.getName()+"<>"+u.getPassword()+"<>"+u.getUsername());
			
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
			
			
		}*/
		

		
		
		
		
		
		
		//biz.addNewUser(user);
		//biz.delete(user);
		//user = biz.getUser(1001);
		//System.out.println(user.getName());
		System.out.println("成功");
		
		
	}
	
	
}
