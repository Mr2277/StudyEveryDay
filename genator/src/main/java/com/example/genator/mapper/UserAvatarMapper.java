package com.example.genator.mapper;

import com.example.genator.model.UserAvatar;
import com.example.genator.model.UserAvatarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAvatarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    long countByExample(UserAvatarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByExample(UserAvatarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insert(UserAvatar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insertSelective(UserAvatar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    List<UserAvatar> selectByExample(UserAvatarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    UserAvatar selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserAvatar record, @Param("example") UserAvatarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExample(@Param("record") UserAvatar record, @Param("example") UserAvatarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByPrimaryKeySelective(UserAvatar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByPrimaryKey(UserAvatar record);
}