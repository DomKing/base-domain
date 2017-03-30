package org.prcode.basedomain.business.loginNo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.prcode.basedomain.business.loginNo.domain.LoginNo;
import org.prcode.basedomain.business.loginNo.domain.LoginNoExample;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginNoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    long countByExample(LoginNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    int insert(LoginNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    int insertSelective(LoginNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    List<LoginNo> selectByExample(LoginNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    LoginNo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LoginNo record, @Param("example") LoginNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LoginNo record, @Param("example") LoginNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LoginNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_no
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LoginNo record);
}