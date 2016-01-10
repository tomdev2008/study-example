package org.zcgewu.study.soa.service.common.disconf;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.pool.DruidDataSource;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

/**
 * disconf配置的数据库连接池服务 </br>
 * bean id:   dataSource
 * 
 * @author 张超
 * @date 2015年12月31日-下午11:46:04
 *
 */
@Service("dataSource")
@DisconfUpdateService(classes = { MysqlConfig.class })
public class JdbcDataSourceBean
		implements InitializingBean, DisposableBean, IDisconfUpdate, FactoryBean<DruidDataSource> {

	private static final Log LOG = LogFactory.getLog(JdbcDataSourceBean.class);

	private DruidDataSource druidDataSource;

	@Autowired
	private MysqlConfig mysqlConfig;

	private synchronized void initPool() {
		druidDataSource = new DruidDataSource();

		// 基本属性 url、user、password
		druidDataSource.setUrl(mysqlConfig.getUrl());
		druidDataSource.setUsername(mysqlConfig.getUsername());
		druidDataSource.setPassword(mysqlConfig.getPassword());

		// 配置初始化大小、最小、最大
		druidDataSource.setInitialSize(1);
		druidDataSource.setMinIdle(1);

		// 配置获取连接等待超时的时间
		druidDataSource.setMaxActive(100);

		// 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
		druidDataSource.setMaxWait(60000);

		// 配置一个连接在池中最小生存的时间，单位是毫秒
		druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
		druidDataSource.setMinEvictableIdleTimeMillis(300000);
		druidDataSource.setValidationQuery("select 1");
		druidDataSource.setTestWhileIdle(true);
		druidDataSource.setTestOnBorrow(false);
		druidDataSource.setTestOnReturn(false);

		// 打开PSCache，并且指定每个连接上PSCache的大小
		druidDataSource.setPoolPreparedStatements(false);
		druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(200);

		// 配置监控统计拦截的filters，去掉后监控界面sql无法统计
		try {
			druidDataSource.setFilters("stat");
		} catch (SQLException e) {
			LOG.error(e.getMessage(), e);
		}

		LOG.info("druid pool init finish. \n" + druidDataSource.toString());
	}

	@Override
	public void destroy() throws Exception {
		if (druidDataSource != null) {
			druidDataSource.close();
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		initPool();
	}

	@Override
	public void reload() throws Exception {
		LOG.info("disconf reload init mysql pool");
		initPool();
	}

	@Override
	public synchronized DruidDataSource getObject() throws Exception {
		return druidDataSource;
	}

	@Override
	public Class<?> getObjectType() {
		return DruidDataSource.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
