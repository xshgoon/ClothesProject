package com.xp.clothes.bean;

import java.util.ArrayList;
import java.util.List;

public class FactoryExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public FactoryExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andFactoryIdIsNull() {
			addCriterion("factory_id is null");
			return (Criteria) this;
		}

		public Criteria andFactoryIdIsNotNull() {
			addCriterion("factory_id is not null");
			return (Criteria) this;
		}

		public Criteria andFactoryIdEqualTo(Integer value) {
			addCriterion("factory_id =", value, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdNotEqualTo(Integer value) {
			addCriterion("factory_id <>", value, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdGreaterThan(Integer value) {
			addCriterion("factory_id >", value, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("factory_id >=", value, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdLessThan(Integer value) {
			addCriterion("factory_id <", value, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdLessThanOrEqualTo(Integer value) {
			addCriterion("factory_id <=", value, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdIn(List<Integer> values) {
			addCriterion("factory_id in", values, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdNotIn(List<Integer> values) {
			addCriterion("factory_id not in", values, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdBetween(Integer value1, Integer value2) {
			addCriterion("factory_id between", value1, value2, "factoryId");
			return (Criteria) this;
		}

		public Criteria andFactoryIdNotBetween(Integer value1, Integer value2) {
			addCriterion("factory_id not between", value1, value2, "factoryId");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andFactoryType1IsNull() {
			addCriterion("factory_type1 is null");
			return (Criteria) this;
		}

		public Criteria andFactoryType1IsNotNull() {
			addCriterion("factory_type1 is not null");
			return (Criteria) this;
		}

		public Criteria andFactoryType1EqualTo(String value) {
			addCriterion("factory_type1 =", value, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1NotEqualTo(String value) {
			addCriterion("factory_type1 <>", value, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1GreaterThan(String value) {
			addCriterion("factory_type1 >", value, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1GreaterThanOrEqualTo(String value) {
			addCriterion("factory_type1 >=", value, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1LessThan(String value) {
			addCriterion("factory_type1 <", value, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1LessThanOrEqualTo(String value) {
			addCriterion("factory_type1 <=", value, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1Like(String value) {
			addCriterion("factory_type1 like", value, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1NotLike(String value) {
			addCriterion("factory_type1 not like", value, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1In(List<String> values) {
			addCriterion("factory_type1 in", values, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1NotIn(List<String> values) {
			addCriterion("factory_type1 not in", values, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1Between(String value1, String value2) {
			addCriterion("factory_type1 between", value1, value2, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andFactoryType1NotBetween(String value1, String value2) {
			addCriterion("factory_type1 not between", value1, value2, "factoryType1");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andPnumberIsNull() {
			addCriterion("pnumber is null");
			return (Criteria) this;
		}

		public Criteria andPnumberIsNotNull() {
			addCriterion("pnumber is not null");
			return (Criteria) this;
		}

		public Criteria andPnumberEqualTo(Integer value) {
			addCriterion("pnumber =", value, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberNotEqualTo(Integer value) {
			addCriterion("pnumber <>", value, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberGreaterThan(Integer value) {
			addCriterion("pnumber >", value, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberGreaterThanOrEqualTo(Integer value) {
			addCriterion("pnumber >=", value, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberLessThan(Integer value) {
			addCriterion("pnumber <", value, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberLessThanOrEqualTo(Integer value) {
			addCriterion("pnumber <=", value, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberIn(List<Integer> values) {
			addCriterion("pnumber in", values, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberNotIn(List<Integer> values) {
			addCriterion("pnumber not in", values, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberBetween(Integer value1, Integer value2) {
			addCriterion("pnumber between", value1, value2, "pnumber");
			return (Criteria) this;
		}

		public Criteria andPnumberNotBetween(Integer value1, Integer value2) {
			addCriterion("pnumber not between", value1, value2, "pnumber");
			return (Criteria) this;
		}

		public Criteria andFactoryNameIsNull() {
			addCriterion("factory_name is null");
			return (Criteria) this;
		}

		public Criteria andFactoryNameIsNotNull() {
			addCriterion("factory_name is not null");
			return (Criteria) this;
		}

		public Criteria andFactoryNameEqualTo(String value) {
			addCriterion("factory_name =", value, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameNotEqualTo(String value) {
			addCriterion("factory_name <>", value, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameGreaterThan(String value) {
			addCriterion("factory_name >", value, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
			addCriterion("factory_name >=", value, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameLessThan(String value) {
			addCriterion("factory_name <", value, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameLessThanOrEqualTo(String value) {
			addCriterion("factory_name <=", value, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameLike(String value) {
			addCriterion("factory_name like", value, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameNotLike(String value) {
			addCriterion("factory_name not like", value, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameIn(List<String> values) {
			addCriterion("factory_name in", values, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameNotIn(List<String> values) {
			addCriterion("factory_name not in", values, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameBetween(String value1, String value2) {
			addCriterion("factory_name between", value1, value2, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFactoryNameNotBetween(String value1, String value2) {
			addCriterion("factory_name not between", value1, value2, "factoryName");
			return (Criteria) this;
		}

		public Criteria andFtTypeIsNull() {
			addCriterion("ft_type is null");
			return (Criteria) this;
		}

		public Criteria andFtTypeIsNotNull() {
			addCriterion("ft_type is not null");
			return (Criteria) this;
		}

		public Criteria andFtTypeEqualTo(String value) {
			addCriterion("ft_type =", value, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeNotEqualTo(String value) {
			addCriterion("ft_type <>", value, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeGreaterThan(String value) {
			addCriterion("ft_type >", value, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeGreaterThanOrEqualTo(String value) {
			addCriterion("ft_type >=", value, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeLessThan(String value) {
			addCriterion("ft_type <", value, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeLessThanOrEqualTo(String value) {
			addCriterion("ft_type <=", value, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeLike(String value) {
			addCriterion("ft_type like", value, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeNotLike(String value) {
			addCriterion("ft_type not like", value, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeIn(List<String> values) {
			addCriterion("ft_type in", values, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeNotIn(List<String> values) {
			addCriterion("ft_type not in", values, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeBetween(String value1, String value2) {
			addCriterion("ft_type between", value1, value2, "ftType");
			return (Criteria) this;
		}

		public Criteria andFtTypeNotBetween(String value1, String value2) {
			addCriterion("ft_type not between", value1, value2, "ftType");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNull() {
			addCriterion("money is null");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNotNull() {
			addCriterion("money is not null");
			return (Criteria) this;
		}

		public Criteria andMoneyEqualTo(String value) {
			addCriterion("money =", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotEqualTo(String value) {
			addCriterion("money <>", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThan(String value) {
			addCriterion("money >", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThanOrEqualTo(String value) {
			addCriterion("money >=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThan(String value) {
			addCriterion("money <", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThanOrEqualTo(String value) {
			addCriterion("money <=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLike(String value) {
			addCriterion("money like", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotLike(String value) {
			addCriterion("money not like", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyIn(List<String> values) {
			addCriterion("money in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotIn(List<String> values) {
			addCriterion("money not in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyBetween(String value1, String value2) {
			addCriterion("money between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotBetween(String value1, String value2) {
			addCriterion("money not between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andFsIdIsNull() {
			addCriterion("fs_id is null");
			return (Criteria) this;
		}

		public Criteria andFsIdIsNotNull() {
			addCriterion("fs_id is not null");
			return (Criteria) this;
		}

		public Criteria andFsIdEqualTo(Integer value) {
			addCriterion("fs_id =", value, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdNotEqualTo(Integer value) {
			addCriterion("fs_id <>", value, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdGreaterThan(Integer value) {
			addCriterion("fs_id >", value, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("fs_id >=", value, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdLessThan(Integer value) {
			addCriterion("fs_id <", value, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdLessThanOrEqualTo(Integer value) {
			addCriterion("fs_id <=", value, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdIn(List<Integer> values) {
			addCriterion("fs_id in", values, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdNotIn(List<Integer> values) {
			addCriterion("fs_id not in", values, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdBetween(Integer value1, Integer value2) {
			addCriterion("fs_id between", value1, value2, "fsId");
			return (Criteria) this;
		}

		public Criteria andFsIdNotBetween(Integer value1, Integer value2) {
			addCriterion("fs_id not between", value1, value2, "fsId");
			return (Criteria) this;
		}

		public Criteria andOrderTypeIsNull() {
			addCriterion("order_type is null");
			return (Criteria) this;
		}

		public Criteria andOrderTypeIsNotNull() {
			addCriterion("order_type is not null");
			return (Criteria) this;
		}

		public Criteria andOrderTypeEqualTo(String value) {
			addCriterion("order_type =", value, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeNotEqualTo(String value) {
			addCriterion("order_type <>", value, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeGreaterThan(String value) {
			addCriterion("order_type >", value, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
			addCriterion("order_type >=", value, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeLessThan(String value) {
			addCriterion("order_type <", value, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeLessThanOrEqualTo(String value) {
			addCriterion("order_type <=", value, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeLike(String value) {
			addCriterion("order_type like", value, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeNotLike(String value) {
			addCriterion("order_type not like", value, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeIn(List<String> values) {
			addCriterion("order_type in", values, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeNotIn(List<String> values) {
			addCriterion("order_type not in", values, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeBetween(String value1, String value2) {
			addCriterion("order_type between", value1, value2, "orderType");
			return (Criteria) this;
		}

		public Criteria andOrderTypeNotBetween(String value1, String value2) {
			addCriterion("order_type not between", value1, value2, "orderType");
			return (Criteria) this;
		}

		public Criteria andTimeIsNull() {
			addCriterion("time is null");
			return (Criteria) this;
		}

		public Criteria andTimeIsNotNull() {
			addCriterion("time is not null");
			return (Criteria) this;
		}

		public Criteria andTimeEqualTo(String value) {
			addCriterion("time =", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotEqualTo(String value) {
			addCriterion("time <>", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThan(String value) {
			addCriterion("time >", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThanOrEqualTo(String value) {
			addCriterion("time >=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThan(String value) {
			addCriterion("time <", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThanOrEqualTo(String value) {
			addCriterion("time <=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLike(String value) {
			addCriterion("time like", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotLike(String value) {
			addCriterion("time not like", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeIn(List<String> values) {
			addCriterion("time in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotIn(List<String> values) {
			addCriterion("time not in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeBetween(String value1, String value2) {
			addCriterion("time between", value1, value2, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotBetween(String value1, String value2) {
			addCriterion("time not between", value1, value2, "time");
			return (Criteria) this;
		}

		public Criteria andRegionIsNull() {
			addCriterion("region is null");
			return (Criteria) this;
		}

		public Criteria andRegionIsNotNull() {
			addCriterion("region is not null");
			return (Criteria) this;
		}

		public Criteria andRegionEqualTo(String value) {
			addCriterion("region =", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionNotEqualTo(String value) {
			addCriterion("region <>", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionGreaterThan(String value) {
			addCriterion("region >", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionGreaterThanOrEqualTo(String value) {
			addCriterion("region >=", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionLessThan(String value) {
			addCriterion("region <", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionLessThanOrEqualTo(String value) {
			addCriterion("region <=", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionLike(String value) {
			addCriterion("region like", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionNotLike(String value) {
			addCriterion("region not like", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionIn(List<String> values) {
			addCriterion("region in", values, "region");
			return (Criteria) this;
		}

		public Criteria andRegionNotIn(List<String> values) {
			addCriterion("region not in", values, "region");
			return (Criteria) this;
		}

		public Criteria andRegionBetween(String value1, String value2) {
			addCriterion("region between", value1, value2, "region");
			return (Criteria) this;
		}

		public Criteria andRegionNotBetween(String value1, String value2) {
			addCriterion("region not between", value1, value2, "region");
			return (Criteria) this;
		}

		public Criteria andSiteIsNull() {
			addCriterion("site is null");
			return (Criteria) this;
		}

		public Criteria andSiteIsNotNull() {
			addCriterion("site is not null");
			return (Criteria) this;
		}

		public Criteria andSiteEqualTo(String value) {
			addCriterion("site =", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotEqualTo(String value) {
			addCriterion("site <>", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteGreaterThan(String value) {
			addCriterion("site >", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteGreaterThanOrEqualTo(String value) {
			addCriterion("site >=", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLessThan(String value) {
			addCriterion("site <", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLessThanOrEqualTo(String value) {
			addCriterion("site <=", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLike(String value) {
			addCriterion("site like", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotLike(String value) {
			addCriterion("site not like", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteIn(List<String> values) {
			addCriterion("site in", values, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotIn(List<String> values) {
			addCriterion("site not in", values, "site");
			return (Criteria) this;
		}

		public Criteria andSiteBetween(String value1, String value2) {
			addCriterion("site between", value1, value2, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotBetween(String value1, String value2) {
			addCriterion("site not between", value1, value2, "site");
			return (Criteria) this;
		}

		public Criteria andFCommentsIsNull() {
			addCriterion("f_comments is null");
			return (Criteria) this;
		}

		public Criteria andFCommentsIsNotNull() {
			addCriterion("f_comments is not null");
			return (Criteria) this;
		}

		public Criteria andFCommentsEqualTo(String value) {
			addCriterion("f_comments =", value, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsNotEqualTo(String value) {
			addCriterion("f_comments <>", value, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsGreaterThan(String value) {
			addCriterion("f_comments >", value, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsGreaterThanOrEqualTo(String value) {
			addCriterion("f_comments >=", value, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsLessThan(String value) {
			addCriterion("f_comments <", value, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsLessThanOrEqualTo(String value) {
			addCriterion("f_comments <=", value, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsLike(String value) {
			addCriterion("f_comments like", value, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsNotLike(String value) {
			addCriterion("f_comments not like", value, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsIn(List<String> values) {
			addCriterion("f_comments in", values, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsNotIn(List<String> values) {
			addCriterion("f_comments not in", values, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsBetween(String value1, String value2) {
			addCriterion("f_comments between", value1, value2, "fComments");
			return (Criteria) this;
		}

		public Criteria andFCommentsNotBetween(String value1, String value2) {
			addCriterion("f_comments not between", value1, value2, "fComments");
			return (Criteria) this;
		}

		public Criteria andPictureIsNull() {
			addCriterion("picture is null");
			return (Criteria) this;
		}

		public Criteria andPictureIsNotNull() {
			addCriterion("picture is not null");
			return (Criteria) this;
		}

		public Criteria andPictureEqualTo(String value) {
			addCriterion("picture =", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureNotEqualTo(String value) {
			addCriterion("picture <>", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureGreaterThan(String value) {
			addCriterion("picture >", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureGreaterThanOrEqualTo(String value) {
			addCriterion("picture >=", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureLessThan(String value) {
			addCriterion("picture <", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureLessThanOrEqualTo(String value) {
			addCriterion("picture <=", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureLike(String value) {
			addCriterion("picture like", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureNotLike(String value) {
			addCriterion("picture not like", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureIn(List<String> values) {
			addCriterion("picture in", values, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureNotIn(List<String> values) {
			addCriterion("picture not in", values, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureBetween(String value1, String value2) {
			addCriterion("picture between", value1, value2, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureNotBetween(String value1, String value2) {
			addCriterion("picture not between", value1, value2, "picture");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table factory
	 * @mbg.generated  Fri May 24 19:29:20 CST 2019
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table factory
     *
     * @mbg.generated do_not_delete_during_merge Fri May 24 16:37:53 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}