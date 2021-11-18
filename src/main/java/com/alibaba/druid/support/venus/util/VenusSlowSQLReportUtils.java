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

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.alibaba.druid.support.venus.vo.VenusSlowSqlStatVO;
import com.google.gson.Gson;

public class VenusSlowSQLReportUtils {
	private final static Log LOG = LogFactory.getLog(VenusSlowSQLReportUtils.class);
	
	private static Gson gson = new Gson();
			 
	public static void reportSlowSql(String sql , long duration) {
		VenusSlowSqlStatVO report = new VenusSlowSqlStatVO();
		report.setDuration(duration);
		report.setIp(VenusAddressConvertor.getLocalIPList().get(0));
		report.setPid(VenusProcessUtils.getPid());
		report.setSql(sql);
		
		String request = gson.toJson(report);
		
		LOG.info("慢查询:" + request);
		
		VenusHttpUtils.sendHttpPost(VenusCommonUtils.getSlowSqlReportUrl() , request);
	}
}
