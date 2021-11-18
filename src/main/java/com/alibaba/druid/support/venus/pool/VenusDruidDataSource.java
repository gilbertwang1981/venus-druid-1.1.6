/*
 * Copyright 1999-2017 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.support.venus.pool;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.alibaba.druid.support.venus.config.VenusDatasourceAndPoolConfiguration;
import com.alibaba.druid.support.venus.exception.VenusDatasourceAndPoolConfigNotFoundException;
import com.alibaba.druid.support.venus.log.VenusStatLogger;
import com.alibaba.druid.support.venus.util.VenusCommonUtils;
import com.alibaba.druid.support.venus.util.VenusHttpUtils;
import com.google.gson.Gson;

@SuppressWarnings("serial")
public class VenusDruidDataSource extends DruidDataSource {
	
	private final static Log LOG = LogFactory.getLog(VenusDruidDataSource.class);
	
	private Gson gson = new Gson();

	public VenusDruidDataSource(String instanceKey) {
		this(true);
		
		copyConfigFromVenus(this.getVenusDatasourceAndPoolConfigurationFromVenus(instanceKey));
	}
	
	private VenusDruidDataSource(boolean lockFair) {
		super(lockFair);
	}
	
	private VenusDatasourceAndPoolConfiguration getVenusDatasourceAndPoolConfigurationFromVenus(String instanceKey) {
		String response = VenusHttpUtils.sendHttpGet(VenusCommonUtils.getDatasourcAndPoolConfigUrl() , "instanceKey=" + instanceKey);
		if (response == null) {
			throw new VenusDatasourceAndPoolConfigNotFoundException(instanceKey);
		}
		
		LOG.info("从venus获取配置信息:" + response);
		
		VenusDatasourceAndPoolConfiguration configuration = gson.fromJson(response , VenusDatasourceAndPoolConfiguration.class);
		
		return configuration;
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
		this.setStatLogger(new VenusStatLogger());
		this.setTimeBetweenLogStatsMillis(5000L);
	}
}
