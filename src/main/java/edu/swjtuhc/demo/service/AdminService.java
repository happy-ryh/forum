package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.admin;

public interface AdminService {
	public admin panduandenji(String adminAccount);
	public int getChaRuadmin(admin admin);
}
