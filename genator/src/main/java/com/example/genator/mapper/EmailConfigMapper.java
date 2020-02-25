package com.example.genator.mapper;

import com.example.genator.model.EmailConfig;
import com.example.genator.model.EmailConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    long countByExample(EmailConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int deleteByExample(EmailConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int insert(EmailConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int insertSelective(EmailConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    List<EmailConfig> selectByExample(EmailConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    EmailConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") EmailConfig record, @Param("example") EmailConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int updateByExample(@Param("record") EmailConfig record, @Param("example") EmailConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int updateByPrimaryKeySelective(EmailConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_config
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int updateByPrimaryKey(EmailConfig record);
}