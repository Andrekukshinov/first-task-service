package com.epam.kukshynau.firsttaskservice.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.epam.kukshynau.firsttaskservice")
public class DatabesConfig {
    @Value("${spring.datasource.jdbcUrl}")
    private String url;

    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean("dataSource")
    @ConditionalOnMissingBean
    @Profile("dev")
    public DataSource getDataDevSource() {
        return DataSourceBuilder
                .create()
                .username(username)
                .password(password)
                .driverClassName(driverClassName)
                .url(url)
                .build();
    }


    @Bean("dataSource")
    @ConditionalOnMissingBean
    @Profile("QA")
    public DataSource getDataQASource() {
        return DataSourceBuilder
                .create()
                .username("sa")
                .password(password)
                .driverClassName("org.h2.Driver")
                .url("jdbc:h2:mem:harringtenQA")
                .build();
    }
}
