package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Data
public class User {
    private Short userid;

    private String username;

    private String contact;

    private String qtip;

    private String imagesrc;

    private String password;

    private String displayname;

    private String innername;

    private Short enabled;

    private String type;

    private Date createtime;

    private Short usernumber;

    private String status;
}