package com.mybatis.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;


import com.mybatis.dao.UserDao;
import com.mybatis.utils.MyBatilUtils;

public class UserTest {
	Logger logger = Logger.getLogger(UserTest.class);
	private SqlSession sqlSession = null;
    @Ignore
	@Test
	public void testGetList() {
		try {
			sqlSession = MyBatilUtils.getSession();
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			List<Map<String, Object>> list=userDao.getList();
			for (Map<String, Object> map : list) {
				System.out.println(map);
			}
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			MyBatilUtils.closeSession();
		}
	}
    @Test
    public void testGetStudentUserList() {
    	try {
    		sqlSession = MyBatilUtils.getSession();
    		UserDao userDao = sqlSession.getMapper(UserDao.class);
    		List<Map<String, Object>> list=userDao.getStudentUserList();
    		for (Map<String, Object> map : list) {
    			System.out.println(map);
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
