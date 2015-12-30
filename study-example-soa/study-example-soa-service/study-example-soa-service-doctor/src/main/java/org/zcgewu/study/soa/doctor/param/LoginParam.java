package org.zcgewu.study.soa.doctor.param;

public class LoginParam {

	private String cellPhone;
	private String password;

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginParam [cellPhone=" + cellPhone + ", password=" + password
				+ "]";
	}

}
