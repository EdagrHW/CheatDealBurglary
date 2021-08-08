package com.cn.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(CheatDealConfiguration.class)
@ConfigurationProperties(prefix = "cheat.deal")
public class CheatDealConfiguration {
}
