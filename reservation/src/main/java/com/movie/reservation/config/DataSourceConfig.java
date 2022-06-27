package com.movie.reservation.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configurtio
 * 어노테이션 기반 환경 구성을 도움
 * 이 어노테이션을 붙이고 클래스 내에 하나 이상의 @Bean 메소드를 구현하면 스프링 컨테이너가 Bean 정의를 생성하고 런타임 시 그 Bean 들의 요청을 처리할 것을 선언한다.
 * @ConfigurationProperties
 * 외부 설정 파일(application.properties)을 참조할 때 쓰는 방법 중 하나이다.
 * 
 * 결과
 * 위 코드처럼 prefix = "spring.datasource" 라고 하면 spring.datasource가 접두어로 붙어 있는 application.properties 값들을 참조할 수 있다.
 * @author els78 /태영
 *
 */
@Configuration
public class DataSourceConfig {

	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
}
