package org.prcode.log.basedomain.commLogger.domain;

import java.util.Date;
import org.prcode.basedomain.base.BaseDomain;

public class CommLogger extends BaseDomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_req_start_time
     *
     * @mbg.generated
     */
    private Date reqStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_user_acc_no
     *
     * @mbg.generated
     */
    private String userAccNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_user_acc_type
     *
     * @mbg.generated
     */
    private Integer userAccType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_action_url_tail
     *
     * @mbg.generated
     */
    private String actionUrlTail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_action_url_all
     *
     * @mbg.generated
     */
    private String actionUrlAll;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_action_res_code
     *
     * @mbg.generated
     */
    private String actionResCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_is_undefined_exception
     *
     * @mbg.generated
     */
    private Boolean isUndefinedException;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_device_id
     *
     * @mbg.generated
     */
    private String deviceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_os
     *
     * @mbg.generated
     */
    private String os;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_os_version
     *
     * @mbg.generated
     */
    private String osVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_req_deal_time
     *
     * @mbg.generated
     */
    private Integer reqDealTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_req_end_time
     *
     * @mbg.generated
     */
    private Date reqEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_sys0_add_time
     *
     * @mbg.generated
     */
    private Date sys0AddTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_sys0_upd_time
     *
     * @mbg.generated
     */
    private Date sys0UpdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_sys0_del_time
     *
     * @mbg.generated
     */
    private Date sys0DelTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_sys0_add_user
     *
     * @mbg.generated
     */
    private Long sys0AddUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_sys0_upd_user
     *
     * @mbg.generated
     */
    private Long sys0UpdUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_sys0_del_user
     *
     * @mbg.generated
     */
    private Long sys0DelUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_sys0_del_state
     *
     * @mbg.generated
     */
    private Byte sys0DelState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_request_params
     *
     * @mbg.generated
     */
    private String requestParams;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_excep_stack_info
     *
     * @mbg.generated
     */
    private String excepStackInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comm_logger.f_response_data
     *
     * @mbg.generated
     */
    private String responseData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_id
     *
     * @return the value of t_comm_logger.f_id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_id
     *
     * @param id the value for t_comm_logger.f_id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_req_start_time
     *
     * @return the value of t_comm_logger.f_req_start_time
     *
     * @mbg.generated
     */
    public Date getReqStartTime() {
        return reqStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_req_start_time
     *
     * @param reqStartTime the value for t_comm_logger.f_req_start_time
     *
     * @mbg.generated
     */
    public void setReqStartTime(Date reqStartTime) {
        this.reqStartTime = reqStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_user_id
     *
     * @return the value of t_comm_logger.f_user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_user_id
     *
     * @param userId the value for t_comm_logger.f_user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_user_acc_no
     *
     * @return the value of t_comm_logger.f_user_acc_no
     *
     * @mbg.generated
     */
    public String getUserAccNo() {
        return userAccNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_user_acc_no
     *
     * @param userAccNo the value for t_comm_logger.f_user_acc_no
     *
     * @mbg.generated
     */
    public void setUserAccNo(String userAccNo) {
        this.userAccNo = userAccNo == null ? null : userAccNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_user_acc_type
     *
     * @return the value of t_comm_logger.f_user_acc_type
     *
     * @mbg.generated
     */
    public Integer getUserAccType() {
        return userAccType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_user_acc_type
     *
     * @param userAccType the value for t_comm_logger.f_user_acc_type
     *
     * @mbg.generated
     */
    public void setUserAccType(Integer userAccType) {
        this.userAccType = userAccType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_action_url_tail
     *
     * @return the value of t_comm_logger.f_action_url_tail
     *
     * @mbg.generated
     */
    public String getActionUrlTail() {
        return actionUrlTail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_action_url_tail
     *
     * @param actionUrlTail the value for t_comm_logger.f_action_url_tail
     *
     * @mbg.generated
     */
    public void setActionUrlTail(String actionUrlTail) {
        this.actionUrlTail = actionUrlTail == null ? null : actionUrlTail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_action_url_all
     *
     * @return the value of t_comm_logger.f_action_url_all
     *
     * @mbg.generated
     */
    public String getActionUrlAll() {
        return actionUrlAll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_action_url_all
     *
     * @param actionUrlAll the value for t_comm_logger.f_action_url_all
     *
     * @mbg.generated
     */
    public void setActionUrlAll(String actionUrlAll) {
        this.actionUrlAll = actionUrlAll == null ? null : actionUrlAll.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_action_res_code
     *
     * @return the value of t_comm_logger.f_action_res_code
     *
     * @mbg.generated
     */
    public String getActionResCode() {
        return actionResCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_action_res_code
     *
     * @param actionResCode the value for t_comm_logger.f_action_res_code
     *
     * @mbg.generated
     */
    public void setActionResCode(String actionResCode) {
        this.actionResCode = actionResCode == null ? null : actionResCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_is_undefined_exception
     *
     * @return the value of t_comm_logger.f_is_undefined_exception
     *
     * @mbg.generated
     */
    public Boolean getIsUndefinedException() {
        return isUndefinedException;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_is_undefined_exception
     *
     * @param isUndefinedException the value for t_comm_logger.f_is_undefined_exception
     *
     * @mbg.generated
     */
    public void setIsUndefinedException(Boolean isUndefinedException) {
        this.isUndefinedException = isUndefinedException;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_ip
     *
     * @return the value of t_comm_logger.f_ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_ip
     *
     * @param ip the value for t_comm_logger.f_ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_device_id
     *
     * @return the value of t_comm_logger.f_device_id
     *
     * @mbg.generated
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_device_id
     *
     * @param deviceId the value for t_comm_logger.f_device_id
     *
     * @mbg.generated
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_os
     *
     * @return the value of t_comm_logger.f_os
     *
     * @mbg.generated
     */
    public String getOs() {
        return os;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_os
     *
     * @param os the value for t_comm_logger.f_os
     *
     * @mbg.generated
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_os_version
     *
     * @return the value of t_comm_logger.f_os_version
     *
     * @mbg.generated
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_os_version
     *
     * @param osVersion the value for t_comm_logger.f_os_version
     *
     * @mbg.generated
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_req_deal_time
     *
     * @return the value of t_comm_logger.f_req_deal_time
     *
     * @mbg.generated
     */
    public Integer getReqDealTime() {
        return reqDealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_req_deal_time
     *
     * @param reqDealTime the value for t_comm_logger.f_req_deal_time
     *
     * @mbg.generated
     */
    public void setReqDealTime(Integer reqDealTime) {
        this.reqDealTime = reqDealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_req_end_time
     *
     * @return the value of t_comm_logger.f_req_end_time
     *
     * @mbg.generated
     */
    public Date getReqEndTime() {
        return reqEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_req_end_time
     *
     * @param reqEndTime the value for t_comm_logger.f_req_end_time
     *
     * @mbg.generated
     */
    public void setReqEndTime(Date reqEndTime) {
        this.reqEndTime = reqEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_sys0_add_time
     *
     * @return the value of t_comm_logger.f_sys0_add_time
     *
     * @mbg.generated
     */
    public Date getSys0AddTime() {
        return sys0AddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_sys0_add_time
     *
     * @param sys0AddTime the value for t_comm_logger.f_sys0_add_time
     *
     * @mbg.generated
     */
    public void setSys0AddTime(Date sys0AddTime) {
        this.sys0AddTime = sys0AddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_sys0_upd_time
     *
     * @return the value of t_comm_logger.f_sys0_upd_time
     *
     * @mbg.generated
     */
    public Date getSys0UpdTime() {
        return sys0UpdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_sys0_upd_time
     *
     * @param sys0UpdTime the value for t_comm_logger.f_sys0_upd_time
     *
     * @mbg.generated
     */
    public void setSys0UpdTime(Date sys0UpdTime) {
        this.sys0UpdTime = sys0UpdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_sys0_del_time
     *
     * @return the value of t_comm_logger.f_sys0_del_time
     *
     * @mbg.generated
     */
    public Date getSys0DelTime() {
        return sys0DelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_sys0_del_time
     *
     * @param sys0DelTime the value for t_comm_logger.f_sys0_del_time
     *
     * @mbg.generated
     */
    public void setSys0DelTime(Date sys0DelTime) {
        this.sys0DelTime = sys0DelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_sys0_add_user
     *
     * @return the value of t_comm_logger.f_sys0_add_user
     *
     * @mbg.generated
     */
    public Long getSys0AddUser() {
        return sys0AddUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_sys0_add_user
     *
     * @param sys0AddUser the value for t_comm_logger.f_sys0_add_user
     *
     * @mbg.generated
     */
    public void setSys0AddUser(Long sys0AddUser) {
        this.sys0AddUser = sys0AddUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_sys0_upd_user
     *
     * @return the value of t_comm_logger.f_sys0_upd_user
     *
     * @mbg.generated
     */
    public Long getSys0UpdUser() {
        return sys0UpdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_sys0_upd_user
     *
     * @param sys0UpdUser the value for t_comm_logger.f_sys0_upd_user
     *
     * @mbg.generated
     */
    public void setSys0UpdUser(Long sys0UpdUser) {
        this.sys0UpdUser = sys0UpdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_sys0_del_user
     *
     * @return the value of t_comm_logger.f_sys0_del_user
     *
     * @mbg.generated
     */
    public Long getSys0DelUser() {
        return sys0DelUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_sys0_del_user
     *
     * @param sys0DelUser the value for t_comm_logger.f_sys0_del_user
     *
     * @mbg.generated
     */
    public void setSys0DelUser(Long sys0DelUser) {
        this.sys0DelUser = sys0DelUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_sys0_del_state
     *
     * @return the value of t_comm_logger.f_sys0_del_state
     *
     * @mbg.generated
     */
    public Byte getSys0DelState() {
        return sys0DelState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_sys0_del_state
     *
     * @param sys0DelState the value for t_comm_logger.f_sys0_del_state
     *
     * @mbg.generated
     */
    public void setSys0DelState(Byte sys0DelState) {
        this.sys0DelState = sys0DelState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_request_params
     *
     * @return the value of t_comm_logger.f_request_params
     *
     * @mbg.generated
     */
    public String getRequestParams() {
        return requestParams;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_request_params
     *
     * @param requestParams the value for t_comm_logger.f_request_params
     *
     * @mbg.generated
     */
    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams == null ? null : requestParams.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_excep_stack_info
     *
     * @return the value of t_comm_logger.f_excep_stack_info
     *
     * @mbg.generated
     */
    public String getExcepStackInfo() {
        return excepStackInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_excep_stack_info
     *
     * @param excepStackInfo the value for t_comm_logger.f_excep_stack_info
     *
     * @mbg.generated
     */
    public void setExcepStackInfo(String excepStackInfo) {
        this.excepStackInfo = excepStackInfo == null ? null : excepStackInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comm_logger.f_response_data
     *
     * @return the value of t_comm_logger.f_response_data
     *
     * @mbg.generated
     */
    public String getResponseData() {
        return responseData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comm_logger.f_response_data
     *
     * @param responseData the value for t_comm_logger.f_response_data
     *
     * @mbg.generated
     */
    public void setResponseData(String responseData) {
        this.responseData = responseData == null ? null : responseData.trim();
    }
}