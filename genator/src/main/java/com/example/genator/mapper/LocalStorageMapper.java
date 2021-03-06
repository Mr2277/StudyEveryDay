package com.example.genator.mapper;

import com.example.genator.model.LocalStorage;
import com.example.genator.model.LocalStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocalStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    long countByExample(LocalStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int deleteByExample(LocalStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int insert(LocalStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int insertSelective(LocalStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    List<LocalStorage> selectByExample(LocalStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    LocalStorage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") LocalStorage record, @Param("example") LocalStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int updateByExample(@Param("record") LocalStorage record, @Param("example") LocalStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int updateByPrimaryKeySelective(LocalStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_storage
     *
     * @mbg.generated Tue Feb 25 17:45:27 CST 2020
     */
    int updateByPrimaryKey(LocalStorage record);
}