package com.tget.service.user;

import java.util.Map;

import com.tget.common.domain.Search;
import com.tget.service.user.domain.User;

public interface UserDao {


		public void insertUser(User user) throws Exception;
		public User selectUser(String userId) throws Exception;
		public Map<String , Object> selectUserList(Search search) throws Exception;
		public Map<String , Object> selectUserbyadmin(Search search) throws Exception;
		public void updateUser(User user) throws Exception;
		public boolean checkDuplication(String userId) throws Exception;
		public User selectpoint(int point) throws Exception;
		public void updatepoint(User user)throws Exception;
		public User selectSellerEval(User user)throws Exception;
		public User selectSalesGrade(String sellerCode)throws Exception;
		public int selectTotalCount(Search search) throws Exception ;
}
