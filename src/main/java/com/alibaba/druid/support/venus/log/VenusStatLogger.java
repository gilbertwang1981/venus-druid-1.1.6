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
package com.alibaba.druid.support.venus.log;

import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSourceStatLogger;
import com.alibaba.druid.pool.DruidDataSourceStatValue;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.alibaba.druid.support.venus.exception.VenusDatasourceAndPoolReportException;
import com.alibaba.druid.support.venus.util.VenusAddressConvertor;
import com.alibaba.druid.support.venus.util.VenusCommonUtils;
import com.alibaba.druid.support.venus.util.VenusHttpUtils;
import com.alibaba.druid.support.venus.util.VenusProcessUtils;
import com.alibaba.druid.support.venus.vo.VenusPoolStatVO;
import com.google.gson.Gson;

public class VenusStatLogger implements DruidDataSourceStatLogger {
	private final static Log LOG = LogFactory.getLog(VenusStatLogger.class);
	
	private Gson gson = new Gson();
	
	private String instanceKey;
	
	public VenusStatLogger(String instanceKey) {
		this.instanceKey = instanceKey;
	}

	@Override
	public void log(DruidDataSourceStatValue statValue) {
		VenusPoolStatVO report = new VenusPoolStatVO();
		report.setActivePeak(statValue.getActivePeak());
		if (statValue.getActivePeakTime() != null) {
			report.setActivePeakTime(statValue.getActivePeakTime().getTime());
		}
		report.setCloseCount(statValue.getCloseCount());
		report.setConnectCount(statValue.getConnectCount());
		report.setErrorCount(statValue.getErrorCount());
		report.setInstanceKey(instanceKey);
		report.setPoolingPeak(statValue.getPoolingPeak());
		if (statValue.getPoolingPeakTime() != null) {
			report.setPoolingPeakTime(statValue.getPoolingPeakTime().getTime());
		}
		report.setWaitThreadCount(statValue.getWaitThreadCount());
		report.setIp(VenusAddressConvertor.getLocalIPList().get(0));
		report.setPid(VenusProcessUtils.getPid());
		
		String reportBody = gson.toJson(report);
		
		LOG.info("心跳上报:" + reportBody);
		
		if (null == VenusHttpUtils.sendHttpPost(VenusCommonUtils.getDatasourcAndPoolReportUrl() , reportBody)) {
			throw new VenusDatasourceAndPoolReportException();
		}
	}

	@Override
	public void configFromProperties(Properties properties) {
	}

	@Override
	public void setLogger(Log logger) {
	}

	@Override
	public void setLoggerName(String loggerName) {
	}

}
