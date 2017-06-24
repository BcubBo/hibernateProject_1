package dao;

import java.util.List;

import org.hibernate.Query;

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
		
		//HibernateSessionFactory.getSession().saveOrUpdate(user);
		//saveOrUpdate()方法，通过对主键的判断选择使用保存还是更新操作
/*		User u = (User)HibernateSessionFactory.getSession().get(User.class,user.getId());
		//使用快照，进行了查询出的数据和一下代码的区别，进行动态的更改
		u.setIsAdmin(user.getIsAdmin());
		u.setName(user.getName());
		u.setPassword(user.getPassword());
		u.setTelephone(user.getTelephone());
		u.setUsername(user.getUsername());
*/
		
		HibernateSessionFactory.getSession().merge(user);
		//以上方式的精简版方式
		//本身分为save 和 update两个方法
		//
		
		
		
		
	}//更新或保存操作,变更为动态的进行更新和保存操作
	
	public void delete(User user){
		
		//User u = (User)HibernateSessionFactory.getSession().get(User.class, user.getId());
		//先查询防止非空数据含有空值且报错,或者在xml配置文件里将non-null="true"设置未"false"
		HibernateSessionFactory.getSession().delete(user);
		//
		
		
		
		
		
		
		
	}//删除操作
	
	public void saveAll(List<User> users){
		
		
		for(int i = 0 ; i <users.size();i++){
			
			
			HibernateSessionFactory.getSession().save(users.get(i));
			if(i/20>0 && i%20 == 0 ){
				
				
				HibernateSessionFactory.getSession().flush();
				HibernateSessionFactory.getSession().clear();
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
	}//大量数据的操作
	
	@SuppressWarnings("unchecked")
	public List<User> findUser(){
		//from User == select * from Users;
		Query qy = HibernateSessionFactory.getSession().createQuery("from User");
		
/*		qy.setInteger(0, 1004);
		qy.setString(,);*/
		
		
		
		
		
		return qy.list();
		
	}//创建HQL语句
	
	
	
	
	
	
	
}
////
