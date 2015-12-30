package org.zcgewu.study.soa.doctor.po;

import java.io.Serializable;
import java.util.Date;

public class AppRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_role.app_role_uid
     *
     * @mbggenerated
     */
    private Integer appRoleUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_role.hospital_uid
     *
     * @mbggenerated
     */
    private Integer hospitalUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_role.app_role_name
     *
     * @mbggenerated
     */
    private String appRoleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_role.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_role.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_role.app_role_uid
     *
     * @return the value of tb_app_role.app_role_uid
     *
     * @mbggenerated
     */
    public Integer getAppRoleUid() {
        return appRoleUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_role.app_role_uid
     *
     * @param appRoleUid the value for tb_app_role.app_role_uid
     *
     * @mbggenerated
     */
    public void setAppRoleUid(Integer appRoleUid) {
        this.appRoleUid = appRoleUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_role.hospital_uid
     *
     * @return the value of tb_app_role.hospital_uid
     *
     * @mbggenerated
     */
    public Integer getHospitalUid() {
        return hospitalUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_role.hospital_uid
     *
     * @param hospitalUid the value for tb_app_role.hospital_uid
     *
     * @mbggenerated
     */
    public void setHospitalUid(Integer hospitalUid) {
        this.hospitalUid = hospitalUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_role.app_role_name
     *
     * @return the value of tb_app_role.app_role_name
     *
     * @mbggenerated
     */
    public String getAppRoleName() {
        return appRoleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_role.app_role_name
     *
     * @param appRoleName the value for tb_app_role.app_role_name
     *
     * @mbggenerated
     */
    public void setAppRoleName(String appRoleName) {
        this.appRoleName = appRoleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_role.create_time
     *
     * @return the value of tb_app_role.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_role.create_time
     *
     * @param createTime the value for tb_app_role.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_role.update_time
     *
     * @return the value of tb_app_role.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_role.update_time
     *
     * @param updateTime the value for tb_app_role.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AppRole other = (AppRole) that;
        return (this.getAppRoleUid() == null ? other.getAppRoleUid() == null : this.getAppRoleUid().equals(other.getAppRoleUid()))
            && (this.getHospitalUid() == null ? other.getHospitalUid() == null : this.getHospitalUid().equals(other.getHospitalUid()))
            && (this.getAppRoleName() == null ? other.getAppRoleName() == null : this.getAppRoleName().equals(other.getAppRoleName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppRoleUid() == null) ? 0 : getAppRoleUid().hashCode());
        result = prime * result + ((getHospitalUid() == null) ? 0 : getHospitalUid().hashCode());
        result = prime * result + ((getAppRoleName() == null) ? 0 : getAppRoleName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_role
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appRoleUid=").append(appRoleUid);
        sb.append(", hospitalUid=").append(hospitalUid);
        sb.append(", appRoleName=").append(appRoleName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}