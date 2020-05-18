package com.example.genator.mapper;

import com.example.genator.model.MonitorServer;
import com.example.genator.model.MonitorServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonitorServerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    long countByExample(MonitorServerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByExample(MonitorServerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insert(MonitorServer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int insertSelective(MonitorServer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    List<MonitorServer> selectByExample(MonitorServerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    MonitorServer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") MonitorServer record, @Param("example") MonitorServerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByExample(@Param("record") MonitorServer record, @Param("example") MonitorServerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByPrimaryKeySelective(MonitorServer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_server
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    int updateByPrimaryKey(MonitorServer record);
}