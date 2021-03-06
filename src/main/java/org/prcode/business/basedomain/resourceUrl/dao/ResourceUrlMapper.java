package org.prcode.business.basedomain.resourceUrl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.prcode.business.basedomain.resourceUrl.domain.ResourceUrl;
import org.prcode.business.basedomain.resourceUrl.domain.ResourceUrlExample;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceUrlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    long countByExample(ResourceUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    int insert(ResourceUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    int insertSelective(ResourceUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    List<ResourceUrl> selectByExample(ResourceUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    ResourceUrl selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ResourceUrl record, @Param("example") ResourceUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ResourceUrl record, @Param("example") ResourceUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ResourceUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource_url
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ResourceUrl record);
}