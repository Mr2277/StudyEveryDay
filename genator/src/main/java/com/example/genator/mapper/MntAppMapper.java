package com.example.genator.mapper;

import com.example.genator.model.MntApp;
import com.example.genator.model.MntAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MntAppMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    long countByExample(MntAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByExample(MntAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insert(MntApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insertSelective(MntApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    List<MntApp> selectByExample(MntAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    MntApp selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") MntApp record, @Param("example") MntAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExample(@Param("record") MntApp record, @Param("example") MntAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByPrimaryKeySelective(MntApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByPrimaryKey(MntApp record);
}