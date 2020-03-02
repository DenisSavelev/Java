package org.example.DAO;

import org.example.Model.ModelDicitionary;

import java.util.List;

public interface DAOI {
    ModelDicitionary getById(int id);
    ModelDicitionary getByRussian(String russian);
    void update(ModelDicitionary modelDicitionary);
    void delete(int id);
    void save(ModelDicitionary modelDicitionary);
    List<ModelDicitionary> findAll();
}