package com.example.genator.model;

import java.io.Serializable;

public class RolesDepts implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles_depts.role_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles_depts.dept_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private Long deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roles_depts
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles_depts.role_id
     *
     * @return the value of roles_depts.role_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles_depts.role_id
     *
     * @param roleId the value for roles_depts.role_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles_depts.dept_id
     *
     * @return the value of roles_depts.dept_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles_depts.dept_id
     *
     * @param deptId the value for roles_depts.dept_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_depts
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", deptId=").append(deptId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}