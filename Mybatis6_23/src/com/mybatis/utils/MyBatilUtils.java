package com.mybatis.utils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatilUtils {
	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static SqlSession getSession() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}

	public static void closeSession() {
		getSession().close();
	}

}
