package my.aws.api.dao;

import javax.inject.Singleton;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Value;

@Factory
public class JdbcTemplateFactory {

	@Value("${datasources.default.password}")
	String pwd;

	@Value("${datasources.default.url}")
	String url;

	@Value("${datasources.default.username}")
	String username;

	@Value("${datasources.default.driver-class-name}")
	String driverClassName;

//	@Value("${aws.region}")
//	String regionName;

	@Value("${datasources.default.maxpoolsize}")
	Integer maxPoolSize;

	@Value("${datasources.default.minidle}")
	Integer minIdle;

	@Value("${datasources.default.idletimeout}")
	Long idleTimeout;

	@Bean
	@Singleton
	JdbcTemplate jdbcTemplate(){
		return new JdbcTemplate(txManager().getDataSource());
	}

	@Bean
	@Singleton
	DataSourceTransactionManager txManager(){
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public DataSource dataSource() {
		HikariConfig ds = new HikariConfig();
		ds.setDriverClassName(driverClassName);
		ds.setJdbcUrl(url != null ? url : null);
		ds.setUsername(username != null ? username : null);
		ds.setPassword(pwd != null ? pwd : null);
		ds.setMaximumPoolSize(maxPoolSize);
		ds.setMinimumIdle(minIdle);
		ds.setIdleTimeout(idleTimeout);
		return new HikariDataSource(ds);
	}

}
