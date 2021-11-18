package com.alibaba.druid.support.venus.vo;

public class VenusPoolStatVO {
	private int activePeak;
	private long activePeakTime;
	private int poolingPeak;
	private long poolingPeakTime;
	private int errorCount;
	private int connectCount;
	private int closeCount;
	private int waitThreadCount;
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
	public int getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}
	public int getConnectCount() {
		return connectCount;
	}
	public void setConnectCount(int connectCount) {
		this.connectCount = connectCount;
	}
	public int getCloseCount() {
		return closeCount;
	}
	public void setCloseCount(int closeCount) {
		this.closeCount = closeCount;
	}
	public int getWaitThreadCount() {
		return waitThreadCount;
	}
	public void setWaitThreadCount(int waitThreadCount) {
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
