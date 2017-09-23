package com.loan.entity;

import com.loan.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "loan_user") @Getter @Setter
public class User extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String password;
    private String phone;
    private String token;
    private String verifyCode;
}
