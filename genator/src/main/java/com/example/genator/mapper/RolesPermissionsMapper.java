package com.example.genator.mapper;

import com.example.genator.model.RolesPermissions;
import com.example.genator.model.RolesPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolesPermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    long countByExample(RolesPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByExample(RolesPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insert(RolesPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insertSelective(RolesPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    List<RolesPermissions> selectByExample(RolesPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") RolesPermissions record, @Param("example") RolesPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExample(@Param("record") RolesPermissions record, @Param("example") RolesPermissionsExample example);
}