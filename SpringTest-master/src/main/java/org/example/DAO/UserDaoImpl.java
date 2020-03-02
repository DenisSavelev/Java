package org.example.DAO;

import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO dictionary (russian , english) VALUES (?,?)";
        jdbcTemplate.update(sql, user.getRussian(), user.getEnglish());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM dictionary WHERE id=? ";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public User getByRussian(String russian) {
        String sql = "SELECT * FROM dictionary WHERE russian=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), russian);
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM dictionary";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE dictionary SET russian=?, english=? WHERE id=?";
        jdbcTemplate.update(sql, user.getRussian(), user.getEnglish(),user.getId());

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM dictionary WHERE id=?";
        jdbcTemplate.update(sql,id);
    }
}