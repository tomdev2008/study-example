package org.zcgewu.study.soa.service.common.disconf;

import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

@Service
@DisconfFile(filename = "jdbc-mysql.properties")
public class MysqlConfig {

	private String url;
	private String username;
	private String password;

	@DisconfFileItem(name = "mysql_url", associateField = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@DisconfFileItem(name = "mysql_username", associateField = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@DisconfFileItem(name = "mysql_password", associateField = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MysqlConfig [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}
