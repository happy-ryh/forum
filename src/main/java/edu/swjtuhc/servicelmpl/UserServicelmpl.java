package edu.swjtuhc.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.swjtuhc.mapper.UserMapper;
import edu.swjtuhc.model.SysUser;
import edu.swjtuhc.service.UserService;

public class UserServicelmpl implements UserService{
	
	@Autowired
	 UserMapper UserMapper;
	
	@Override
	public List<SysUser> grtAllUser() {
		// TODO Auto-generated method stub
		return UserMapper.selectAllUsers();
	}

	@Override
	public int getChaRuuser(SysUser sysuser){
		// TODO Auto-generated method stub
		return UserMapper.chaRuUser(sysuser);
	}

}
