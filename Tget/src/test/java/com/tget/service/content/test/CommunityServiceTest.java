package com.tget.service.content.test;

import java.io.BufferedReader;
import java.sql.Clob;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.tget.service.community.CommunityService;
import com.tget.service.community.domain.Content;

/*
 *	FileName :  UserServiceTest.java
 * ㅇ JUnit4 (Test Framework) 과 Spring Framework 통합 Test( Unit Test)
 * ㅇ Spring 은 JUnit 4를 위한 지원 클래스를 통해 스프링 기반 통합 테스트 코드를 작성 할 수 있다.
 * ㅇ @RunWith : Meta-data 를 통한 wiring(생성,DI) 할 객체 구현체 지정
 * ㅇ @ContextConfiguration : Meta-data location 지정
 * ㅇ @Test : 테스트 실행 소스 지정
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
									"classpath:config/context-aspect.xml",
									"classpath:config/context-common.xml",
									"classpath:config/context-mybatis.xml",
									"classpath:config/context-transaction.xml",
									"classpath:sql/CommunityMapper.xml",
									"classpath:sql/mybatis-config.xml"})
public class CommunityServiceTest {

	//==>@RunWith,@ContextConfiguration 이용 Wiring, Test 할 instance DI
	@Autowired
	@Qualifier("communityServiceImpl")
	private CommunityService communityService;


	@Test
	public void testAddContent() throws Exception {
		
		Content content = new Content();
		System.out.println("content"+content);
		Date date = new Date(19, 07, 10);
		
		
		int i = 40000;
		
//		String str="";
//		StringBuffer stOut= new StringBuffer();
//		
//		
//		BufferedReader br = new BufferedReader(clob.getCharacterStream());
//		while((str= br.readLine()!= null)) {
//			stOut.append(str+"\n");
//		}
//		br.close();
//		return stOut.toString();
	
		
		content.setContentNo(i);
		content.setUserId("디벨로퍼차");
		content.setUserNickName("진영");
		content.setContentName("게시글");
		content.setContentBody("123123");
		content.setRegDate(date);
		content.setBoardCode("1");
		content.setContentCode("2");
		content.setOpenCheck("1");
		
		
		communityService.addContent(content);
		
		content = communityService.getContent(i);

		//==> API 확인
		Assert.assertEquals(i, content.getContentNo());
		Assert.assertEquals("디벨로퍼차", content.getUserId());
		Assert.assertEquals("진영", content.getUserNickName());
		Assert.assertEquals("게시글", content.getContentName());
		Assert.assertEquals("123123", content.getContentBody());
		Assert.assertEquals("1", content.getBoardCode());
		Assert.assertEquals("2", content.getContentCode());
		Assert.assertEquals("1", content.getOpenCheck());
		
	}

//	
//	//@Test
//	public void testGetProduct() throws Exception {
//		
//		Product product = new Product();
//		Date date = new Date(19, 03, 03);
//		int i = 71001;
//
//		//==> 필요하다면...
////		user.setUserId("testUserId");
////		user.setUserName("testUserName");
////		user.setPassword("testPasswd");
////		user.setSsn("1111112222222");
////		user.setPhone("111-2222-3333");
////		user.setAddr("경기도");
////		user.setEmail("test@test.com");
//		
//		product = productService.getProduct(i);
//
//		//==> console 확인
//		//System.out.println(user);
//		
//		//==> API 확인
//		Assert.assertEquals(i, product.getProdNo());
//		Assert.assertEquals("길동이노트북", product.getProdName());
//		Assert.assertEquals("잘 켜지지 않음", product.getProdDetail());
//		//Assert.assertEquals("19941212", product.getManuDate());
//		Assert.assertEquals(1, product.getPrice());
//		//Assert.assertEquals("개빡", product.getFileName());
//		Assert.assertEquals(date, product.getRegDate());
//		
//		Assert.assertNotNull(productService.getProduct(i));
//	}
//	
//	//@Test
//	 public void testUpdateProduct() throws Exception{
//		
//		Date date = new Date(19, 03, 03);
//		int i = 71001;
//		Product product = productService.getProduct(i);
//		//Assert.assertNotNull(product);
//		System.out.println("@@@"+date);
//		System.out.println("@@@"+i);
//		System.out.println("@@@"+product);
//		
//		
//		Assert.assertEquals(i, product.getProdNo());
//		Assert.assertEquals("길동이노트북", product.getProdName());
//		Assert.assertEquals("잘 켜지지 않음", product.getProdDetail());
//		Assert.assertEquals(1, product.getPrice());
//
//		product.setProdName("몽이노트북");
//		product.setProdDetail("여전히 켜지지 않음");
//		product.setPrice(2);
//		
//		productService.updateProduct(product);
//		System.out.println("노트북 팔리지마라");
//		product = productService.getProduct(i);
//		Assert.assertNotNull(product);
//		
//		//==> console 확인
//		//System.out.println(user);
//			
//		//==> API 확인
//		Assert.assertEquals("몽이노트북", product.getProdName());
//		Assert.assertEquals("여전히 켜지지 않음", product.getProdDetail());
//		Assert.assertEquals(2, product.getPrice());
//	 }
//
//	 @Test
//	 public void testGetProductListAll() throws Exception{
//		 
//	 	Search search = new Search();
//	 	search.setCurrentPage(1);
//	 	search.setPageSize(3);
//	 	Map<String,Object> map = productService.getProductList(search);
//	 	
//	 	List<Object> list = (List<Object>)map.get("list");
//	 	Assert.assertEquals(3, list.size());
//	 	
//		//==> console 확인
//	 	//System.out.println(list);
//	 	
//	 	Integer totalCount = (Integer)map.get("totalCount");
//	 	System.out.println(totalCount);
//	 	
//	 	System.out.println("=======================================");
//	 	
//	 	search.setCurrentPage(1);
//	 	search.setPageSize(3);
//	 	search.setSearchCondition("0");
//	 	search.setSearchKeyword("");
//	 	map = productService.getProductList(search);
//	 	
//	 	list = (List<Object>)map.get("list");
//	 	Assert.assertEquals(3, list.size());
//	 	
//	 	//==> console 확인
//	 	//System.out.println(list);
//	 	
//	 	totalCount = (Integer)map.get("totalCount");
//	 	System.out.println(totalCount);
//	 }
//	 
//	 //@Test
//	 public void testGetProductListByProdNo() throws Exception{
//		 
//	 	Search search = new Search();
//	 	search.setCurrentPage(1);
//	 	search.setPageSize(3);
//	 	search.setSearchCondition("0");
//	 	search.setSearchKeyword("admin");
//	 	Map<String,Object> map = productService.getProductList(search);
//	 	
//	 	List<Object> list = (List<Object>)map.get("list");
//	 	Assert.assertEquals(1, list.size());
//	 	
//		//==> console 확인
//	 	//System.out.println(list);
//	 	
//	 	Integer totalCount = (Integer)map.get("totalCount");
//	 	System.out.println(totalCount);
//	 	
//	 	System.out.println("=======================================");
//	 	
//	 	search.setSearchCondition("0");
//	 	search.setSearchKeyword(""+System.currentTimeMillis());
//	 	map = productService.getProductList(search);
//	 	
//	 	list = (List<Object>)map.get("list");
//	 	Assert.assertEquals(0, list.size());
//	 	
//		//==> console 확인
//	 	//System.out.println(list);
//	 	
//	 	totalCount = (Integer)map.get("totalCount");
//	 	System.out.println(totalCount);
//	 }
//	 
//	 //@Test
//	 public void testGetProductListByProdName() throws Exception{
//		 
//	 	Search search = new Search();
//	 	search.setCurrentPage(1);
//	 	search.setPageSize(3);
//	 	search.setSearchCondition("1");
//	 	search.setSearchKeyword("SCOTT");
//	 	Map<String,Object> map = productService.getProductList(search);
//	 	
//	 	List<Object> list = (List<Object>)map.get("list");
//	 	Assert.assertEquals(3, list.size());
//	 	
//		//==> console 확인
//	 	System.out.println(list);
//	 	
//	 	Integer totalCount = (Integer)map.get("totalCount");
//	 	System.out.println(totalCount);
//	 	
//	 	System.out.println("=======================================");
//	 	
//	 	search.setSearchCondition("1");
//	 	search.setSearchKeyword(""+System.currentTimeMillis());
//	 	map = productService.getProductList(search);
//	 	
//	 	list = (List<Object>)map.get("list");
//	 	Assert.assertEquals(0, list.size());
//	 	
//		//==> console 확인
//	 	System.out.println(list);
//	 	
//	 	totalCount = (Integer)map.get("totalCount");
//	 	System.out.println(totalCount);
//	 }	 
}
