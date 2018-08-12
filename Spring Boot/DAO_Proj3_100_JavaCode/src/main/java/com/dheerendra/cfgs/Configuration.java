package com.dheerendra.cfgs;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import oracle.net.aso.a;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages= {"com.dheerendra.dao","com.dheerendra.service"})
@PropertySource(value = {"classpath:com/dheerendra/commons/jdbc.properties"})
public class Configuration {
	
	@Autowired
	private Environment env;
	
	@Bean(name="dbcpDs")
	public DataSource createDatasource() {
		BasicDataSource basic=null;
		basic=new BasicDataSource();
		basic.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		basic.setUrl(env.getRequiredProperty("jdbc.url"));
		basic.setPassword(env.getRequiredProperty("jdbc.password"));
		basic.setUsername(env.getRequiredProperty("jdbc.username"));
		return basic;
	}
	
	@Bean(name="template")
	public JdbcTemplate createTemplate() {
		JdbcTemplate temp=null;
		temp=new JdbcTemplate(createDatasource());
		return temp;
	}

}
