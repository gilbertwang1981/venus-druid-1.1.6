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
package com.alibaba.druid.support.venus.util;

import com.alibaba.druid.support.venus.consts.VenusDatasourceAndPoolConsts;

public class VenusCommonUtils {
	public static String getDatasourcAndPoolConfigUrl() {
		String url = System.getenv(VenusDatasourceAndPoolConsts.VENUS_DATASOURCE_POOL_CONFIG_URL_VAR_NAME);
		if (url == null) {
			return VenusDatasourceAndPoolConsts.DEFAULT_VENUS_DATASOURCE_POOL_CONFIG_TEST_URL;
		} else {
			return url;
		}
	}
	
	public static String getDatasourcAndPoolReportUrl() {
		String url = System.getenv(VenusDatasourceAndPoolConsts.DEFAULT_VENUS_DATASOURCE_POOL_ST_REPORT_URL_VAR_NAME);
		if (url == null) {
			return VenusDatasourceAndPoolConsts.DEFAULT_VENUS_DATASOURCE_POOL_ST_REPORT_TEST_URL;
		} else {
			return url;
		}
	}
}
