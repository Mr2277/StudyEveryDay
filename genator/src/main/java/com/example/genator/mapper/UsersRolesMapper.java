package com.example.genator.mapper;

import com.example.genator.model.UsersRoles;
import com.example.genator.model.UsersRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersRolesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_roles
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    long countByExample(UsersRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_roles
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByExample(UsersRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_roles
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Long roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_roles
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insert(UsersRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_roles
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insertSelective(UsersRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_roles
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    List<UsersRoles> selectByExample(UsersRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_roles
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") UsersRoles record, @Param("example") UsersRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_roles
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExample(@Param("record") UsersRoles record, @Param("example") UsersRolesExample example);
}