package com.example.genator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MntAppExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public MntAppExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUploadPathIsNull() {
            addCriterion("upload_path is null");
            return (Criteria) this;
        }

        public Criteria andUploadPathIsNotNull() {
            addCriterion("upload_path is not null");
            return (Criteria) this;
        }

        public Criteria andUploadPathEqualTo(String value) {
            addCriterion("upload_path =", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathNotEqualTo(String value) {
            addCriterion("upload_path <>", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathGreaterThan(String value) {
            addCriterion("upload_path >", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathGreaterThanOrEqualTo(String value) {
            addCriterion("upload_path >=", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathLessThan(String value) {
            addCriterion("upload_path <", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathLessThanOrEqualTo(String value) {
            addCriterion("upload_path <=", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathLike(String value) {
            addCriterion("upload_path like", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathNotLike(String value) {
            addCriterion("upload_path not like", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathIn(List<String> values) {
            addCriterion("upload_path in", values, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathNotIn(List<String> values) {
            addCriterion("upload_path not in", values, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathBetween(String value1, String value2) {
            addCriterion("upload_path between", value1, value2, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathNotBetween(String value1, String value2) {
            addCriterion("upload_path not between", value1, value2, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathIsNull() {
            addCriterion("deploy_path is null");
            return (Criteria) this;
        }

        public Criteria andDeployPathIsNotNull() {
            addCriterion("deploy_path is not null");
            return (Criteria) this;
        }

        public Criteria andDeployPathEqualTo(String value) {
            addCriterion("deploy_path =", value, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathNotEqualTo(String value) {
            addCriterion("deploy_path <>", value, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathGreaterThan(String value) {
            addCriterion("deploy_path >", value, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathGreaterThanOrEqualTo(String value) {
            addCriterion("deploy_path >=", value, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathLessThan(String value) {
            addCriterion("deploy_path <", value, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathLessThanOrEqualTo(String value) {
            addCriterion("deploy_path <=", value, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathLike(String value) {
            addCriterion("deploy_path like", value, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathNotLike(String value) {
            addCriterion("deploy_path not like", value, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathIn(List<String> values) {
            addCriterion("deploy_path in", values, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathNotIn(List<String> values) {
            addCriterion("deploy_path not in", values, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathBetween(String value1, String value2) {
            addCriterion("deploy_path between", value1, value2, "deployPath");
            return (Criteria) this;
        }

        public Criteria andDeployPathNotBetween(String value1, String value2) {
            addCriterion("deploy_path not between", value1, value2, "deployPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathIsNull() {
            addCriterion("backup_path is null");
            return (Criteria) this;
        }

        public Criteria andBackupPathIsNotNull() {
            addCriterion("backup_path is not null");
            return (Criteria) this;
        }

        public Criteria andBackupPathEqualTo(String value) {
            addCriterion("backup_path =", value, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathNotEqualTo(String value) {
            addCriterion("backup_path <>", value, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathGreaterThan(String value) {
            addCriterion("backup_path >", value, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathGreaterThanOrEqualTo(String value) {
            addCriterion("backup_path >=", value, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathLessThan(String value) {
            addCriterion("backup_path <", value, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathLessThanOrEqualTo(String value) {
            addCriterion("backup_path <=", value, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathLike(String value) {
            addCriterion("backup_path like", value, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathNotLike(String value) {
            addCriterion("backup_path not like", value, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathIn(List<String> values) {
            addCriterion("backup_path in", values, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathNotIn(List<String> values) {
            addCriterion("backup_path not in", values, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathBetween(String value1, String value2) {
            addCriterion("backup_path between", value1, value2, "backupPath");
            return (Criteria) this;
        }

        public Criteria andBackupPathNotBetween(String value1, String value2) {
            addCriterion("backup_path not between", value1, value2, "backupPath");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andStartScriptIsNull() {
            addCriterion("start_script is null");
            return (Criteria) this;
        }

        public Criteria andStartScriptIsNotNull() {
            addCriterion("start_script is not null");
            return (Criteria) this;
        }

        public Criteria andStartScriptEqualTo(String value) {
            addCriterion("start_script =", value, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptNotEqualTo(String value) {
            addCriterion("start_script <>", value, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptGreaterThan(String value) {
            addCriterion("start_script >", value, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptGreaterThanOrEqualTo(String value) {
            addCriterion("start_script >=", value, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptLessThan(String value) {
            addCriterion("start_script <", value, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptLessThanOrEqualTo(String value) {
            addCriterion("start_script <=", value, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptLike(String value) {
            addCriterion("start_script like", value, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptNotLike(String value) {
            addCriterion("start_script not like", value, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptIn(List<String> values) {
            addCriterion("start_script in", values, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptNotIn(List<String> values) {
            addCriterion("start_script not in", values, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptBetween(String value1, String value2) {
            addCriterion("start_script between", value1, value2, "startScript");
            return (Criteria) this;
        }

        public Criteria andStartScriptNotBetween(String value1, String value2) {
            addCriterion("start_script not between", value1, value2, "startScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptIsNull() {
            addCriterion("deploy_script is null");
            return (Criteria) this;
        }

        public Criteria andDeployScriptIsNotNull() {
            addCriterion("deploy_script is not null");
            return (Criteria) this;
        }

        public Criteria andDeployScriptEqualTo(String value) {
            addCriterion("deploy_script =", value, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptNotEqualTo(String value) {
            addCriterion("deploy_script <>", value, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptGreaterThan(String value) {
            addCriterion("deploy_script >", value, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptGreaterThanOrEqualTo(String value) {
            addCriterion("deploy_script >=", value, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptLessThan(String value) {
            addCriterion("deploy_script <", value, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptLessThanOrEqualTo(String value) {
            addCriterion("deploy_script <=", value, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptLike(String value) {
            addCriterion("deploy_script like", value, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptNotLike(String value) {
            addCriterion("deploy_script not like", value, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptIn(List<String> values) {
            addCriterion("deploy_script in", values, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptNotIn(List<String> values) {
            addCriterion("deploy_script not in", values, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptBetween(String value1, String value2) {
            addCriterion("deploy_script between", value1, value2, "deployScript");
            return (Criteria) this;
        }

        public Criteria andDeployScriptNotBetween(String value1, String value2) {
            addCriterion("deploy_script not between", value1, value2, "deployScript");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mnt_app
     *
     * @mbg.generated do_not_delete_during_merge Tue Feb 25 17:45:28 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mnt_app
     *
     * @mbg.generated Tue Feb 25 17:45:28 CST 2020
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
}