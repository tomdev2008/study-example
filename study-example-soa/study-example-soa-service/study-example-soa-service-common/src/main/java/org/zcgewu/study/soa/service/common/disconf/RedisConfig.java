package org.zcgewu.study.soa.service.common.disconf;

import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

@Service
@DisconfFile(filename = "redis.properties")
public class RedisConfig {

	private String host;
	private Integer port;
	private String password;
	private Integer database;

	@DisconfFileItem(name = "redis_host", associateField = "host")
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	@DisconfFileItem(name = "redis_port", associateField = "port")
	public Integer getPort() {
		return port;
	}
	
	public void setPort(Integer port) {
		this.port = port;
	}
	
	@DisconfFileItem(name = "redis_password", associateField = "password")
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@DisconfFileItem(name = "redis_database", associateField = "database")
	public Integer getDatabase() {
		return database;
	}

	public void setDatabase(Integer database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "RedisConfig [host=" + host + ", port=" + port + ", password=" + password + ", database=" + database
				+ "]";
	}

}
