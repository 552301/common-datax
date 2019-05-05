package com.isacc.datax;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;

/**
 * <p>
 * DataX启动类
 * </p>
 *
 * @author isacc 2019/04/28 17:19
 */
@SpringBootApplication(exclude = {FreeMarkerAutoConfiguration.class})
@MapperScan("com.isacc.datax.infra.mapper")
public class DataxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataxApplication.class, args);
	}

}
