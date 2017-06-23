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
	////
	public User getUser(java.io.Serializable id){
		Transaction tx = null;
		User user = null;
		try{
			tx = HibernateSessionFactory.getSession().beginTransaction();
			user = dao.findById(id);
			tx.commit();
		}catch(HibernateException e){
			
			if(tx != null){
				
				tx.rollback();
				
				
				
			}
			
			
		}
		return user;
	};///检索
	
	
	public void modifyUser(User user){
		
		
		Transaction tx = null;
		try{
			
			tx= HibernateSessionFactory.getSession().beginTransaction();
			
			dao.update(user);
			
			tx.commit();
			
		}catch(HibernateException e){
			
			
			e.printStackTrace();
			if(tx!=null){
				
				tx.rollback();
				
			}
			
			
		}
		
		
		
		
		
	}////更新数据
	
	public void test(User user){
		Transaction tx = null;
		try{
			tx = HibernateSessionFactory.getSession().beginTransaction();
		
			dao.test(user);
			
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
