package com.mybatis.dao;

import java.util.List;
import java.util.Map;


public interface UserDao {
	//查询一个表当中的某些字段并放到Map当中。同样也可以放到POJP中。
	public List<Map<String, Object>> getList();
	//查询Student和User表中的某些字段并放到Map中。
	public List<Map<String, Object>> getStudentUserList();

}
