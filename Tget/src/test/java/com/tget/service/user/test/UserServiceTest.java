package com.tget.service.user.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tget.service.user.domain.User;
import com.tget.service.user.UserService;


@RunWith(SpringJUnit4ClassRunner.class)

//@ContextConfiguration(locations = { "classpath:config/context-*.xml" })
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
																	"classpath:config/context-aspect.xml",
																	"classpath:config/context-mybatis.xml",
																	"classpath:config/context-transaction.xml" })
//@ContextConfiguration(locations = { "classpath:config/context-common.xml" })
public class UserServiceTest {


	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	//@Test
	public void testAddUser() throws Exception {
		
		User user = new User();
		user.setUserId("testUserId2");
		user.setUserName("testUserName2");
		user.setPassword("testPasswd");
		user.setPhone(123);
		user.setNickName("닉2");
		user.setAddress("주소");
		user.setPostalCode(1);
		user.setRole("1");
		user.setLocal("1");
		user.setPoint(1);
		user.setUserStatement("1");
	/*	user.setKakaoId("1");
		user.setNaverId("1");
		user.setFacebookId("1");*/
		
		userService.addUser(user);
		
		user = userService.getUser("testUserId2");

	
		//System.out.println(user);
		

		Assert.assertEquals("testUserId2", user.getUserId());
		Assert.assertEquals("testUserName2", user.getUserName());
		Assert.assertEquals("testPasswd", user.getPassword());
		Assert.assertEquals(123, user.getPhone());
		Assert.assertEquals("닉2", user.getNickName());
		Assert.assertEquals("주소", user.getAddress());
		Assert.assertEquals(1, user.getPostalCode());
		Assert.assertEquals("1", user.getRole());
		Assert.assertEquals("1", user.getLocal());
		Assert.assertEquals(1, user.getPoint());
		Assert.assertEquals("1", user.getUserStatement());

	
	}
	
	//@Testasd
	/*public void testGetUser() throws Exception {
		
		User user = new User();
		
		user.setUserId("testUserId");
		user.setUserName("testUserName");
		user.setPassword("testPasswd");
		user.setPhone(111-2222-3333);
		user.setNickName("닉");
		user.setAddress("주소");
		user.setPostalCode(1);
		user.setRole("1");
		user.setLocal("1");
		user.setPoint(1);
		user.setUserStatement("1");
		
		userService.addUser(user);
		user = userService.getUser("testUserId");


		System.out.println(user);
		

		Assert.assertEquals("testUserId", user.getUserId());
		Assert.assertEquals("testUserName", user.getUserName());
		Assert.assertEquals("testPasswd", user.getPassword());
		Assert.assertEquals(111-2222-3333, user.getPhone());
		Assert.assertEquals("닉", user.getNickName());
		Assert.assertEquals("주", user.getAddress());
		Assert.assertEquals(1, user.getPostalCode());
		Assert.assertEquals("1", user.getRole());
		Assert.assertEquals("1", user.getLocal());
		Assert.assertEquals(1, user.getPoint());
		Assert.assertEquals("1", user.getUserStatement());
	}*/

	@Test
	 public void testUpdateUser() throws Exception{
		 
		User user = userService.getUser("testUserId2");
		Assert.assertNotNull(user);
		
		Assert.assertEquals("testUserId2", user.getUserId());
		Assert.assertEquals("testUserName2", user.getUserName());

		
		
		user.setUserName("change");
		user.setNickName("chachachange");
		
		userService.updateUser(user);
		
		user = userService.getUser("testUserId2");
		Assert.assertNotNull(user);
		
		System.out.println(user);
			
		Assert.assertEquals("change", user.getUserName());
		Assert.assertEquals("chachachange", user.getNickName());
	
	 }
	 
}
	//@Test
//	public void testCheckDuplication() throws Exception{

//			User user = new User();
//			user.setUserId("testUserId");
//			user.setUserName("testUserName");
//			user.setPassword("testPasswd");
//			user.setSsn("1111112222222");
//			user.setPhone("111-2222-3333");
//			user.setAddr("  ");
//			user.setEmail("test@test.com");
//			
//			userService.addUser(user);
		
		//System.out.println(userService.checkDuplication("testUserId"));
		//System.out.println(userService.checkDuplication("testUserId"+System.currentTimeMillis()) );
	 	
	/*	Assert.assertFalse( userService.checkDuplication("testUserId") );
	 	Assert.assertTrue( userService.checkDuplication("testUserId"+System.currentTimeMillis()) );
		 	
	}
	
	 //@Test
	 public void testGetUserListAll() throws Exception{
		 
	 	Search search = new Search();
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	Map<String,Object> map = userService.getUserList(search);
	 	
	 	List<Object> list = (List<Object>)map.get("list");
	 	Assert.assertEquals(3, list.size());
	 	
	 	//System.out.println(list);
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 	System.out.println("=======================================");
	 	
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	search.setSearchCondition("0");
	 	search.setSearchKeyword("");
	 	map = userService.getUserList(search);
	 	
	 	list = (List<Object>)map.get("list");
	 	Assert.assertEquals(3, list.size());
	 	
	 	//System.out.println(list);
	 	
	 	totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 }
	 
	 //@Test
	 public void testGetUserListByUserId() throws Exception{
		 
	 	Search search = new Search();
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	search.setSearchCondition("0");
	 	search.setSearchKeyword("admin");
	 	Map<String,Object> map = userService.getUserList(search);
	 	
	 	List<Object> list = (List<Object>)map.get("list");
	 	Assert.assertEquals(1, list.size());
	 	
	 	//System.out.println(list);
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 	System.out.println("=======================================");
	 	
	 	search.setSearchCondition("0");
	 	search.setSearchKeyword(""+System.currentTimeMillis());
	 	map = userService.getUserList(search);
	 	
	 	list = (List<Object>)map.get("list");
	 	Assert.assertEquals(0, list.size());
	 	
	 	//System.out.println(list);
	 	
	 	totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 }
	 
	 //@Test
	 public void testGetUserListByUserName() throws Exception{
		 
	 	Search search = new Search();
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	search.setSearchCondition("1");
	 	search.setSearchKeyword("SCOTT");
	 	Map<String,Object> map = userService.getUserList(search);
	 	
	 	List<Object> list = (List<Object>)map.get("list");
	 	Assert.assertEquals(3, list.size());
	 	
	 	//System.out.println(list);
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 	System.out.println("=======================================");
	 	
	 	search.setSearchCondition("1");
	 	search.setSearchKeyword(""+System.currentTimeMillis());
	 	map = userService.getUserList(search);
	 	
	 	list = (List<Object>)map.get("list");
	 	Assert.assertEquals(0, list.size());
	 	
	 	//System.out.println(list);
	 	
	 	totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 }	 */
