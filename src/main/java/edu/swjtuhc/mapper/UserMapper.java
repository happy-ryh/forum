package edu.swjtuhc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.model.SysUser;

@Mapper
public interface UserMapper {
	
	
	public List<SysUser> selectAllUsers();
	public int chaRuUser(SysUser sysUser);
}
