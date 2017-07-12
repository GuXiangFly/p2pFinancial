package com.guxiang.dao.domain;

import com.guxiang.domain.admin.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * IAdminDAO
 *
 * @author guxiang
 * @date 2017/7/8
 */
public interface IAdminDAO extends JpaRepository<AdminModel,Integer>{

    @Query("select a from AdminModel  a where a.username=?1 and a.password=?2")
    public AdminModel login(String username,String password);
}
