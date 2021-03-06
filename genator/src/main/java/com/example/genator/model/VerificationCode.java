package com.example.genator.model;

import java.io.Serializable;
import java.util.Date;

public class VerificationCode implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verification_code.id
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verification_code.code
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verification_code.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verification_code.status
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verification_code.type
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verification_code.value
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verification_code.scenes
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private String scenes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table verification_code
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verification_code.id
     *
     * @return the value of verification_code.id
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verification_code.id
     *
     * @param id the value for verification_code.id
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verification_code.code
     *
     * @return the value of verification_code.code
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verification_code.code
     *
     * @param code the value for verification_code.code
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verification_code.create_time
     *
     * @return the value of verification_code.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verification_code.create_time
     *
     * @param createTime the value for verification_code.create_time
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verification_code.status
     *
     * @return the value of verification_code.status
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verification_code.status
     *
     * @param status the value for verification_code.status
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verification_code.type
     *
     * @return the value of verification_code.type
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verification_code.type
     *
     * @param type the value for verification_code.type
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verification_code.value
     *
     * @return the value of verification_code.value
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verification_code.value
     *
     * @param value the value for verification_code.value
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verification_code.scenes
     *
     * @return the value of verification_code.scenes
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public String getScenes() {
        return scenes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verification_code.scenes
     *
     * @param scenes the value for verification_code.scenes
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    public void setScenes(String scenes) {
        this.scenes = scenes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table verification_code
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
        sb.append(", code=").append(code);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", value=").append(value);
        sb.append(", scenes=").append(scenes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}