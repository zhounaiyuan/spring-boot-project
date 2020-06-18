package com.zcset.platform.server.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
@Document(indexName = "authority",type = "user")
@Data
public class User {
    public User(){

    }
    public User(Long id ,Long userid, String username){
        this.id =id;
        this.userid =userid;
        this.username = username;
        this.contact ="";
        //yyyy-MM-dd HH:mm:ss
        this.createtime= "2020-6-18 15:37:01";
        this.displayname="";
        this.enabled=(short)1;
        this.imagesrc ="";
        this.innername="";
        this.password ="";
        this.qtip ="";
        this.status="";
        this.type="";
        this.usernumber=(short)321;
    }

    @Id
    private  Long id;
    @Field(type = FieldType.Long)
    private Long userid;
    @Field(type = FieldType.Text)
    private String username;
    @Field(type = FieldType.Text)
    private String contact;
    @Field(type = FieldType.Text)
    private String qtip;
    @Field(type = FieldType.Text)
    private String imagesrc;
    @Field(type = FieldType.Text)
    private String password;
    @Field(type = FieldType.Text)
    private String displayname;
    @Field(type = FieldType.Text)
    private String innername;
    @Field(type = FieldType.Long)
    private Short enabled;
    @Field(type = FieldType.Text)
    private String type;
    @Field(type = FieldType.Text)
    private String createtime;
    @Field(type = FieldType.Long)
    private Short usernumber;
    @Field(type = FieldType.Text)
    private String status;
}