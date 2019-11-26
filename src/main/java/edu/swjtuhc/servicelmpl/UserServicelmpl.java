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
	public String LoginUser(String username,String password) {
		
		SysUser user = new SysUser();
		
		if (username!=null&&password!=null&&username!=""&&password!="") {
			if (username.equals(user.getUsername())&&password.equals(user.getPassword())) {
				System.out.println("登录成功！");
			}else if (username.equals(user.getUsername())&&!password.equals(user.getPassword())) {
				System.out.println("密码错误！");
			}else {
				System.out.println("用户名不存在！");
			}
				
		}else {
			System.out.println("用户名或密码不能空");
		}
		
		return null;
	} 
}
