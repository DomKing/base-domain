package org.prcode.business.basedomain.loginLog.domain;

import org.prcode.basedomain.base.BaseDomain;

public class LoginLog extends BaseDomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.f_id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.f_user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.f_user_account
     *
     * @mbg.generated
     */
    private String userAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.f_sys_add_user
     *
     * @mbg.generated
     */
    private String sysAddUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.f_sys_upd_user
     *
     * @mbg.generated
     */
    private String sysUpdUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.f_sys_del_user
     *
     * @mbg.generated
     */
    private String sysDelUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.f_id
     *
     * @return the value of t_login_log.f_id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.f_id
     *
     * @param id the value for t_login_log.f_id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.f_user_id
     *
     * @return the value of t_login_log.f_user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.f_user_id
     *
     * @param userId the value for t_login_log.f_user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.f_user_account
     *
     * @return the value of t_login_log.f_user_account
     *
     * @mbg.generated
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.f_user_account
     *
     * @param userAccount the value for t_login_log.f_user_account
     *
     * @mbg.generated
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.f_sys_add_user
     *
     * @return the value of t_login_log.f_sys_add_user
     *
     * @mbg.generated
     */
    public String getSysAddUser() {
        return sysAddUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.f_sys_add_user
     *
     * @param sysAddUser the value for t_login_log.f_sys_add_user
     *
     * @mbg.generated
     */
    public void setSysAddUser(String sysAddUser) {
        this.sysAddUser = sysAddUser == null ? null : sysAddUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.f_sys_upd_user
     *
     * @return the value of t_login_log.f_sys_upd_user
     *
     * @mbg.generated
     */
    public String getSysUpdUser() {
        return sysUpdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.f_sys_upd_user
     *
     * @param sysUpdUser the value for t_login_log.f_sys_upd_user
     *
     * @mbg.generated
     */
    public void setSysUpdUser(String sysUpdUser) {
        this.sysUpdUser = sysUpdUser == null ? null : sysUpdUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.f_sys_del_user
     *
     * @return the value of t_login_log.f_sys_del_user
     *
     * @mbg.generated
     */
    public String getSysDelUser() {
        return sysDelUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.f_sys_del_user
     *
     * @param sysDelUser the value for t_login_log.f_sys_del_user
     *
     * @mbg.generated
     */
    public void setSysDelUser(String sysDelUser) {
        this.sysDelUser = sysDelUser == null ? null : sysDelUser.trim();
    }
}