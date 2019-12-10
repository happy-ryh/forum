package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

//json数据格式
//restful风格

@RestController
@RequestMapping("/user")
public class controller {
	
	@Autowired
	UserService userSerivce;
	
	@RequestMapping("/getAll")
	public JSONObject getAll(){
		JSONObject result = new JSONObject();
		List<SysUser> user = userSerivce.grtAllUser();
		result.put("state", user.toString());
		return result;
	}
	@RequestMapping("/ChaRu")
	public JSONObject Charu(@RequestBody SysUser sysUser) {
		JSONObject result = new JSONObject();
		int i = userSerivce.getChaRuuser(sysUser);
		result.put("state", i);
		return result;
	}
	@RequestMapping("/Login")
	
	public JSONObject uLogin(@RequestBody SysUser user){
		JSONObject result = new JSONObject();
		SysUser use = userSerivce.getLogin(user.getUsername());
		if(use==null) {
			result.put("state", "没有这个用户");
			return result;
		}else {

			if (use.getUserPassword().equals(user.getUserPassword())){
				result.put("state", "登录成功");
				return result;
			}else {
				result.put("state", "密码错误");
				return result;
			}
		}
	}
}

