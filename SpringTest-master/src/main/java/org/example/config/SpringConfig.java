package org.example.config;

import org.example.DAO.UserDao;
import org.example.DAO.UserDaoImpl;
import org.example.service.UserService;
import org.example.service.UserServiceIml;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
    public UserDao getUserDao(){
        return new UserDaoImpl(getJdbcTemplate());
    }
    @Bean
    public UserService getUserService(){
        return new UserServiceIml();
    }
}
