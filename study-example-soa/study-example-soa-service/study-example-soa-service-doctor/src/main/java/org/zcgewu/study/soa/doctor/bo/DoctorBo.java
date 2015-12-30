package org.zcgewu.study.soa.doctor.bo;

import java.util.Date;

public class DoctorBo {

	private Integer doctorUID;

	private Integer hospitalUID;

	private String doctorName;

	private String appCellPhone;

	private String nativePlace;

	private Date birthday;

	private String nationality;

	private String stationaryPhone;

	private String address;

	private String picturlURL;

	private Short age;

	private String sex;

	private String IDNumber;

	private Integer technicalPostUID;

	private Integer positionUID;

	private Integer occupationUID;

	private Integer departmentUID;

	private Integer occupationStatusUID;

	private String specialty;

	private String introduce;

	private Integer cashSetUID;

	private Integer cashTypeUID;

	private Byte status;

	private String imToken;

	private Integer medicalGroupUID;

	private Integer groupPositionUID;

	private String aesKey;

	public Integer getDoctorUID() {
		return doctorUID;
	}

	public void setDoctorUID(Integer doctorUID) {
		this.doctorUID = doctorUID;
	}

	public Integer getHospitalUID() {
		return hospitalUID;
	}

	public void setHospitalUID(Integer hospitalUID) {
		this.hospitalUID = hospitalUID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getAppCellPhone() {
		return appCellPhone;
	}

	public void setAppCellPhone(String appCellPhone) {
		this.appCellPhone = appCellPhone;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getStationaryPhone() {
		return stationaryPhone;
	}

	public void setStationaryPhone(String stationaryPhone) {
		this.stationaryPhone = stationaryPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPicturlURL() {
		return picturlURL;
	}

	public void setPicturlURL(String picturlURL) {
		this.picturlURL = picturlURL;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public Integer getTechnicalPostUID() {
		return technicalPostUID;
	}

	public void setTechnicalPostUID(Integer technicalPostUID) {
		this.technicalPostUID = technicalPostUID;
	}

	public Integer getPositionUID() {
		return positionUID;
	}

	public void setPositionUID(Integer positionUID) {
		this.positionUID = positionUID;
	}

	public Integer getOccupationUID() {
		return occupationUID;
	}

	public void setOccupationUID(Integer occupationUID) {
		this.occupationUID = occupationUID;
	}

	public Integer getDepartmentUID() {
		return departmentUID;
	}

	public void setDepartmentUID(Integer departmentUID) {
		this.departmentUID = departmentUID;
	}

	public Integer getOccupationStatusUID() {
		return occupationStatusUID;
	}

	public void setOccupationStatusUID(Integer occupationStatusUID) {
		this.occupationStatusUID = occupationStatusUID;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Integer getCashSetUID() {
		return cashSetUID;
	}

	public void setCashSetUID(Integer cashSetUID) {
		this.cashSetUID = cashSetUID;
	}

	public Integer getCashTypeUID() {
		return cashTypeUID;
	}

	public void setCashTypeUID(Integer cashTypeUID) {
		this.cashTypeUID = cashTypeUID;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getImToken() {
		return imToken;
	}

	public void setImToken(String imToken) {
		this.imToken = imToken;
	}

	public Integer getMedicalGroupUID() {
		return medicalGroupUID;
	}

	public void setMedicalGroupUID(Integer medicalGroupUID) {
		this.medicalGroupUID = medicalGroupUID;
	}

	public Integer getGroupPositionUID() {
		return groupPositionUID;
	}

	public void setGroupPositionUID(Integer groupPositionUID) {
		this.groupPositionUID = groupPositionUID;
	}

	public String getAesKey() {
		return aesKey;
	}

	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}

	@Override
	public String toString() {
		return "DoctorBo [doctorUID=" + doctorUID + ", hospitalUID="
				+ hospitalUID + ", doctorName=" + doctorName
				+ ", appCellPhone=" + appCellPhone + ", nativePlace="
				+ nativePlace + ", birthday=" + birthday + ", nationality="
				+ nationality + ", stationaryPhone=" + stationaryPhone
				+ ", address=" + address + ", picturlURL=" + picturlURL
				+ ", age=" + age + ", sex=" + sex + ", IDNumber=" + IDNumber
				+ ", technicalPostUID=" + technicalPostUID + ", positionUID="
				+ positionUID + ", occupationUID=" + occupationUID
				+ ", departmentUID=" + departmentUID + ", occupationStatusUID="
				+ occupationStatusUID + ", specialty=" + specialty
				+ ", introduce=" + introduce + ", cashSetUID=" + cashSetUID
				+ ", cashTypeUID=" + cashTypeUID + ", status=" + status
				+ ", imToken=" + imToken + ", medicalGroupUID="
				+ medicalGroupUID + ", groupPositionUID=" + groupPositionUID
				+ ", aesKey=" + aesKey + "]";
	}

}
