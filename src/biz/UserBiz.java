package biz;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import common.HibernateSessionFactory;
import dao.UserDao;
import po.User;

public class UserBiz {
	private UserDao dao = new UserDao();
	
	
	public List<User> findUsers(User user){
		
		Transaction tx = null;
		List<User> users = null;
		
		try{
			
			tx = HibernateSessionFactory.getSession().beginTransaction();
			
			users = dao.findUser();
			
			users.get(0).setName("PersistentTest");
			
			tx.commit();//别忘了事务提交
		}catch(HibernateException e){
			
			
			e.printStackTrace();
			if(tx != null){
				
				tx.rollback();
				
				
			}
			
			
		}
		
		return users;
		
		
		
	}
	
	
	
	
	
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
		
		
	}////测试更新的操作
	
	
	
	
	public void delete(User user){
		
		Transaction tx = null;
		try{


			tx = HibernateSessionFactory.getSession().beginTransaction();
			
			dao.delete(user);
			
			tx.commit();
			
			
			
		}catch(HibernateException e){
			
			
			e.printStackTrace();
			if(tx != null){
				
				tx.rollback();
				
			}
			
		}
		
		
		
		
	}////删除用方法
	
	
	
	
	
	
}
////
