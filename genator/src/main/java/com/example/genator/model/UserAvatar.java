package com.example.genator.model;

import java.io.Serializable;
import java.util.Date;

public class UserAvatar implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_avatar.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_avatar.real_name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_avatar.path
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_avatar.size
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_avatar.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_avatar
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_avatar.id
     *
     * @return the value of user_avatar.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_avatar.id
     *
     * @param id the value for user_avatar.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_avatar.real_name
     *
     * @return the value of user_avatar.real_name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_avatar.real_name
     *
     * @param realName the value for user_avatar.real_name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_avatar.path
     *
     * @return the value of user_avatar.path
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_avatar.path
     *
     * @param path the value for user_avatar.path
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_avatar.size
     *
     * @return the value of user_avatar.size
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_avatar.size
     *
     * @param size the value for user_avatar.size
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_avatar.create_time
     *
     * @return the value of user_avatar.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_avatar.create_time
     *
     * @param createTime the value for user_avatar.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar
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
        sb.append(", realName=").append(realName);
        sb.append(", path=").append(path);
        sb.append(", size=").append(size);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}