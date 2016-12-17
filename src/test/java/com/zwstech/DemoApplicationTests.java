package com.zwstech;

import com.zwstech.domain.User;
import com.zwstech.domain.Version;
import com.zwstech.mapper.UserMapper;
import com.zwstech.mapper.VersionMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
//@SpringApplicationConfiguration(classes=Application.class)
public class DemoApplicationTests {


	@Autowired
	private VersionMapper versionMapper;
//
//	@Test
//	@Rollback
//	public void findByName(){
//		userMapper.insert("AAA", "20");
//		User u = userMapper.findByName("AAA");
//		System.out.println(u);
//		Assert.assertEquals("20", u.getAge());
//	}
//	@Test
//	@Rollback
//	public void update(){
//		User user = new User();
//		user.setAge("110");
//		//user.setName("AAA");
//		userMapper.update(user);
//		User u = userMapper.findByName("AAA");
//		System.out.println(u);
//		Assert.assertEquals("110", u.getAge());
//	}
//
//
//	@Test
//	@Rollback
//	public void insertByUser(){
//		User user = new User();
//		user.setAge("12");
//		//user.setName("BBB");
//		userMapper.insertByUser(user);
//		User u = userMapper.findByName("BBB");
//		System.out.println(u);
//		Assert.assertEquals("12", u.getAge());
//	}
//
//	@Test
//	@Rollback
//	public void insertByMap(){
//		Map<String, Object> map = new HashMap<>();
//		map.put("name", "CCC");
//		map.put("age", "40");
//		userMapper.insertByMap(map);
//		User u = userMapper.findByName("CCC");
//		System.out.println(u);
//		Assert.assertEquals("40", u.getAge());
//	}
//	@Test
//	@Rollback
//	public void delete(){
//		userMapper.delete(1L);
//		java.util.List<User> findAll = userMapper.findAll();
//		System.out.println(findAll);
//	}

	@Test
	@Rollback
	public void findByAppNum(){
		List<Version> versionList = versionMapper.findByAppNum(0);
		System.out.println(versionList);
	}


}
