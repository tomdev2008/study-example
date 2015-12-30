package org.zcgewu.study.soa.doctor.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zcgewu.study.soa.doctor.po.AppRole;
import org.zcgewu.study.soa.doctor.po.AppRoleExample;

public interface AppRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int countByExample(AppRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int deleteByExample(AppRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer appRoleUid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int insert(AppRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int insertSelective(AppRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    List<AppRole> selectByExample(AppRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    AppRole selectByPrimaryKey(Integer appRoleUid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppRole record, @Param("example") AppRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppRole record, @Param("example") AppRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppRole record);
}