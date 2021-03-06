package org.prcode.business.basedomain.omsCommSysPara.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.prcode.business.basedomain.omsCommSysPara.domain.OmsCommSysPara;
import org.prcode.business.basedomain.omsCommSysPara.domain.OmsCommSysParaExample;
import org.springframework.stereotype.Repository;

@Repository
public interface OmsCommSysParaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    long countByExample(OmsCommSysParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    int insert(OmsCommSysPara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    int insertSelective(OmsCommSysPara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    List<OmsCommSysPara> selectByExample(OmsCommSysParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    OmsCommSysPara selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OmsCommSysPara record, @Param("example") OmsCommSysParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OmsCommSysPara record, @Param("example") OmsCommSysParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OmsCommSysPara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oms_comm_sys_para
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OmsCommSysPara record);
}