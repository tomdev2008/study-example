package org.zcgewu.study.soa.service.common.disconf;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

/**
 * disconf配置Jedis连接池服务<br/>
 * bean id:  jedisConnection
 * 
 * @author 张超
 * @date 2015年12月31日-下午11:45:33
 *
 */
@Service("jedisConnection")
@DisconfUpdateService(classes = { RedisConfig.class })
public class JedisConnectionBean implements InitializingBean, DisposableBean, IDisconfUpdate, FactoryBean<JedisConnectionFactory> {

	private static final Log LOG = LogFactory.getLog(JedisConnectionBean.class);
	private JedisConnectionFactory jedisConnection;

	@Autowired
	private RedisConfig redisConfig;

	private synchronized void initJredisConnect() {
		jedisConnection = new JedisConnectionFactory();
		jedisConnection.setHostName(redisConfig.getHost());
		jedisConnection.setPort(redisConfig.getPort());
		jedisConnection.setPassword(redisConfig.getPassword());
		jedisConnection.setDatabase(redisConfig.getDatabase());
		LOG.info("init redis pool finish. \n" + jedisConnection.toString());
	}
	
	@Override
	public void afterPropertiesSet() {
		initJredisConnect();
	}
	
	@Override
	public void destroy() throws Exception {
		if(jedisConnection != null){
			jedisConnection.destroy();
		}
	}

	@Override
	public synchronized JedisConnectionFactory getObject() throws Exception {
		return jedisConnection;
	}

	@Override
	public Class<?> getObjectType() {
		return JedisConnectionFactory.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	@Override
	public void reload() throws Exception {
		LOG.info("disconf reload redis pool.");
		initJredisConnect();
	}

}
