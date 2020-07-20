package com.zcset.platform.server.dao.db;

import com.zcset.platform.server.entity.db.UserGroupDB;
import com.zcset.platform.server.entity.db.UserGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGroupMapper {
    long countByExample(UserGroupExample example);

    int deleteByExample(UserGroupExample example);

    int deleteByPrimaryKey(Short usergroupid);

    int insert(UserGroupDB record);

    int insertSelective(UserGroupDB record);

    List<UserGroupDB> selectByExample(UserGroupExample example);

    UserGroupDB selectByPrimaryKey(Short usergroupid);

    int updateByExampleSelective(@Param("record") UserGroupDB record, @Param("example") UserGroupExample example);

    int updateByExample(@Param("record") UserGroupDB record, @Param("example") UserGroupExample example);

    int updateByPrimaryKeySelective(UserGroupDB record);

    int updateByPrimaryKey(UserGroupDB record);
}