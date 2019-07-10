package com.tget.service.user.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tget.common.domain.Search;
import com.tget.service.user.UserDao;
import com.tget.service.user.domain.User;



//==> ȸ������ DAO CRUD ����
@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao{
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public UserDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void insertUser(User user) throws Exception {
		sqlSession.insert("UserMapper.insertUser", user);
		
	}

	@Override
	public User selectUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectUserList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectUserbyadmin(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkDuplication(String userId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User selectpoint(int point) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatepoint(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User selectSellerEval(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectSalesGrade(String sellerCode) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
}