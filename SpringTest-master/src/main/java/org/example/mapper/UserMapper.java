package org.example.mapper;

import org.example.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    public User mapRow(ResultSet resultSet, int i) throws SQLException
    {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setRussian(resultSet.getString("russian"));
        user.setEnglish(resultSet.getString("english"));
        return user;
    }
}