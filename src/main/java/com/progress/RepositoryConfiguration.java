package com.progress;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.progress")
@ConditionalOnClass(name={"com.sgcc.uap.adapter.JPAAdapterConfiguration"})
/**
 * 适配低版本jpa，对项目指定的repository包路径进行扫描注册；
 */
public class RepositoryConfiguration {

}
