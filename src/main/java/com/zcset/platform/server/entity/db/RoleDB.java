package com.zcset.platform.server.entity.db;

import com.zcset.platform.server.entity.es.RoleES;
import lombok.Data;

import java.util.Date;

@Data
public class RoleDB {
    private Long roleId;

    private String roleName;

    private Short parentRoleId;

    private String displayName;

    private String innerName;

    private String qtip;

    private String imageSrc;

    private Short enabled;

    private String type;

    private Date createTime;

    private String status;

    public RoleES toRoleEs() {
        RoleES roleES = new RoleES();
        roleES.setRoleId(this.roleId);
        roleES.setRoleName(this.roleName);
        roleES.setParentRoleId(this.parentRoleId);
        roleES.setDisplayName(this.displayName);
        roleES.setInnerName(this.innerName);
        roleES.setQtip(this.qtip);
        roleES.setImageSrc(this.imageSrc);
        roleES.setEnabled(this.enabled);
        roleES.setType(this.type);
        roleES.setCreateTime(this.createTime.toString());
        roleES.setStatus(this.status);
        return roleES;
    }

    public RoleES toRoleEs(String id) {
        RoleES roleES = new RoleES();
        roleES.setId(id);
        roleES.setRoleId(this.roleId);
        roleES.setRoleName(this.roleName);
        roleES.setParentRoleId(this.parentRoleId);
        roleES.setDisplayName(this.displayName);
        roleES.setInnerName(this.innerName);
        roleES.setQtip(this.qtip);
        roleES.setImageSrc(this.imageSrc);
        roleES.setEnabled(this.enabled);
        roleES.setType(this.type);
        roleES.setCreateTime(this.createTime.toString());
        roleES.setStatus(this.status);
        return roleES;
    }
}