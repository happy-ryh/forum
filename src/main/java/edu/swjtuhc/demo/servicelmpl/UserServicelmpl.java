package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
@Service
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

	@Override
	public SysUser getLogin(String username) {
		// TODO Auto-generated method stub
		return UserMapper.userLogin(username);
	}

}
