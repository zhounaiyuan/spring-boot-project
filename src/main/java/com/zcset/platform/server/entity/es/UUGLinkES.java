package com.zcset.platform.server.entity.es;

import com.zcset.platform.server.entity.db.UUGLinkDB;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;

@Document(indexName = "authority", type = "uugLink")//用于es中映射authority的index，uugLink的type中的文档
@Data
public class UUGLinkES {
    @Id//es里面的文档id
    private String id;
    @Field(type = FieldType.Text)
    private Short uugId;
    @Field(type = FieldType.Text)
    private BigDecimal userId;
    @Field(type = FieldType.Long)
    private Short userGroupId;

    public UUGLinkDB toUUGLinkDB() {
        UUGLinkDB uugLinkDB = new UUGLinkDB();
        uugLinkDB.setUugId(this.uugId);
        uugLinkDB.setUserId(this.userId);
        uugLinkDB.setUserGroupId(this.userGroupId);
        return uugLinkDB;
    }
}