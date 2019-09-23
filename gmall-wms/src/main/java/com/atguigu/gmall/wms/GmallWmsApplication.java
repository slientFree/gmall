package com.atguigu.gmall.wms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@MapperScan("com.atguigu.gmall.wms.dao")
@RefreshScope
@EnableSwagger2
@SpringBootApplication
public class GmallWmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallWmsApplication.class, args);
	}

}
