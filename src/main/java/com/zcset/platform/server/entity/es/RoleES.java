package com.zcset.platform.server.entity.es;

import com.zcset.platform.server.entity.db.RoleDB;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "authority", type = "role")//用于es中映射authority的index，role的type中的文档
@Data
public class RoleES {
    @Id//es里面的文档id
    private String id;
    @Field(type = FieldType.Long)
    private Long roleId;
    @Field(type = FieldType.Text)
    private String roleName;
    @Field(type = FieldType.Long)
    private Short parentRoleId;
    @Field(type = FieldType.Text)
    private String displayName;
    @Field(type = FieldType.Text)
    private String innerName;
    @Field(type = FieldType.Text)
    private String qtip;
    @Field(type = FieldType.Text)
    private String imageSrc;
    @Field(type = FieldType.Long)
    private Short enabled;
    @Field(type = FieldType.Text)
    private String type;
    @Field(type = FieldType.Text)
    private String createTime;
    @Field(type = FieldType.Text)
    private String status;

    public RoleDB toRoleDB() {
        RoleDB roleDB = new RoleDB();
        roleDB.setRoleId(this.roleId);
        roleDB.setRoleName(this.roleName);
        roleDB.setParentRoleId(this.parentRoleId);
        roleDB.setDisplayName(this.displayName);
        roleDB.setInnerName(this.innerName);
        roleDB.setQtip(this.qtip);
        roleDB.setImageSrc(this.imageSrc);
        roleDB.setEnabled(this.enabled);
        roleDB.setType(this.type);
        roleDB.setCreateTime(new Date(this.createTime));
        roleDB.setStatus(this.status);
        return roleDB;
    }


}