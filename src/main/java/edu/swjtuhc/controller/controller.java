package edu.swjtuhc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.model.SysUser;
import edu.swjtuhc.service.UserService;

//json数据格式
//restful风格

@RestController
@RequestMapping("/user")
public class controller {
	
	@Autowired
	UserService userSerivce;
	
	@RequestMapping("getAll")
	public List<SysUser> getAll(){
		return userSerivce.grtAllUser();
	}
}
