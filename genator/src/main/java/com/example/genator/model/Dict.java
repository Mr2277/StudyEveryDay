package com.example.genator.model;

import java.io.Serializable;
import java.util.Date;

public class Dict implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.remark
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.id
     *
     * @return the value of dict.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.id
     *
     * @param id the value for dict.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.name
     *
     * @return the value of dict.name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.name
     *
     * @param name the value for dict.name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.remark
     *
     * @return the value of dict.remark
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.remark
     *
     * @param remark the value for dict.remark
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.create_time
     *
     * @return the value of dict.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.create_time
     *
     * @param createTime the value for dict.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}