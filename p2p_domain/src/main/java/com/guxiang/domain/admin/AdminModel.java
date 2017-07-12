package com.guxiang.domain.admin;

import javax.persistence.*;

/**
 * AdminModel
 *
 * @author guxiang
 * @date 2017/7/8
 */
@Entity
@Table(name="t_admin")
public class AdminModel {

    @Id
    @GeneratedValue //主键生成策略
    private Integer id;

    @Column  //colum不写也可以
    private String username;
    private String password;

}
