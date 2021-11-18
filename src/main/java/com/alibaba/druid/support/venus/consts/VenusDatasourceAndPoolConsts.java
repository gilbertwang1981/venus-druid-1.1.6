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
package com.alibaba.druid.support.venus.consts;

public interface VenusDatasourceAndPoolConsts {
	public static final String DEFAULT_VENUS_DATASOURCE_POOL_CONFIG_TEST_URL = "http://test-mw-governance-service.int.chuxingyouhui.com/config/db";
	public static final String VENUS_DATASOURCE_POOL_CONFIG_URL_VAR_NAME = "VENUS_DATASOURCE_POOL_CONFIG_URL";
	
	public static final String DEFAULT_VENUS_DATASOURCE_POOL_ST_REPORT_TEST_URL = "http://test-mw-governance-service.int.chuxingyouhui.com/config/db/report";
	public static final String DEFAULT_VENUS_DATASOURCE_POOL_ST_REPORT_URL_VAR_NAME = "VENUS_DATASOURCE_POOL_ST_REPORT_URL";
	
	public static final Long DEFAULT_STAT_DATA_REPORT_INTERVAL = 15000L;
	
	public static final Long DEFAULT_SLOW_SQL_DURATION = 10L;
	
	public static final String DEFAULT_VENUS_DATASOURCE_POOL_SLOW_SQL_TEST_URL = "http://test-mw-governance-service.int.chuxingyouhui.com/config/db/addSlowSql";
	public static final String DEFAULT_VENUS_DATASOURCE_POOL_SLOW_SQL_URL_VAR_NAME = "VENUS_DATASOURCE_POOL_SLOW_SQL_URL";
}
