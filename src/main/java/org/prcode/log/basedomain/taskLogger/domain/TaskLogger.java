package org.prcode.log.basedomain.taskLogger.domain;

import java.util.Date;
import org.prcode.basedomain.base.BaseDomain;

public class TaskLogger extends BaseDomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_logger.f_id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_logger.f_class_name
     *
     * @mbg.generated
     */
    private String className;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_logger.f_method_name
     *
     * @mbg.generated
     */
    private String methodName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_logger.f_is_undefined_exception
     *
     * @mbg.generated
     */
    private Byte isUndefinedException;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_logger.f_task_start_time
     *
     * @mbg.generated
     */
    private Date taskStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_logger.f_task_end_time
     *
     * @mbg.generated
     */
    private Date taskEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_logger.f_deal_time
     *
     * @mbg.generated
     */
    private Integer dealTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_logger.f_excep_stack_info
     *
     * @mbg.generated
     */
    private String excepStackInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_logger.f_id
     *
     * @return the value of t_task_logger.f_id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_logger.f_id
     *
     * @param id the value for t_task_logger.f_id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_logger.f_class_name
     *
     * @return the value of t_task_logger.f_class_name
     *
     * @mbg.generated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_logger.f_class_name
     *
     * @param className the value for t_task_logger.f_class_name
     *
     * @mbg.generated
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_logger.f_method_name
     *
     * @return the value of t_task_logger.f_method_name
     *
     * @mbg.generated
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_logger.f_method_name
     *
     * @param methodName the value for t_task_logger.f_method_name
     *
     * @mbg.generated
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_logger.f_is_undefined_exception
     *
     * @return the value of t_task_logger.f_is_undefined_exception
     *
     * @mbg.generated
     */
    public Byte getIsUndefinedException() {
        return isUndefinedException;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_logger.f_is_undefined_exception
     *
     * @param isUndefinedException the value for t_task_logger.f_is_undefined_exception
     *
     * @mbg.generated
     */
    public void setIsUndefinedException(Byte isUndefinedException) {
        this.isUndefinedException = isUndefinedException;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_logger.f_task_start_time
     *
     * @return the value of t_task_logger.f_task_start_time
     *
     * @mbg.generated
     */
    public Date getTaskStartTime() {
        return taskStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_logger.f_task_start_time
     *
     * @param taskStartTime the value for t_task_logger.f_task_start_time
     *
     * @mbg.generated
     */
    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_logger.f_task_end_time
     *
     * @return the value of t_task_logger.f_task_end_time
     *
     * @mbg.generated
     */
    public Date getTaskEndTime() {
        return taskEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_logger.f_task_end_time
     *
     * @param taskEndTime the value for t_task_logger.f_task_end_time
     *
     * @mbg.generated
     */
    public void setTaskEndTime(Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_logger.f_deal_time
     *
     * @return the value of t_task_logger.f_deal_time
     *
     * @mbg.generated
     */
    public Integer getDealTime() {
        return dealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_logger.f_deal_time
     *
     * @param dealTime the value for t_task_logger.f_deal_time
     *
     * @mbg.generated
     */
    public void setDealTime(Integer dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_logger.f_excep_stack_info
     *
     * @return the value of t_task_logger.f_excep_stack_info
     *
     * @mbg.generated
     */
    public String getExcepStackInfo() {
        return excepStackInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_logger.f_excep_stack_info
     *
     * @param excepStackInfo the value for t_task_logger.f_excep_stack_info
     *
     * @mbg.generated
     */
    public void setExcepStackInfo(String excepStackInfo) {
        this.excepStackInfo = excepStackInfo == null ? null : excepStackInfo.trim();
    }
}