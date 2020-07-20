package com.zcset.platform.server.dao.db;

import com.zcset.platform.server.entity.db.UserDB;
import com.zcset.platform.server.entity.db.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ：zny
 * @date ：2020.6.19
 * @description：
 * @modified By：
 * @version: 1.0
 */
//@Mapper
public interface UserMapper {
    /**
     * @return 数目
     * @Param: UserExample即查找条件
     */
    long countByExample(UserExample example);

    /**
     * @return 删除数目
     * @Param: UserExample即删除条件
     */
    int deleteByExample(UserExample example);

    /**
     * @return 删除数量
     * @Param: 用户的id
     */
    int deleteByPrimaryKey(Long userid);

    /**
     * @return 添加的数量
     * @Param: 用户对象
     */
    int insert(UserDB record);

    /**
     * @return 添加的数量
     * @Param: 用户对象
     */
    int insertSelective(UserDB record);

    /**
     * @param example 查询的条件
     * @return 查询的结果
     */
    List<UserDB> selectByExample(UserExample example);

    /**
     * @param userid 查询的id
     * @return 查询的结果
     */
    UserDB selectByPrimaryKey(Long userid);

    /**
     * @param record  要变更后的数据
     * @param example 要修改对象满足的条件
     * @return 变更的数量
     */
    int updateByExampleSelective(@Param("record") UserDB record, @Param("example") UserExample example);

    /**
     * @param record  要变更后的数据
     * @param example 要修改对象满足的条件
     * @return 变更的数量
     */
    int updateByExample(@Param("record") UserDB record, @Param("example") UserExample example);

    /**
     * @param record 根据对象的id去变更后的对象
     * @return 变更的数量
     */
    int updateByPrimaryKeySelective(UserDB record);

    /**
     * @param record 根据对象的id去变更后的对象
     * @return 变更的数量
     */
    int updateByPrimaryKey(UserDB record);
}