package app.entity;

public class bill {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.billId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private Integer billid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.startTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private String starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.stopTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private String stoptime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.roomId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private Integer roomid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.userId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.totalFee
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private Float totalfee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.runningTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private Integer runningtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.totalServiceCount
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private Integer totalservicecount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.ChangeTermCounter
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private Integer changetermcounter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distributedairconditioner..bill.ChangeFunCounter
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    private Integer changefuncounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.billId
     *
     * @return the value of distributedairconditioner..bill.billId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public Integer getBillid() {
        return billid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.billId
     *
     * @param billid the value for distributedairconditioner..bill.billId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.startTime
     *
     * @return the value of distributedairconditioner..bill.startTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.startTime
     *
     * @param starttime the value for distributedairconditioner..bill.startTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.stopTime
     *
     * @return the value of distributedairconditioner..bill.stopTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public String getStoptime() {
        return stoptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.stopTime
     *
     * @param stoptime the value for distributedairconditioner..bill.stopTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setStoptime(String stoptime) {
        this.stoptime = stoptime == null ? null : stoptime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.roomId
     *
     * @return the value of distributedairconditioner..bill.roomId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.roomId
     *
     * @param roomid the value for distributedairconditioner..bill.roomId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.userId
     *
     * @return the value of distributedairconditioner..bill.userId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.userId
     *
     * @param userid the value for distributedairconditioner..bill.userId
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.totalFee
     *
     * @return the value of distributedairconditioner..bill.totalFee
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public Float getTotalfee() {
        return totalfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.totalFee
     *
     * @param totalfee the value for distributedairconditioner..bill.totalFee
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setTotalfee(Float totalfee) {
        this.totalfee = totalfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.runningTime
     *
     * @return the value of distributedairconditioner..bill.runningTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public Integer getRunningtime() {
        return runningtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.runningTime
     *
     * @param runningtime the value for distributedairconditioner..bill.runningTime
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setRunningtime(Integer runningtime) {
        this.runningtime = runningtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.totalServiceCount
     *
     * @return the value of distributedairconditioner..bill.totalServiceCount
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public Integer getTotalservicecount() {
        return totalservicecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.totalServiceCount
     *
     * @param totalservicecount the value for distributedairconditioner..bill.totalServiceCount
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setTotalservicecount(Integer totalservicecount) {
        this.totalservicecount = totalservicecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.ChangeTermCounter
     *
     * @return the value of distributedairconditioner..bill.ChangeTermCounter
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public Integer getChangetermcounter() {
        return changetermcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.ChangeTermCounter
     *
     * @param changetermcounter the value for distributedairconditioner..bill.ChangeTermCounter
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setChangetermcounter(Integer changetermcounter) {
        this.changetermcounter = changetermcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distributedairconditioner..bill.ChangeFunCounter
     *
     * @return the value of distributedairconditioner..bill.ChangeFunCounter
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public Integer getChangefuncounter() {
        return changefuncounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distributedairconditioner..bill.ChangeFunCounter
     *
     * @param changefuncounter the value for distributedairconditioner..bill.ChangeFunCounter
     *
     * @mbggenerated Sat May 25 20:33:34 CST 2019
     */
    public void setChangefuncounter(Integer changefuncounter) {
        this.changefuncounter = changefuncounter;
    }
}