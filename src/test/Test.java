package test;

import biz.UserBiz;
import po.User;

public class Test {
	
	public static void main(String[]args){
		
		
		User user = new User();
		user.setId(1005);
		user.setName("dynamicTest");
		user.setPassword("223gdserds");
		
		UserBiz biz = new UserBiz();
		//biz.addNewUser(user);
		biz.test(user);
		//user = biz.getUser(1001);
		//System.out.println(user.getName());
		System.out.println("成功");
		
		
	}
	
	
}
