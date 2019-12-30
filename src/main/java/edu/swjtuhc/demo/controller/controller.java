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
			result.put("state", 3);
			return result;
		}else {

			if (use.getUserPassword().equals(user.getUserPassword())){
				result.put("state", 1);
				return result;
			}else {
				result.put("state", 2);
				return result;
			}
		}
	}
	@RequestMapping("/CXUser")
	public JSONObject CXUser(@RequestBody SysUser sysUser) {
		JSONObject result = new JSONObject();
		result.put("state",userSerivce.getcxuser(sysUser.getUsername()));
		return result;
	}

	@RequestMapping("/XGuserpassword")
	public JSONObject XGuserpassword(@RequestBody SysUser sysUser) {
		JSONObject result = new JSONObject();
		SysUser use = userSerivce.getcxuser(sysUser.getUsername());
		if (sysUser.getUserPhone()==use.getUserPhone()) {
			result.put("state",userSerivce.getXGuserpassword(sysUser));
		} else {
			result.put("state",2);
		}
		return result;
			
	}
	
	@RequestMapping("/sczh")
	public JSONObject sczh(@RequestBody SysUser sysUser) {
		JSONObject result = new JSONObject();
		int i;
		if (userSerivce.getcxuser(sysUser.getUsername())==null) {
			i=2;
		} else {
			i = userSerivce.scuser(sysUser.getUsername());
		}
		result.put("state", i);
		return result;
	}
	
}