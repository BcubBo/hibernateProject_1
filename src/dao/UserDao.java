package dao;

import common.HibernateSessionFactory;
import po.User;

public class UserDao {
	public void save(User user){
		
		
		HibernateSessionFactory.getSession().save(user);
		
		
	};
	////
}
////
