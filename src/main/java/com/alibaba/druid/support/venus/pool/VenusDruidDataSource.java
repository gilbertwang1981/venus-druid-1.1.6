package com.alibaba.druid.support.venus.pool;

import com.alibaba.druid.pool.DruidDataSource;

@SuppressWarnings("serial")
public class VenusDruidDataSource extends DruidDataSource {

	public VenusDruidDataSource(boolean lockFair) {
		super(lockFair);
		
		configFromRemote();
	}
	
	public void configFromRemote() {
		this.setUrl("jdbc:mysql://rm-wz9z9bk07qr61w1f7.mysql.rds.aliyuncs.com:3306/abtest?useUnicode=true&characterEncoding=utf-8");
		this.setUsername("root");
		this.setPassword("ne2FRwzOQjONzEOmx0oZ4uh9");
		this.setInitialSize(5);
		this.setMinIdle(5);
		this.setMaxActive(10);
		this.setMaxWait(30000);
		this.setTimeBetweenEvictionRunsMillis(30000);
		this.setValidationQuery("select 1 from dual");
		this.setTestWhileIdle(true);
		this.setTestOnBorrow(false);
		this.setTestOnReturn(false);
		this.setPoolPreparedStatements(true);
		this.setConnectionProperties("druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500");
		this.setConnectionErrorRetryAttempts(3);
		this.setKeepAlive(true);
		this.setMaxPoolPreparedStatementPerConnectionSize(5);
	}
}
