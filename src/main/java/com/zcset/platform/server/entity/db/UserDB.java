package com.zcset.platform.server.entity.db;

import com.zcset.platform.server.entity.es.UserES;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author ：zny
 * @date ：2020.6.19
 * @description：用户类
 * @modified By：
 * @version: 1.0
 */
@Document(indexName = "authority", type = "user")//用于es中映射authority的index，user的type中的文档
@Data
public class UserDB {

    private Long userId;

    private String userName;

    private String contact;

    private String qtip;

    private String imageSrc;

    private String password;

    private String displayName;

    private String innerName;

    private Short enabled;

    private String type;

    private String createTime;

    private Short userNumber;

    private String status;

    public UserDB() {
    }

    public UserDB(Long userid, String username) {
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

    public UserES toUserES() {
        UserES userES = new UserES();
        userES.setUserId(this.userId);
        userES.setUserName(this.userName);
        userES.setContact(this.contact);
        userES.setQtip(this.qtip);
        userES.setImageSrc(this.imageSrc);
        userES.setPassword(this.password);
        userES.setDisplayName(this.displayName);
        userES.setInnerName(this.innerName);
        userES.setEnabled(this.enabled);
        userES.setType(this.type);
        userES.setCreateTime(this.createTime);
        userES.setUserNumber(this.userNumber);
        userES.setStatus(this.status);
        return userES;
    }

    public UserES toUserES(String id) {
        UserES userES = new UserES();
        userES.setId(id);
        userES.setUserId(this.userId);
        userES.setUserName(this.userName);
        userES.setContact(this.contact);
        userES.setQtip(this.qtip);
        userES.setImageSrc(this.imageSrc);
        userES.setPassword(this.password);
        userES.setDisplayName(this.displayName);
        userES.setInnerName(this.innerName);
        userES.setEnabled(this.enabled);
        userES.setType(this.type);
        userES.setCreateTime(this.createTime);
        userES.setUserNumber(this.userNumber);
        userES.setStatus(this.status);
        return userES;
    }

}