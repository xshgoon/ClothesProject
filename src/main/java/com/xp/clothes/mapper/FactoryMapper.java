package com.xp.clothes.mapper;

import com.xp.clothes.bean.Factory;
import com.xp.clothes.bean.FactoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory
     *
     * @mbg.generated Fri May 24 16:37:53 CST 2019
     */
    long countByExample(FactoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory
     *
     * @mbg.generated Fri May 24 16:37:53 CST 2019
     */
    int deleteByExample(FactoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory
     *
     * @mbg.generated Fri May 24 16:37:53 CST 2019
     */
    int insert(Factory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory
     *
     * @mbg.generated Fri May 24 16:37:53 CST 2019
     */
    int insertSelective(Factory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory
     *
     * @mbg.generated Fri May 24 16:37:53 CST 2019
     */
    List<Factory> selectByExample(FactoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory
     *
     * @mbg.generated Fri May 24 16:37:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Factory record, @Param("example") FactoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory
     *
     * @mbg.generated Fri May 24 16:37:53 CST 2019
     */
    int updateByExample(@Param("record") Factory record, @Param("example") FactoryExample example);
}