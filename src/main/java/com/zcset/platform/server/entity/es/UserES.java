package com.zcset.platform.server.entity.es;

import com.zcset.platform.server.entity.db.UserDB;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author ：zny
 * @date ：2020.6.19
 * @description：用户类
 * @modified By：
 * @version: 1.0
 */
@Document(indexName = "authority", type = "user")//用于es中映射authority的index，user的type中的文档
@Data
public class UserES {
    @Id//es里面的文档id
    private String id;
    @Field(type = FieldType.Long)//用户id，主键自增长
    private Long userId;
    @Field(type = FieldType.Text)//用户账户
    private String userName;
    @Field(type = FieldType.Text)//用户联系方式
    private String contact;
    @Field(type = FieldType.Text)//描述信息
    private String qtip;
    @Field(type = FieldType.Text)//用户头像路径
    private String imageSrc;
    @Field(type = FieldType.Text)//用户密码
    private String password;
    @Field(type = FieldType.Text)//用户展示名字
    private String displayName;
    @Field(type = FieldType.Text)//用户内部名字
    private String innerName;
    @Field(type = FieldType.Long)//用户是否启用
    private Short enabled;
    @Field(type = FieldType.Text)//该类对象的类型，恒为用户
    private String type;
    @Field(type = FieldType.Text)//创建时间
    private String createTime;
    @Field(type = FieldType.Long)//用户的员工编号
    private Short userNumber;
    @Field(type = FieldType.Text)//用户状态
    private String status;

    public UserES() {

    }

    public UserES(String id, Long userid, String username) {
        this.id = id;
        this.userId = userid;
        this.userName = username;
        this.contact = "";
        //yyyy-MM-dd HH:mm:ss
        this.createTime = "2020-6-18 15:37:01";
        this.displayName = "";
        this.enabled = (short) 1;
        this.imageSrc = "";
        this.innerName = "";
        this.password = "";
        this.qtip = "";
        this.status = "";
        this.type = "";
        this.userNumber = (short) 321;
    }

    public UserDB toUserDB() {
        UserDB userDB = new UserDB();
        userDB.setUserId(this.userId);
        userDB.setUserName(this.userName);
        userDB.setContact(this.contact);
        userDB.setQtip(this.qtip);
        userDB.setImageSrc(this.imageSrc);
        userDB.setPassword(this.password);
        userDB.setDisplayName(this.displayName);
        userDB.setInnerName(this.innerName);
        userDB.setEnabled(this.enabled);
        userDB.setType(this.type);
        userDB.setCreateTime(this.createTime);
        userDB.setUserNumber(this.userNumber);
        userDB.setStatus(this.status);
        return userDB;
    }
}