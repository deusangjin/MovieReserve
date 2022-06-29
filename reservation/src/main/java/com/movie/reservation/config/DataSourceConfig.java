package com.movie.reservation.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configurtio
 * ������̼� ��� ȯ�� ������ ����
 * �� ������̼��� ���̰� Ŭ���� ���� �ϳ� �̻��� @Bean �޼ҵ带 �����ϸ� ������ �����̳ʰ� Bean ���Ǹ� �����ϰ� ��Ÿ�� �� �� Bean ���� ��û�� ó���� ���� �����Ѵ�.
 * @ConfigurationProperties
 * �ܺ� ���� ����(application.properties)�� ������ �� ���� ��� �� �ϳ��̴�.
 * 
 * ���
 * �� �ڵ�ó�� prefix = "spring.datasource" ��� �ϸ� spring.datasource�� ���ξ�� �پ� �ִ� application.properties ������ ������ �� �ִ�.
 * @author els78 /�¿�
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
