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

	// 插入
	@Test
	public void testInsert() {
		try {
			sqlSession = MyBatilUtils.getSession();
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			User user = new User();
			user.setuName("林国");
			user.setuAge(42);
			user.setRoleId(2);
			int line = userDao.insert(user);
			logger.debug("插入" + line + "条记录。");
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			MyBatilUtils.closeSession();
		}

	}

	// 查询全部
	@Test
	public void testGetAll() {
		try {
			sqlSession = MyBatilUtils.getSession();
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			List<User> list = userDao.getAll();
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
	//删除
	@Test
	public void testDelete() {
		try {
			sqlSession = MyBatilUtils.getSession();
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			User user=new User();
			user.setuId(3);
			int line=userDao.delete(user);
			System.out.println("删除"+line+"记录。");
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			MyBatilUtils.closeSession();
		}
	}
	//更新
	@Test
	public void testUpdate() {
		try {
			sqlSession = MyBatilUtils.getSession();
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			User user=new User();
			user.setuId(2);
			user.setuName("吴用");
			user.setuAge(40);
			user.setRoleId(1);
			int line=userDao.update(user);
			System.out.println("更新"+line+"记录。");
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			MyBatilUtils.closeSession();
		}
	}
	//通过id查询
	@Test
	public void testGetUserById() {
		try {
			sqlSession = MyBatilUtils.getSession();
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			User user=userDao.getUserById(2);
			System.out.println(user);
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			MyBatilUtils.closeSession();
		}
	}
	//模糊查询
	@Test
	public void testGetUserByLike() {
		try {
			sqlSession = MyBatilUtils.getSession();
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			String uName="林";
			List<User> list=userDao.getUsersByLike(uName);
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
