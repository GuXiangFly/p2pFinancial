package com.guxiang.service.admin;


import com.guxiang.domain.admin.AdminModel;

/**
 * IAdminService
 *
 * @author guxiang
 * @date 2017/7/8
 */

public interface IAdminService {

    public AdminModel login(String username,String password);

}
