package com.zcset.platform.server.dao.db;

import com.zcset.platform.server.entity.db.URLinkDB;
import com.zcset.platform.server.entity.db.URLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface URLinkMapper {
    long countByExample(URLinkExample example);

    int deleteByExample(URLinkExample example);

    int deleteByPrimaryKey(Long urid);

    int insert(URLinkDB record);

    int insertSelective(URLinkDB record);

    List<URLinkDB> selectByExample(URLinkExample example);

    URLinkDB selectByPrimaryKey(Long urid);

    int updateByExampleSelective(@Param("record") URLinkDB record, @Param("example") URLinkExample example);

    int updateByExample(@Param("record") URLinkDB record, @Param("example") URLinkExample example);

    int updateByPrimaryKeySelective(URLinkDB record);

    int updateByPrimaryKey(URLinkDB record);
}