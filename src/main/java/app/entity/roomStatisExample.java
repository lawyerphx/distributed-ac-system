package app.entity;

import java.util.ArrayList;
import java.util.List;

public class roomStatisExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public roomStatisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
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
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
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

        public Criteria andRoomidIsNull() {
            addCriterion("roomId is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomId is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomId =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomId <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomId >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomId >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomId <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomId <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomId in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomId not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomId between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomId not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterIsNull() {
            addCriterion("turnOnCounter is null");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterIsNotNull() {
            addCriterion("turnOnCounter is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterEqualTo(Integer value) {
            addCriterion("turnOnCounter =", value, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterNotEqualTo(Integer value) {
            addCriterion("turnOnCounter <>", value, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterGreaterThan(Integer value) {
            addCriterion("turnOnCounter >", value, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("turnOnCounter >=", value, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterLessThan(Integer value) {
            addCriterion("turnOnCounter <", value, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterLessThanOrEqualTo(Integer value) {
            addCriterion("turnOnCounter <=", value, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterIn(List<Integer> values) {
            addCriterion("turnOnCounter in", values, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterNotIn(List<Integer> values) {
            addCriterion("turnOnCounter not in", values, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterBetween(Integer value1, Integer value2) {
            addCriterion("turnOnCounter between", value1, value2, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andTurnoncounterNotBetween(Integer value1, Integer value2) {
            addCriterion("turnOnCounter not between", value1, value2, "turnoncounter");
            return (Criteria) this;
        }

        public Criteria andRunningtimeIsNull() {
            addCriterion("runningTime is null");
            return (Criteria) this;
        }

        public Criteria andRunningtimeIsNotNull() {
            addCriterion("runningTime is not null");
            return (Criteria) this;
        }

        public Criteria andRunningtimeEqualTo(Integer value) {
            addCriterion("runningTime =", value, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeNotEqualTo(Integer value) {
            addCriterion("runningTime <>", value, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeGreaterThan(Integer value) {
            addCriterion("runningTime >", value, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("runningTime >=", value, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeLessThan(Integer value) {
            addCriterion("runningTime <", value, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeLessThanOrEqualTo(Integer value) {
            addCriterion("runningTime <=", value, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeIn(List<Integer> values) {
            addCriterion("runningTime in", values, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeNotIn(List<Integer> values) {
            addCriterion("runningTime not in", values, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeBetween(Integer value1, Integer value2) {
            addCriterion("runningTime between", value1, value2, "runningtime");
            return (Criteria) this;
        }

        public Criteria andRunningtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("runningTime not between", value1, value2, "runningtime");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountIsNull() {
            addCriterion("totalServiceCount is null");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountIsNotNull() {
            addCriterion("totalServiceCount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountEqualTo(Integer value) {
            addCriterion("totalServiceCount =", value, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountNotEqualTo(Integer value) {
            addCriterion("totalServiceCount <>", value, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountGreaterThan(Integer value) {
            addCriterion("totalServiceCount >", value, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalServiceCount >=", value, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountLessThan(Integer value) {
            addCriterion("totalServiceCount <", value, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountLessThanOrEqualTo(Integer value) {
            addCriterion("totalServiceCount <=", value, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountIn(List<Integer> values) {
            addCriterion("totalServiceCount in", values, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountNotIn(List<Integer> values) {
            addCriterion("totalServiceCount not in", values, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountBetween(Integer value1, Integer value2) {
            addCriterion("totalServiceCount between", value1, value2, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andTotalservicecountNotBetween(Integer value1, Integer value2) {
            addCriterion("totalServiceCount not between", value1, value2, "totalservicecount");
            return (Criteria) this;
        }

        public Criteria andBillcounterIsNull() {
            addCriterion("billCounter is null");
            return (Criteria) this;
        }

        public Criteria andBillcounterIsNotNull() {
            addCriterion("billCounter is not null");
            return (Criteria) this;
        }

        public Criteria andBillcounterEqualTo(Float value) {
            addCriterion("billCounter =", value, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterNotEqualTo(Float value) {
            addCriterion("billCounter <>", value, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterGreaterThan(Float value) {
            addCriterion("billCounter >", value, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterGreaterThanOrEqualTo(Float value) {
            addCriterion("billCounter >=", value, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterLessThan(Float value) {
            addCriterion("billCounter <", value, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterLessThanOrEqualTo(Float value) {
            addCriterion("billCounter <=", value, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterIn(List<Float> values) {
            addCriterion("billCounter in", values, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterNotIn(List<Float> values) {
            addCriterion("billCounter not in", values, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterBetween(Float value1, Float value2) {
            addCriterion("billCounter between", value1, value2, "billcounter");
            return (Criteria) this;
        }

        public Criteria andBillcounterNotBetween(Float value1, Float value2) {
            addCriterion("billCounter not between", value1, value2, "billcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterIsNull() {
            addCriterion("ChangeTermCounter is null");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterIsNotNull() {
            addCriterion("ChangeTermCounter is not null");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterEqualTo(Integer value) {
            addCriterion("ChangeTermCounter =", value, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterNotEqualTo(Integer value) {
            addCriterion("ChangeTermCounter <>", value, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterGreaterThan(Integer value) {
            addCriterion("ChangeTermCounter >", value, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChangeTermCounter >=", value, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterLessThan(Integer value) {
            addCriterion("ChangeTermCounter <", value, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterLessThanOrEqualTo(Integer value) {
            addCriterion("ChangeTermCounter <=", value, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterIn(List<Integer> values) {
            addCriterion("ChangeTermCounter in", values, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterNotIn(List<Integer> values) {
            addCriterion("ChangeTermCounter not in", values, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterBetween(Integer value1, Integer value2) {
            addCriterion("ChangeTermCounter between", value1, value2, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangetermcounterNotBetween(Integer value1, Integer value2) {
            addCriterion("ChangeTermCounter not between", value1, value2, "changetermcounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterIsNull() {
            addCriterion("ChangeFunCounter is null");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterIsNotNull() {
            addCriterion("ChangeFunCounter is not null");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterEqualTo(Integer value) {
            addCriterion("ChangeFunCounter =", value, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterNotEqualTo(Integer value) {
            addCriterion("ChangeFunCounter <>", value, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterGreaterThan(Integer value) {
            addCriterion("ChangeFunCounter >", value, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChangeFunCounter >=", value, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterLessThan(Integer value) {
            addCriterion("ChangeFunCounter <", value, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterLessThanOrEqualTo(Integer value) {
            addCriterion("ChangeFunCounter <=", value, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterIn(List<Integer> values) {
            addCriterion("ChangeFunCounter in", values, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterNotIn(List<Integer> values) {
            addCriterion("ChangeFunCounter not in", values, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterBetween(Integer value1, Integer value2) {
            addCriterion("ChangeFunCounter between", value1, value2, "changefuncounter");
            return (Criteria) this;
        }

        public Criteria andChangefuncounterNotBetween(Integer value1, Integer value2) {
            addCriterion("ChangeFunCounter not between", value1, value2, "changefuncounter");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated do_not_delete_during_merge Sat May 25 19:20:51 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table distributedairconditioner..roomstatis
     *
     * @mbggenerated Sat May 25 19:20:51 CST 2019
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