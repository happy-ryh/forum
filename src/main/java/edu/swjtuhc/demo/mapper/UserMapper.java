package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
	
	public List<SysUser> userLogin(String username);
	public List<SysUser> selectAllUsers();
	public int chaRuUser(SysUser sysUser);
}
