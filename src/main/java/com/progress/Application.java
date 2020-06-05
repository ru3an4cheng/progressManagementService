package com.progress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;




/**
 * 微服务应用服务启动类 
 * 1、（@EnableDiscoveryClient）注解为链接微服务注册中心用，如实际环境中使用注册中心，请取消注释部分，
 *     与配置文件中相关注册中心配置信息结合使用。
 * @author zhangzz
 *
 */
@ServletComponentScan
@SpringBootApplication(scanBasePackages={"com.progress","com.sgcc.uap.rest.annotation","com.sgcc.uap.mdd.runtime"})
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
