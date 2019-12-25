package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.admin;
import edu.swjtuhc.demo.service.AdminService;
import net.sf.json.JSONObject;

//json数据格式
//restful风格

@RestController
@RequestMapping("/admin")
public class adminController {
	
	@Autowired
	AdminService adminSerivce;
	
	@RequestMapping("/panduandenji")
	public JSONObject panduandenji(@RequestBody admin admain){
		JSONObject result = new JSONObject();
		result.put("state", adminSerivce.panduandenji(admain.getAdminAccount()).getAdminGrade());
		return result;
	}
	@RequestMapping("/ZhuCeadmin")
	public JSONObject ZhuCeadmin(@RequestBody admin admin) {
		JSONObject result = new JSONObject();
		result.put("state", adminSerivce.getChaRuadmin(admin));
		return result;
		
	}
	
		
	
}

