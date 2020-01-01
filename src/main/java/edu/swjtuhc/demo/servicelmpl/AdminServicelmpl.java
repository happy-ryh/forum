package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AdminMapper;
import edu.swjtuhc.demo.model.admin;
import edu.swjtuhc.demo.service.AdminService;

@Service
public class AdminServicelmpl implements AdminService{
	@Autowired
	  AdminMapper adminmapper;

	@Override
	public admin panduandenji(String adminAccount) {
		// TODO Auto-generated method stub
		return adminmapper.selectadminGrade(adminAccount);
	}

	@Override
	public int getChaRuadmin(admin admin) {
		// TODO Auto-generated method stub
		return adminmapper.chaRuAdmin(admin);
	}

	@Override
	public admin getadminlogin(String adminAccount) {
		// TODO Auto-generated method stub
		return adminmapper.adminlogin(adminAccount);
	}

	@Override
	public int scadmin(String adminAccount) {
		// TODO Auto-generated method stub
		return adminmapper.scadmin(adminAccount);
	}
	
}
