package org.example.DAO;

import org.example.Model.ModelDicitionary;
import org.example.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DAO implements DAOI {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public DAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public ModelDicitionary getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM dictionary WHERE id=? ", new Mapper(), id);
    }

    @Override
    public ModelDicitionary getByRussian(String russian) {
        return jdbcTemplate.queryForObject("SELECT * FROM dictionary WHERE russian=?", new Mapper(), russian);
    }

    @Override
    public void update(ModelDicitionary modelDicitionary) {
        jdbcTemplate.update("UPDATE dictionary SET russian=?, english=? WHERE id=?", modelDicitionary.getRussian(), modelDicitionary.getEnglish(), modelDicitionary.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM dictionary WHERE id=?";
        jdbcTemplate.update("DELETE FROM dictionary WHERE id=?",id);
    }

    @Override
    public void save(ModelDicitionary modelDicitionary) {
        jdbcTemplate.update("INSERT INTO dictionary (russian , english) VALUES (?,?)", modelDicitionary.getRussian(), modelDicitionary.getEnglish());
    }

    @Override
    public List<ModelDicitionary> findAll() {
        return jdbcTemplate.query("SELECT * FROM dictionary", new Mapper());
    }

}