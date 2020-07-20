package com.zcset.platform.server.entity.db;

import com.zcset.platform.server.entity.es.URLinkES;
import lombok.Data;

@Data
public class URLinkDB {
    private Long urId;

    private Long userId;

    private Long roleId;

    public URLinkES toURLinkES() {
        URLinkES urLinkES = new URLinkES();
        urLinkES.setUrId(this.urId);
        urLinkES.setUserId(this.userId);
        urLinkES.setRoleId(this.roleId);
        return urLinkES;
    }

    public URLinkES toURLinkES(String id) {
        URLinkES urLinkES = new URLinkES();
        urLinkES.setId(id);
        urLinkES.setUrId(this.urId);
        urLinkES.setUserId(this.userId);
        urLinkES.setRoleId(this.roleId);
        return urLinkES;
    }
}