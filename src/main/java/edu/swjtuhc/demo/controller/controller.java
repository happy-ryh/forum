package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

//json数据格式
//restful风格

@RestController
@RequestMapping("/user")
public class controller {
	
	@Autowired
	UserService userSerivce;
	
	@RequestMapping("/getAll")
	public List<SysUser> getAll(){
		return userSerivce.grtAllUser();
	}
	@RequestMapping("/ChaRu")
	public int Charu(@RequestBody SysUser sysUser) {
		System.out.println(sysUser.getPassword());
		int i = userSerivce.getChaRuuser(sysUser);
		return i;
	}
	@RequestMapping("/Login")
	public String uLogin(@RequestBody String username,String password){
		List<SysUser> user=userSerivce.getLogin(username);
		if (password==user.get(0).getPassword()){
			return "登录成功";
		}else {
			return "登录失败";
		}
		
		
	}
}

