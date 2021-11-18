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
package com.alibaba.druid.support.venus.vo;

public class VenusPoolStatVO {
	private int activePeak;
	private long activePeakTime;
	private int poolingPeak;
	private long poolingPeakTime;
	private long errorCount;
	private long connectCount;
	private long closeCount;
	private long waitThreadCount;
	private String instanceKey;
	private String ip;
	private int pid;
	
	public int getActivePeak() {
		return activePeak;
	}
	public void setActivePeak(int activePeak) {
		this.activePeak = activePeak;
	}
	public long getActivePeakTime() {
		return activePeakTime;
	}
	public void setActivePeakTime(long activePeakTime) {
		this.activePeakTime = activePeakTime;
	}
	public int getPoolingPeak() {
		return poolingPeak;
	}
	public void setPoolingPeak(int poolingPeak) {
		this.poolingPeak = poolingPeak;
	}
	public long getPoolingPeakTime() {
		return poolingPeakTime;
	}
	public void setPoolingPeakTime(long poolingPeakTime) {
		this.poolingPeakTime = poolingPeakTime;
	}
	public long getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(long errorCount) {
		this.errorCount = errorCount;
	}
	public long getConnectCount() {
		return connectCount;
	}
	public void setConnectCount(long connectCount) {
		this.connectCount = connectCount;
	}
	public long getCloseCount() {
		return closeCount;
	}
	public void setCloseCount(long closeCount) {
		this.closeCount = closeCount;
	}
	public long getWaitThreadCount() {
		return waitThreadCount;
	}
	public void setWaitThreadCount(long waitThreadCount) {
		this.waitThreadCount = waitThreadCount;
	}
	public String getInstanceKey() {
		return instanceKey;
	}
	public void setInstanceKey(String instanceKey) {
		this.instanceKey = instanceKey;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
}
