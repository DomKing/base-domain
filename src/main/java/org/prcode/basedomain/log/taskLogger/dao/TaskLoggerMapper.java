package org.prcode.basedomain.log.taskLogger.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.prcode.basedomain.log.taskLogger.domain.TaskLogger;
import org.prcode.basedomain.log.taskLogger.domain.TaskLoggerExample;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskLoggerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    long countByExample(TaskLoggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    int insert(TaskLogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    int insertSelective(TaskLogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    List<TaskLogger> selectByExampleWithBLOBs(TaskLoggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    List<TaskLogger> selectByExample(TaskLoggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    TaskLogger selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskLogger record, @Param("example") TaskLoggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TaskLogger record, @Param("example") TaskLoggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskLogger record, @Param("example") TaskLoggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskLogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TaskLogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_logger
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TaskLogger record);
}