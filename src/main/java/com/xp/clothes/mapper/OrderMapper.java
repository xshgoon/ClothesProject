package com.xp.clothes.mapper;

import com.xp.clothes.bean.Order;
import com.xp.clothes.bean.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	long countByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	int deleteByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	int insert(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	int insertSelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	List<Order> selectByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);
}