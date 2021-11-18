package com.alibaba.druid.support.venus.config;

public class VenusDatasourceAndPoolConfiguration {
	private String jdbcUrl;
	private String username;
	private String password;
	private Integer initialSize;
	private Integer minIdle;
	private Integer maxActive;
	private Long timeBetweenEvictionRunsMillis;
	private String validationQuery;
	private Boolean testWhileIdle;
	private Boolean testOnBorrow;
	private Boolean testOnReturn;
	private String connectionProperties;
	private Integer connectionErrorRetryAttempts;
	private Boolean keepalive;
	private Boolean poolPreparedStatements;
	private Integer maxPoolPreparedStatementPerConnectionSize;
	
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getInitialSize() {
		return initialSize;
	}
	public void setInitialSize(Integer initialSize) {
		this.initialSize = initialSize;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(Integer minIdle) {
		this.minIdle = minIdle;
	}
	public Integer getMaxActive() {
		return maxActive;
	}
	public void setMaxActive(Integer maxActive) {
		this.maxActive = maxActive;
	}
	public Long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}
	public void setTimeBetweenEvictionRunsMillis(Long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}
	public String getValidationQuery() {
		return validationQuery;
	}
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}
	public Boolean getTestWhileIdle() {
		return testWhileIdle;
	}
	public void setTestWhileIdle(Boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}
	public Boolean getTestOnBorrow() {
		return testOnBorrow;
	}
	public void setTestOnBorrow(Boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}
	public Boolean getTestOnReturn() {
		return testOnReturn;
	}
	public void setTestOnReturn(Boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}
	public String getConnectionProperties() {
		return connectionProperties;
	}
	public void setConnectionProperties(String connectionProperties) {
		this.connectionProperties = connectionProperties;
	}
	public Integer getConnectionErrorRetryAttempts() {
		return connectionErrorRetryAttempts;
	}
	public void setConnectionErrorRetryAttempts(Integer connectionErrorRetryAttempts) {
		this.connectionErrorRetryAttempts = connectionErrorRetryAttempts;
	}
	public Boolean getKeepalive() {
		return keepalive;
	}
	public void setKeepalive(Boolean keepalive) {
		this.keepalive = keepalive;
	}
	public Boolean getPoolPreparedStatements() {
		return poolPreparedStatements;
	}
	public void setPoolPreparedStatements(Boolean poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}
	public Integer getMaxPoolPreparedStatementPerConnectionSize() {
		return maxPoolPreparedStatementPerConnectionSize;
	}
	public void setMaxPoolPreparedStatementPerConnectionSize(Integer maxPoolPreparedStatementPerConnectionSize) {
		this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
	}
}
