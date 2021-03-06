package com.taskjob.dao.impl;

import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.taskjob.bean.User;
import com.taskjob.dao.UserDao;

@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	


	public User getUserById(Serializable id) {
		// TODO Auto-generated method stub
		return (User) getSession().get(User.class, id);
	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(User.class).add(Restrictions.eq("username", username));
		 if(criteria.list()!=null&&criteria.list().size()>0){
			 return (User) criteria.list().get(0);
		 }else {
			return  null;
		}
		
	}


}
