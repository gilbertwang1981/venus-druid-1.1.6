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
package com.alibaba.druid.pool;

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
	}
}
