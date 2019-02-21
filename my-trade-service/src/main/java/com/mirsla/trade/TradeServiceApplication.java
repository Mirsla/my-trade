package com.mirsla.trade;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableApolloConfig
@SpringBootApplication(scanBasePackages = {"com.mirsla.trade"})
@MapperScan("com.mk.trade.dao")
@EnableFeignClients(basePackages = {"com.mk.crm.api", "com.mk.product.api", "com.mk.promotion.api", "com.mk.shop.api",
	"com.mk.tower.api", "com.mk.uic.api", "com.mk.mdata.api", "com.mk.yum.api"})
@EnableDubboConfiguration
@EnableHystrix
//@EnableConfigurationProperties({MkTradeProperties.class, RedisProperties.class, ExpressConfig.class, ConfigProperties.class})
//@ImportAutoConfiguration(value = {MoCacheAutoConfiguration.class})
//@EnableMQConfiguration
public class TradeServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(TradeServiceApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter());

		springApplication.run(args);
	}

}
