package com.alibaba.druid.support.venus.pool;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.venus.config.VenusDatasourceAndPoolConfiguration;

@SuppressWarnings("serial")
public class VenusDruidDataSource extends DruidDataSource {

	public VenusDruidDataSource(String instanceKey) {
		this(true);
		
		copyConfigFromVenus(this.getVenusDatasourceAndPoolConfigurationFromVenus(instanceKey));
	}
	
	private VenusDruidDataSource(boolean lockFair) {
		super(lockFair);
	}
	
	private VenusDatasourceAndPoolConfiguration getVenusDatasourceAndPoolConfigurationFromVenus(String instanceKey) {
		
		return null;
	}
	
	private void copyConfigFromVenus(VenusDatasourceAndPoolConfiguration config) {
		this.setUrl(config.getJdbcUrl());
		this.setUsername(config.getUsername());
		this.setPassword(config.getPassword());
		this.setInitialSize(config.getInitialSize());
		this.setMinIdle(config.getMinIdle());
		this.setMaxActive(config.getMaxActive());
		this.setMaxWait(config.getMaxWait());
		this.setTimeBetweenEvictionRunsMillis(config.getTimeBetweenEvictionRunsMillis());
		this.setValidationQuery(config.getValidationQuery());
		this.setTestWhileIdle(config.getTestWhileIdle());
		this.setTestOnBorrow(config.getTestOnBorrow());
		this.setTestOnReturn(config.getTestOnReturn());
		this.setPoolPreparedStatements(config.getPoolPreparedStatements());
		this.setConnectionProperties(config.getConnectionProperties());
		this.setConnectionErrorRetryAttempts(config.getConnectionErrorRetryAttempts());
		this.setKeepAlive(config.getKeepalive());
		this.setMaxPoolPreparedStatementPerConnectionSize(config.getMaxPoolPreparedStatementPerConnectionSize());
	}
}
