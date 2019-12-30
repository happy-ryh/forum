package edu.swjtuhc.demo.service;

import java.util.List;


import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.tizi;

public interface UserService {
	public SysUser getLogin(String username);
	public List<SysUser> grtAllUser();
	public int getChaRuuser(SysUser sysUser);
	public SysUser getcxuser(String username);
	public int getXGuserpassword(SysUser sysuser);
	public int scuser(String username);
}
