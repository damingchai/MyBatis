package com.mybatis.dao;

import java.util.List;

import com.mybatis.bean.User;

public interface UserDao {
	//插入
	public int insert(User user);
	//查询全部
	public List<User> getAll();
	//删除
	public int delete(User user);//也可以deleteById,我就不写了
	//更新
	public int update(User user);
	//通过id查询
	public User getUserById(int uId);
	//模糊查询
	public List<User> getUsersByLike(String uName);

}
