package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Short value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Short value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Short value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Short value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Short value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Short value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Short> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Short> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Short value1, Short value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Short value1, Short value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andQtipIsNull() {
            addCriterion("QTIP is null");
            return (Criteria) this;
        }

        public Criteria andQtipIsNotNull() {
            addCriterion("QTIP is not null");
            return (Criteria) this;
        }

        public Criteria andQtipEqualTo(String value) {
            addCriterion("QTIP =", value, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipNotEqualTo(String value) {
            addCriterion("QTIP <>", value, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipGreaterThan(String value) {
            addCriterion("QTIP >", value, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipGreaterThanOrEqualTo(String value) {
            addCriterion("QTIP >=", value, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipLessThan(String value) {
            addCriterion("QTIP <", value, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipLessThanOrEqualTo(String value) {
            addCriterion("QTIP <=", value, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipLike(String value) {
            addCriterion("QTIP like", value, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipNotLike(String value) {
            addCriterion("QTIP not like", value, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipIn(List<String> values) {
            addCriterion("QTIP in", values, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipNotIn(List<String> values) {
            addCriterion("QTIP not in", values, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipBetween(String value1, String value2) {
            addCriterion("QTIP between", value1, value2, "qtip");
            return (Criteria) this;
        }

        public Criteria andQtipNotBetween(String value1, String value2) {
            addCriterion("QTIP not between", value1, value2, "qtip");
            return (Criteria) this;
        }

        public Criteria andImagesrcIsNull() {
            addCriterion("IMAGESRC is null");
            return (Criteria) this;
        }

        public Criteria andImagesrcIsNotNull() {
            addCriterion("IMAGESRC is not null");
            return (Criteria) this;
        }

        public Criteria andImagesrcEqualTo(String value) {
            addCriterion("IMAGESRC =", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcNotEqualTo(String value) {
            addCriterion("IMAGESRC <>", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcGreaterThan(String value) {
            addCriterion("IMAGESRC >", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGESRC >=", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcLessThan(String value) {
            addCriterion("IMAGESRC <", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcLessThanOrEqualTo(String value) {
            addCriterion("IMAGESRC <=", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcLike(String value) {
            addCriterion("IMAGESRC like", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcNotLike(String value) {
            addCriterion("IMAGESRC not like", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcIn(List<String> values) {
            addCriterion("IMAGESRC in", values, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcNotIn(List<String> values) {
            addCriterion("IMAGESRC not in", values, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcBetween(String value1, String value2) {
            addCriterion("IMAGESRC between", value1, value2, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcNotBetween(String value1, String value2) {
            addCriterion("IMAGESRC not between", value1, value2, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNull() {
            addCriterion("DISPLAYNAME is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("DISPLAYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("DISPLAYNAME =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("DISPLAYNAME <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("DISPLAYNAME >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAYNAME >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("DISPLAYNAME <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("DISPLAYNAME <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("DISPLAYNAME like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("DISPLAYNAME not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("DISPLAYNAME in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("DISPLAYNAME not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("DISPLAYNAME between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("DISPLAYNAME not between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andInnernameIsNull() {
            addCriterion("INNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andInnernameIsNotNull() {
            addCriterion("INNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInnernameEqualTo(String value) {
            addCriterion("INNERNAME =", value, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameNotEqualTo(String value) {
            addCriterion("INNERNAME <>", value, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameGreaterThan(String value) {
            addCriterion("INNERNAME >", value, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameGreaterThanOrEqualTo(String value) {
            addCriterion("INNERNAME >=", value, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameLessThan(String value) {
            addCriterion("INNERNAME <", value, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameLessThanOrEqualTo(String value) {
            addCriterion("INNERNAME <=", value, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameLike(String value) {
            addCriterion("INNERNAME like", value, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameNotLike(String value) {
            addCriterion("INNERNAME not like", value, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameIn(List<String> values) {
            addCriterion("INNERNAME in", values, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameNotIn(List<String> values) {
            addCriterion("INNERNAME not in", values, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameBetween(String value1, String value2) {
            addCriterion("INNERNAME between", value1, value2, "innername");
            return (Criteria) this;
        }

        public Criteria andInnernameNotBetween(String value1, String value2) {
            addCriterion("INNERNAME not between", value1, value2, "innername");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Short value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Short value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Short value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Short value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Short value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Short value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Short> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Short> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Short value1, Short value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Short value1, Short value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNull() {
            addCriterion("USERNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNotNull() {
            addCriterion("USERNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUsernumberEqualTo(Short value) {
            addCriterion("USERNUMBER =", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotEqualTo(Short value) {
            addCriterion("USERNUMBER <>", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThan(Short value) {
            addCriterion("USERNUMBER >", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThanOrEqualTo(Short value) {
            addCriterion("USERNUMBER >=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThan(Short value) {
            addCriterion("USERNUMBER <", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThanOrEqualTo(Short value) {
            addCriterion("USERNUMBER <=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberIn(List<Short> values) {
            addCriterion("USERNUMBER in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotIn(List<Short> values) {
            addCriterion("USERNUMBER not in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberBetween(Short value1, Short value2) {
            addCriterion("USERNUMBER between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotBetween(Short value1, Short value2) {
            addCriterion("USERNUMBER not between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
    }
}