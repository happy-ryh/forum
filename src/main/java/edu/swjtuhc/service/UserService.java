package edu.swjtuhc.service;

import java.util.List;

import edu.swjtuhc.model.SysUser;

public interface UserService {
	
	public List<SysUser> grtAllUser();
	public int getChaRuuser(SysUser sysUser);
}
