package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Admin;
import com.mapper.AdminMapper;
import com.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public List<Admin> queryAll() {
		// TODO Auto-generated method stub
		return adminMapper.queryAll();
	}

}
