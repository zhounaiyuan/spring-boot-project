package com.zcset.platform.server.entity.db;

import com.zcset.platform.server.entity.es.UUGLinkES;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UUGLinkDB {
    private Short uugId;

    private BigDecimal userId;

    private Short userGroupId;

    public UUGLinkES toUUGLinkES() {
        UUGLinkES uugLinkES = new UUGLinkES();
        uugLinkES.setUugId(this.uugId);
        uugLinkES.setUserGroupId(this.userGroupId);
        uugLinkES.setUserId(this.userId);
        return uugLinkES;
    }

    public UUGLinkES toUUGLinkES(String id) {
        UUGLinkES uugLinkES = new UUGLinkES();
        uugLinkES.setId(id);
        uugLinkES.setUugId(this.uugId);
        uugLinkES.setUserGroupId(this.userGroupId);
        uugLinkES.setUserId(this.userId);
        return uugLinkES;
    }
}