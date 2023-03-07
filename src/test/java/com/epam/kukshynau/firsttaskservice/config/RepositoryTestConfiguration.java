package com.epam.kukshynau.firsttaskservice.config;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.epam.kukshynau.firsttaskservice")
@EntityScan({"com.epam.kukshynau.firsttaskservice"})
public class RepositoryTestConfiguration {

    @Bean("dataSource")
    public DataSource getDataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName("org.h2.Driver")
                .password("")
                .url("jdbc:h2:mem:testdb")
                .username("sa")
                .build();
    }

}
