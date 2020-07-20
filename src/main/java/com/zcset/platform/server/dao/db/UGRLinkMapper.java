package com.zcset.platform.server.dao.db;

import com.zcset.platform.server.entity.db.UGRLinkDB;
import com.zcset.platform.server.entity.db.UGRLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UGRLinkMapper {
    long countByExample(UGRLinkExample example);

    int deleteByExample(UGRLinkExample example);

    int deleteByPrimaryKey(Short ugrid);

    int insert(UGRLinkDB record);

    int insertSelective(UGRLinkDB record);

    List<UGRLinkDB> selectByExample(UGRLinkExample example);

    UGRLinkDB selectByPrimaryKey(Short ugrid);

    int updateByExampleSelective(@Param("record") UGRLinkDB record, @Param("example") UGRLinkExample example);

    int updateByExample(@Param("record") UGRLinkDB record, @Param("example") UGRLinkExample example);

    int updateByPrimaryKeySelective(UGRLinkDB record);

    int updateByPrimaryKey(UGRLinkDB record);
}