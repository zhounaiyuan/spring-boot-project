package com.zcset.platform.server.dao.db;

import com.zcset.platform.server.entity.db.UUGLinkDB;
import com.zcset.platform.server.entity.db.UUGLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UUGLinkMapper {
    long countByExample(UUGLinkExample example);

    int deleteByExample(UUGLinkExample example);

    int deleteByPrimaryKey(Short uugid);

    int insert(UUGLinkDB record);

    int insertSelective(UUGLinkDB record);

    List<UUGLinkDB> selectByExample(UUGLinkExample example);

    UUGLinkDB selectByPrimaryKey(Short uugid);

    int updateByExampleSelective(@Param("record") UUGLinkDB record, @Param("example") UUGLinkExample example);

    int updateByExample(@Param("record") UUGLinkDB record, @Param("example") UUGLinkExample example);

    int updateByPrimaryKeySelective(UUGLinkDB record);

    int updateByPrimaryKey(UUGLinkDB record);
}