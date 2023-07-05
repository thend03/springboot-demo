package com.fc.springboot.autoconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义线程池配置
 *
 * @author since
 * @date 2022-09-28 13:59
 */
@ConfigurationProperties(prefix = "fc.thread.pool")
public class FcThreadPoolProperties {
    private Integer corePoolSize;

    private Integer maxPoolSize;

    private Integer keepAliveTime;

    private Integer queueSize;

    private Boolean enable = true;

    private String threadPoolName;

    public Integer getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(Integer corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public Integer getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public Integer getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(Integer keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    public Integer getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getThreadPoolName() {
        return threadPoolName;
    }

    public void setThreadPoolName(String threadPoolName) {
        this.threadPoolName = threadPoolName;
    }
}
