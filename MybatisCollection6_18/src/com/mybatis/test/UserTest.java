package com.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.mybatis.bean.User;
import com.mybatis.dao.UserDao;
import com.mybatis.utils.MyBatilUtils;

public class UserTest {
	Logger logger = Logger.getLogger(UserTest.class);
	private SqlSession sqlSession = null;

	@Test
	public void testGetList() {
		try {
			sqlSession = MyBatilUtils.getSession();
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			List<User> list=userDao.getListByUserId(1);
			for (User user : list) {
				System.out.println(user);
			}
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			MyBatilUtils.closeSession();
		}
	}

}
