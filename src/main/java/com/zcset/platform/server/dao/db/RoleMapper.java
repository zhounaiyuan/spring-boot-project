package com.zcset.platform.server.dao.db;

import com.zcset.platform.server.entity.db.RoleDB;
import com.zcset.platform.server.entity.db.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long roleid);

    int insert(RoleDB record);

    int insertSelective(RoleDB record);

    List<RoleDB> selectByExample(RoleExample example);

    RoleDB selectByPrimaryKey(Long roleid);

    int updateByExampleSelective(@Param("record") RoleDB record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") RoleDB record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(RoleDB record);

    int updateByPrimaryKey(RoleDB record);
}