package com.zcset.platform.server.entity.es;

import com.zcset.platform.server.entity.db.UGRLinkDB;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "authority", type = "ugrLink")//用于es中映射authority的index，UGRLink的type中的文档
@Data
public class UGRLinkES {
    @Id//es里面的文档id
    private String id;
    @Field(type = FieldType.Long)
    private Short ugrId;
    @Field(type = FieldType.Long)
    private Short userGroupId;
    @Field(type = FieldType.Long)
    private Short roleId;

    public UGRLinkDB toUGRLinkDB() {
        UGRLinkDB ugrLinkDB = new UGRLinkDB();
        ugrLinkDB.setUgrId(this.ugrId);
        ugrLinkDB.setUserGroupId(this.userGroupId);
        ugrLinkDB.setRoleId(this.roleId);
        return ugrLinkDB;
    }
}