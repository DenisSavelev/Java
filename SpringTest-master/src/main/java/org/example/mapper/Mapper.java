package org.example.mapper;

import org.example.Model.ModelDicitionary;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Mapper implements RowMapper<ModelDicitionary> {
    public ModelDicitionary mapRow(ResultSet resultSet, int i) throws SQLException
    {
        ModelDicitionary modelDicitionary = new ModelDicitionary();
        modelDicitionary.setId(resultSet.getInt("id"));
        modelDicitionary.setRussian(resultSet.getString("russian"));
        modelDicitionary.setEnglish(resultSet.getString("english"));
        return modelDicitionary;
    }
}