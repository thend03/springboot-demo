package com.fc.springboot.autoconfig.config;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 自定义线程池自动装配配置
 *
 * @author since
 * @date 2022-09-28 14:04
 */
@Configuration
@EnableConfigurationProperties(FcThreadPoolProperties.class)
public class FcThreadPoolAutoConfiguration {

    @Bean
    @ConditionalOnProperty(name = {"fc.thread.pool.enable"}, matchIfMissing = true, havingValue = "true")
    public ThreadPoolExecutor threadPoolExecutor(FcThreadPoolProperties config) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat(config.getThreadPoolName() + "-%d").build();
        return new ThreadPoolExecutor(config.getCorePoolSize(), config.getMaxPoolSize(), config.getKeepAliveTime(), TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(config.getQueueSize()), threadFactory);

    }
}
