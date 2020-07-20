package com.zcset.platform.server.entity.es;

import com.zcset.platform.server.entity.db.UserGroupDB;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "authority", type = "userGroup")//用于es中映射authority的index，userGroup的type中的文档
@Data
public class UserGroupES {
    @Id//es里面的文档id
    private String id;
    @Field(type = FieldType.Long)
    private Short userGroupId;
    @Field(type = FieldType.Text)
    private String userGroupName;
    @Field(type = FieldType.Long)
    private Short parentId;
    @Field(type = FieldType.Text)
    private String displayName;
    @Field(type = FieldType.Text)
    private String innerName;
    @Field(type = FieldType.Text)
    private String qtip;
    @Field(type = FieldType.Text)
    private String imageSrc;
    @Field(type = FieldType.Long)
    private Short orderNumber;
    @Field(type = FieldType.Long)
    private Short enabled;
    @Field(type = FieldType.Text)
    private String type;
    @Field(type = FieldType.Text)
    private String createTime;
    @Field(type = FieldType.Long)
    private Short userGroupNumber;
    @Field(type = FieldType.Text)
    private String status;

    public UserGroupDB toUserGroupDB() {
        UserGroupDB userGroupDB = new UserGroupDB();
        userGroupDB.setUserGroupId(this.userGroupId);
        userGroupDB.setUserGroupName(this.userGroupName);
        userGroupDB.setParentId(this.parentId);
        userGroupDB.setDisplayName(this.displayName);
        userGroupDB.setInnerName(this.innerName);
        userGroupDB.setQtip(this.qtip);
        userGroupDB.setImageSrc(this.imageSrc);
        userGroupDB.setOrderNumber(this.orderNumber);
        userGroupDB.setEnabled(this.enabled);
        userGroupDB.setType(this.type);
        userGroupDB.setCreateTime(new Date(this.createTime));
        userGroupDB.setUserGroupNumber(this.userGroupNumber);
        userGroupDB.setStatus(this.status);
        return userGroupDB;
    }

}