package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.admin;

@Mapper
public interface AdminMapper {
	public admin selectadminGrade(String adminAccount);
	public int chaRuAdmin(admin admin);
	public admin adminlogin(String adminAccount);
}
