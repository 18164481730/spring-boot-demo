package com.tangzhihe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.tangzhihe.dao")
public class SpringBootLoginDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginDemoApplication.class, args);
	}
}
