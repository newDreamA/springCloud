/**
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 */
package com.txw;

import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * 示例：应用配置
 * Date: 2015-04-12
 *
 * @author zhangjun
 */
@SpringBootApplication
public class SiteConfig implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(SiteConfig.class);

    @Value("${spring.profiles.active}")
    private String profiles;

    @Override
    public void run(String... args) throws Exception {
        logger.info("The spring.profiles.active is: {}", profiles);
    }

}
