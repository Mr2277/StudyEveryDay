package com.example.genator.model;

import java.io.Serializable;
import java.util.Date;

public class MntDeployHistory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mnt_deploy_history.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mnt_deploy_history.app_name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String appName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mnt_deploy_history.deploy_date
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private Date deployDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mnt_deploy_history.deploy_user
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String deployUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mnt_deploy_history.ip
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mnt_deploy_history.deploy_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private Long deployId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mnt_deploy_history
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mnt_deploy_history.id
     *
     * @return the value of mnt_deploy_history.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mnt_deploy_history.id
     *
     * @param id the value for mnt_deploy_history.id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mnt_deploy_history.app_name
     *
     * @return the value of mnt_deploy_history.app_name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getAppName() {
        return appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mnt_deploy_history.app_name
     *
     * @param appName the value for mnt_deploy_history.app_name
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mnt_deploy_history.deploy_date
     *
     * @return the value of mnt_deploy_history.deploy_date
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Date getDeployDate() {
        return deployDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mnt_deploy_history.deploy_date
     *
     * @param deployDate the value for mnt_deploy_history.deploy_date
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setDeployDate(Date deployDate) {
        this.deployDate = deployDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mnt_deploy_history.deploy_user
     *
     * @return the value of mnt_deploy_history.deploy_user
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getDeployUser() {
        return deployUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mnt_deploy_history.deploy_user
     *
     * @param deployUser the value for mnt_deploy_history.deploy_user
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setDeployUser(String deployUser) {
        this.deployUser = deployUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mnt_deploy_history.ip
     *
     * @return the value of mnt_deploy_history.ip
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mnt_deploy_history.ip
     *
     * @param ip the value for mnt_deploy_history.ip
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mnt_deploy_history.deploy_id
     *
     * @return the value of mnt_deploy_history.deploy_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Long getDeployId() {
        return deployId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mnt_deploy_history.deploy_id
     *
     * @param deployId the value for mnt_deploy_history.deploy_id
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setDeployId(Long deployId) {
        this.deployId = deployId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_deploy_history
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
        sb.append(", appName=").append(appName);
        sb.append(", deployDate=").append(deployDate);
        sb.append(", deployUser=").append(deployUser);
        sb.append(", ip=").append(ip);
        sb.append(", deployId=").append(deployId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}