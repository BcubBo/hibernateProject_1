package biz;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import common.HibernateSessionFactory;
import dao.UserDao;
import po.User;

public class UserBiz {
	private UserDao dao = new UserDao();
	
	public void addNewUser(User user){
		
		Transaction tx = null;
		try{
			tx = HibernateSessionFactory.getSession().beginTransaction();
			dao.save(user);
			tx.commit();
		}catch(HibernateException e){
			
			
			e.printStackTrace();
			
			if(tx !=null){
				
				
				tx.rollback();
				
			}
		}
		
	}
	
	
}
////
