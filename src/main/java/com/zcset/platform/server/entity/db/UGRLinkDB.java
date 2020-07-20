package com.zcset.platform.server.entity.db;

import com.zcset.platform.server.entity.es.UGRLinkES;
import lombok.Data;

@Data
public class UGRLinkDB {
    private Short ugrId;

    private Short userGroupId;

    private Short roleId;

    public UGRLinkES toUGRLinkES() {
        UGRLinkES ugrLinkES = new UGRLinkES();
        ugrLinkES.setUgrId(this.ugrId);
        ugrLinkES.setUserGroupId(this.userGroupId);
        ugrLinkES.setRoleId(this.roleId);
        return ugrLinkES;
    }

    public UGRLinkES toUGRLinkES(String id) {
        UGRLinkES ugrLinkES = new UGRLinkES();
        ugrLinkES.setId(id);
        ugrLinkES.setUgrId(this.ugrId);
        ugrLinkES.setUserGroupId(this.userGroupId);
        ugrLinkES.setRoleId(this.roleId);
        return ugrLinkES;
    }
}