package org.dromara.hmily.demo.motan.account.configuration;

import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The MotanClientConfig.
 *
 * @author bbaiggey
 */
@Configuration
public class MotanClientConfig
{

    /**
     * 客户端配置
     * @return
     */
    @Bean(name = "hmilyClientBasicConfig")
    @ConfigurationProperties(prefix = "hmily.motan.client")
    public BasicRefererConfigBean baseRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();
        return config;
    }
}
