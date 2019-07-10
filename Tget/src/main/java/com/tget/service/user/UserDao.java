package com.tget.service.user;

import java.util.List;
import java.util.Map;

import com.tget.common.domain.Search;
import com.tget.service.user.domain.User;

public interface UserDao {


		public void insertUser(User user) throws Exception;
		public User selectUser(String userId) throws Exception;
		public List<User> selectUserList(Search search) throws Exception;
		public void updateUser(User user) throws Exception;
		public User selectSellerEval(User user)throws Exception;
		public User selectSalesGrade(String sellerCode)throws Exception;
		public int selectTotalCount(Search search) throws Exception ;
}
