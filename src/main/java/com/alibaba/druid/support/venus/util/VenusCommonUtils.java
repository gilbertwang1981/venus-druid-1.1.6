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
}
