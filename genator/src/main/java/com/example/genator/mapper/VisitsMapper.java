package com.example.genator.mapper;

import com.example.genator.model.Visits;
import com.example.genator.model.VisitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    long countByExample(VisitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByExample(VisitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insert(Visits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insertSelective(Visits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    List<Visits> selectByExample(VisitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    Visits selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") Visits record, @Param("example") VisitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExample(@Param("record") Visits record, @Param("example") VisitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByPrimaryKeySelective(Visits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visits
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByPrimaryKey(Visits record);
}