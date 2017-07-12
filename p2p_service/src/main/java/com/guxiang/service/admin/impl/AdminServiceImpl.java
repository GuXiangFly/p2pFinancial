package com.guxiang.service.admin.impl;

import com.guxiang.dao.domain.IAdminDAO;
import com.guxiang.domain.admin.AdminModel;
import com.guxiang.service.admin.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminServiceImpl
 *
 * @author guxiang
 * @date 2017/7/8
 */

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private IAdminDAO adminDAO;

    @Override
    public AdminModel login(String username, String password) {
        return adminDAO.login(username,password);
    }
}
