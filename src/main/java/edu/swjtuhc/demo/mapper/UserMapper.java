package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
	
	public SysUser userLogin(String username);
	public SysUser cxuser(String username);
	public List<SysUser> selectAllUsers();
	public int chaRuUser(SysUser sysUser);
	public int xgpassword(SysUser sysUser); 
}
