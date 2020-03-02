package org.example.config;

import org.example.DAO.*;
import org.example.service.*;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DriverManagerDataSource getDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=true&verifyServerCertificate=false");
        dataSource.setUsername("root");
        dataSource.setPassword("1337");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
    @Bean
    public DAOI getUserDao(){
        return new DAO(getJdbcTemplate());
    }
    @Bean
    public UserService getUserService(){
        return new Service();
    }
}