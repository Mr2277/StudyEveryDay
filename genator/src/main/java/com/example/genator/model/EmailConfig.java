package com.example.genator.model;

import java.io.Serializable;

public class EmailConfig implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_config.id
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_config.from_user
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String fromUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_config.host
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_config.pass
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String pass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_config.port
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_config.user
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_config.id
     *
     * @return the value of email_config.id
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_config.id
     *
     * @param id the value for email_config.id
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_config.from_user
     *
     * @return the value of email_config.from_user
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getFromUser() {
        return fromUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_config.from_user
     *
     * @param fromUser the value for email_config.from_user
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_config.host
     *
     * @return the value of email_config.host
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_config.host
     *
     * @param host the value for email_config.host
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_config.pass
     *
     * @return the value of email_config.pass
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_config.pass
     *
     * @param pass the value for email_config.pass
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_config.port
     *
     * @return the value of email_config.port
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_config.port
     *
     * @param port the value for email_config.port
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_config.user
     *
     * @return the value of email_config.user
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_config.user
     *
     * @param user the value for email_config.user
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fromUser=").append(fromUser);
        sb.append(", host=").append(host);
        sb.append(", pass=").append(pass);
        sb.append(", port=").append(port);
        sb.append(", user=").append(user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}