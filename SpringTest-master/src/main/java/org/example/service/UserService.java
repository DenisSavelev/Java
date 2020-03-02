package org.example.service;

import org.example.Model.ModelDicitionary;

import java.util.List;

public interface UserService {
    void save(ModelDicitionary modelDicitionary);
    ModelDicitionary getById(int id);
    ModelDicitionary getByRussian(String russian);
    void delete(int id);
    void update(ModelDicitionary modelDicitionary);
    List<ModelDicitionary> findAll();
}