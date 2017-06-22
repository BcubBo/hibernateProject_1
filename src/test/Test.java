package test;

import biz.UserBiz;
import po.User;

public class Test {
	
	public static void main(String[]args){
		
		
		User user = new User();
		
		user.setName("testUser1");
		user.setPassword("nnnnnn");
		
		UserBiz biz = new UserBiz();
		biz.addNewUser(user);
		System.out.println("ok");
		
		
	}
	
	
}
