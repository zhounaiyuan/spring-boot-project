package com.zcset.platform.server.entity.es;

import com.zcset.platform.server.entity.db.URLinkDB;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "authority", type = "urLink")//用于es中映射authority的index，urLink的type中的文档
@Data
public class URLinkES {
    @Id//es里面的文档id
    private String id;
    @Field(type = FieldType.Long)
    private Long urId;
    @Field(type = FieldType.Long)
    private Long userId;
    @Field(type = FieldType.Long)
    private Long roleId;

    public URLinkDB toURLinkDB() {
        URLinkDB urLinkDB = new URLinkDB();
        urLinkDB.setUrId(this.urId);
        urLinkDB.setUserId(this.userId);
        urLinkDB.setRoleId(this.roleId);
        return urLinkDB;
    }
}