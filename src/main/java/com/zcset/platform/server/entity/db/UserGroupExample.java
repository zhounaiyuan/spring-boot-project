package com.zcset.platform.server.entity.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserGroupExample() {
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

        public Criteria andUsergroupidIsNull() {
            addCriterion("USERGROUPID is null");
            return (Criteria) this;
        }

        public Criteria andUsergroupidIsNotNull() {
            addCriterion("USERGROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andUsergroupidEqualTo(Short value) {
            addCriterion("USERGROUPID =", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotEqualTo(Short value) {
            addCriterion("USERGROUPID <>", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidGreaterThan(Short value) {
            addCriterion("USERGROUPID >", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidGreaterThanOrEqualTo(Short value) {
            addCriterion("USERGROUPID >=", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidLessThan(Short value) {
            addCriterion("USERGROUPID <", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidLessThanOrEqualTo(Short value) {
            addCriterion("USERGROUPID <=", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidIn(List<Short> values) {
            addCriterion("USERGROUPID in", values, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotIn(List<Short> values) {
            addCriterion("USERGROUPID not in", values, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidBetween(Short value1, Short value2) {
            addCriterion("USERGROUPID between", value1, value2, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotBetween(Short value1, Short value2) {
            addCriterion("USERGROUPID not between", value1, value2, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameIsNull() {
            addCriterion("USERGROUPNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameIsNotNull() {
            addCriterion("USERGROUPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameEqualTo(String value) {
            addCriterion("USERGROUPNAME =", value, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameNotEqualTo(String value) {
            addCriterion("USERGROUPNAME <>", value, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameGreaterThan(String value) {
            addCriterion("USERGROUPNAME >", value, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("USERGROUPNAME >=", value, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameLessThan(String value) {
            addCriterion("USERGROUPNAME <", value, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameLessThanOrEqualTo(String value) {
            addCriterion("USERGROUPNAME <=", value, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameLike(String value) {
            addCriterion("USERGROUPNAME like", value, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameNotLike(String value) {
            addCriterion("USERGROUPNAME not like", value, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameIn(List<String> values) {
            addCriterion("USERGROUPNAME in", values, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameNotIn(List<String> values) {
            addCriterion("USERGROUPNAME not in", values, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameBetween(String value1, String value2) {
            addCriterion("USERGROUPNAME between", value1, value2, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andUsergroupnameNotBetween(String value1, String value2) {
            addCriterion("USERGROUPNAME not between", value1, value2, "usergroupname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Short value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Short value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Short value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Short value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Short value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Short value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Short> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Short> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Short value1, Short value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Short value1, Short value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
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

        public Criteria andOrdernumberIsNull() {
            addCriterion("ORDERNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("ORDERNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(Short value) {
            addCriterion("ORDERNUMBER =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(Short value) {
            addCriterion("ORDERNUMBER <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(Short value) {
            addCriterion("ORDERNUMBER >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDERNUMBER >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(Short value) {
            addCriterion("ORDERNUMBER <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(Short value) {
            addCriterion("ORDERNUMBER <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<Short> values) {
            addCriterion("ORDERNUMBER in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<Short> values) {
            addCriterion("ORDERNUMBER not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(Short value1, Short value2) {
            addCriterion("ORDERNUMBER between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(Short value1, Short value2) {
            addCriterion("ORDERNUMBER not between", value1, value2, "ordernumber");
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

        public Criteria andUsergroupnumberIsNull() {
            addCriterion("USERGROUPNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberIsNotNull() {
            addCriterion("USERGROUPNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberEqualTo(Short value) {
            addCriterion("USERGROUPNUMBER =", value, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberNotEqualTo(Short value) {
            addCriterion("USERGROUPNUMBER <>", value, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberGreaterThan(Short value) {
            addCriterion("USERGROUPNUMBER >", value, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberGreaterThanOrEqualTo(Short value) {
            addCriterion("USERGROUPNUMBER >=", value, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberLessThan(Short value) {
            addCriterion("USERGROUPNUMBER <", value, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberLessThanOrEqualTo(Short value) {
            addCriterion("USERGROUPNUMBER <=", value, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberIn(List<Short> values) {
            addCriterion("USERGROUPNUMBER in", values, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberNotIn(List<Short> values) {
            addCriterion("USERGROUPNUMBER not in", values, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberBetween(Short value1, Short value2) {
            addCriterion("USERGROUPNUMBER between", value1, value2, "usergroupnumber");
            return (Criteria) this;
        }

        public Criteria andUsergroupnumberNotBetween(Short value1, Short value2) {
            addCriterion("USERGROUPNUMBER not between", value1, value2, "usergroupnumber");
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