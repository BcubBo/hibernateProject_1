package dao;

import common.HibernateSessionFactory;
import po.User;

public class UserDao {
	public void save(User user){
		
		
		HibernateSessionFactory.getSession().save(user);
		
		
	};
	////添加到数据库
	public User findById(java.io.Serializable id){
		
		return (User)HibernateSessionFactory.getSession().get(User.class, id);
		
		
		
	}////检索
	
	
	public void update(User user){
		
		HibernateSessionFactory.getSession().update(user);
		
		
		
		
		
	}////更新数据库
	
	public void test(User user){
		
		HibernateSessionFactory.getSession().saveOrUpdate(user);
		//saveOrUpdate()方法，通过对主键的判断选择使用保存还是更新操作
		User u = (User)HibernateSessionFactory.getSession().get(User.class,user.getId());
		u.setIsAdmin(user.getIsAdmin());
		u.setName(user.getName());
		u.setPassword(user.getPassword());
		u.setTelephone(user.getTelephone());
		u.setUsername(user.getUsername());
		
	}//更新或保存操作,变更为动态的进行更新和保存操作
}
////
