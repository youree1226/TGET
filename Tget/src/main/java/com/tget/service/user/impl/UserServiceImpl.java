package com.tget.service.user.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tget.common.domain.Search;
import com.tget.service.user.UserDao;
import com.tget.service.user.UserService;
import com.tget.service.user.domain.User;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	
	///Field
	@Autowired
	@Qualifier("userDaoImpl")
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	///Constructor
	public UserServiceImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void addUser(User user) throws Exception {
		userDao.insertUser(user);
		
	}

	@Override
	public User getUser(String userId) throws Exception {
		return userDao.selectUser(userId);
	}

	@Override
	public Map<String, Object> getUserList(Search search) throws Exception {
		List<User> list= userDao.selectUserList(search);
		int totalCount = userDao.selectTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}


	@Override
	public void updateUser(User user) throws Exception {
		userDao.updateUser(user);
		
	}

	@Override
	public boolean checkDuplication(String userId) throws Exception {
		boolean result=true;
		User user=userDao.selectUser(userId);
		if(user != null) {
			result=false;
		}
		return result;
	}
	@Override
	public void addBlacklist(User userId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getBlacklist(User userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSeller(User user) throws Exception {
		userDao.insertUser(user);
		
	}

	@Override
	public void updateSeller(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getSellerEval(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getSalesGrade(String sellerCode) throws Exception {
		return userDao.selectSalesGrade(sellerCode);
	}
	
	
	
	
	
}