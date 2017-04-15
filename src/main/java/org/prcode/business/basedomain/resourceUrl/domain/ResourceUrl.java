package org.prcode.business.basedomain.resourceUrl.domain;

import org.prcode.basedomain.base.BaseDomain;

public class ResourceUrl extends BaseDomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_url_desc
     *
     * @mbg.generated
     */
    private String urlDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_parent_id
     *
     * @mbg.generated
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_is_menu
     *
     * @mbg.generated
     */
    private Boolean isMenu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_level
     *
     * @mbg.generated
     */
    private Byte level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_system_code
     *
     * @mbg.generated
     */
    private String systemCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_sys_add_user
     *
     * @mbg.generated
     */
    private String sysAddUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_sys_upd_user
     *
     * @mbg.generated
     */
    private String sysUpdUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource_url.f_sys_del_user
     *
     * @mbg.generated
     */
    private String sysDelUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_id
     *
     * @return the value of t_resource_url.f_id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_id
     *
     * @param id the value for t_resource_url.f_id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_url
     *
     * @return the value of t_resource_url.f_url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_url
     *
     * @param url the value for t_resource_url.f_url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_url_desc
     *
     * @return the value of t_resource_url.f_url_desc
     *
     * @mbg.generated
     */
    public String getUrlDesc() {
        return urlDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_url_desc
     *
     * @param urlDesc the value for t_resource_url.f_url_desc
     *
     * @mbg.generated
     */
    public void setUrlDesc(String urlDesc) {
        this.urlDesc = urlDesc == null ? null : urlDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_parent_id
     *
     * @return the value of t_resource_url.f_parent_id
     *
     * @mbg.generated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_parent_id
     *
     * @param parentId the value for t_resource_url.f_parent_id
     *
     * @mbg.generated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_is_menu
     *
     * @return the value of t_resource_url.f_is_menu
     *
     * @mbg.generated
     */
    public Boolean getIsMenu() {
        return isMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_is_menu
     *
     * @param isMenu the value for t_resource_url.f_is_menu
     *
     * @mbg.generated
     */
    public void setIsMenu(Boolean isMenu) {
        this.isMenu = isMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_level
     *
     * @return the value of t_resource_url.f_level
     *
     * @mbg.generated
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_level
     *
     * @param level the value for t_resource_url.f_level
     *
     * @mbg.generated
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_system_code
     *
     * @return the value of t_resource_url.f_system_code
     *
     * @mbg.generated
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_system_code
     *
     * @param systemCode the value for t_resource_url.f_system_code
     *
     * @mbg.generated
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_sys_add_user
     *
     * @return the value of t_resource_url.f_sys_add_user
     *
     * @mbg.generated
     */
    public String getSysAddUser() {
        return sysAddUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_sys_add_user
     *
     * @param sysAddUser the value for t_resource_url.f_sys_add_user
     *
     * @mbg.generated
     */
    public void setSysAddUser(String sysAddUser) {
        this.sysAddUser = sysAddUser == null ? null : sysAddUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_sys_upd_user
     *
     * @return the value of t_resource_url.f_sys_upd_user
     *
     * @mbg.generated
     */
    public String getSysUpdUser() {
        return sysUpdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_sys_upd_user
     *
     * @param sysUpdUser the value for t_resource_url.f_sys_upd_user
     *
     * @mbg.generated
     */
    public void setSysUpdUser(String sysUpdUser) {
        this.sysUpdUser = sysUpdUser == null ? null : sysUpdUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource_url.f_sys_del_user
     *
     * @return the value of t_resource_url.f_sys_del_user
     *
     * @mbg.generated
     */
    public String getSysDelUser() {
        return sysDelUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource_url.f_sys_del_user
     *
     * @param sysDelUser the value for t_resource_url.f_sys_del_user
     *
     * @mbg.generated
     */
    public void setSysDelUser(String sysDelUser) {
        this.sysDelUser = sysDelUser == null ? null : sysDelUser.trim();
    }
}