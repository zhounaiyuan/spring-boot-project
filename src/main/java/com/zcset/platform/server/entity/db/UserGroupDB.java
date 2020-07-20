package com.zcset.platform.server.entity.db;

import com.zcset.platform.server.entity.es.UserGroupES;
import lombok.Data;

import java.util.Date;

@Data
public class UserGroupDB {
    private Short userGroupId;

    private String userGroupName;

    private Short parentId;

    private String displayName;

    private String innerName;

    private String qtip;

    private String imageSrc;

    private Short orderNumber;

    private Short enabled;

    private String type;

    private Date createTime;

    private Short userGroupNumber;

    private String status;

    public UserGroupES toUserGroupES() {
        UserGroupES userGroupES = new UserGroupES();
        userGroupES.setUserGroupId(this.userGroupId);
        userGroupES.setUserGroupName(this.userGroupName);
        userGroupES.setParentId(this.parentId);
        userGroupES.setDisplayName(this.displayName);
        userGroupES.setInnerName(this.innerName);
        userGroupES.setQtip(this.qtip);
        userGroupES.setImageSrc(this.imageSrc);
        userGroupES.setOrderNumber(this.orderNumber);
        userGroupES.setEnabled(this.enabled);
        userGroupES.setType(this.type);
        userGroupES.setCreateTime(this.createTime.toString());
        userGroupES.setUserGroupNumber(this.userGroupNumber);
        userGroupES.setStatus(this.status);
        return userGroupES;
    }

    public UserGroupES toUserGroupES(String id) {
        UserGroupES userGroupES = new UserGroupES();
        userGroupES.setId(id);
        userGroupES.setUserGroupId(this.userGroupId);
        userGroupES.setUserGroupName(this.userGroupName);
        userGroupES.setParentId(this.parentId);
        userGroupES.setDisplayName(this.displayName);
        userGroupES.setInnerName(this.innerName);
        userGroupES.setQtip(this.qtip);
        userGroupES.setImageSrc(this.imageSrc);
        userGroupES.setOrderNumber(this.orderNumber);
        userGroupES.setEnabled(this.enabled);
        userGroupES.setType(this.type);
        userGroupES.setCreateTime(this.createTime.toString());
        userGroupES.setUserGroupNumber(this.userGroupNumber);
        userGroupES.setStatus(this.status);
        return userGroupES;
    }

}