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
	@RequestMapping("/adminlogin")
	public JSONObject adminlogin(@RequestBody admin admin) {
		JSONObject result = new JSONObject();
		admin ad = adminSerivce.getadminlogin(admin.getAdminAccount());
		int i;
		if (ad==null) {
			i=2;
		} else {
			if (ad.getAdminPassword().equals(admin.getAdminPassword())) {
				i=1;
			} else {
				i=2;
			}
		}
				
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/scgly")
	public JSONObject scgly(@RequestBody admin admin) {
		JSONObject result = new JSONObject();
		int i;
		if (adminSerivce.getadminlogin(admin.getAdminAccount())==null) {
			i=2;
		} else {
			i = adminSerivce.scadmin(admin.getAdminAccount());
		}
		result.put("state", i);
		
		return result;
		
	}
	
}

