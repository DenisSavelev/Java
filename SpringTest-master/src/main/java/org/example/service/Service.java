package org.example.service;

import org.example.DAO.DAOI;
import org.example.Model.ModelDicitionary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Service implements UserService{
    @Autowired
    public DAOI DAOI;

    @Override
    public ModelDicitionary getById(int id) {
        return DAOI.getById(id);
    }

    @Override
    public ModelDicitionary getByRussian(String russian) {
        return DAOI.getByRussian(russian);
    }

    @Override
    public void update(ModelDicitionary modelDicitionary) {
        DAOI.update(modelDicitionary);
    }

    @Override
    public void delete(int id) {
        DAOI.delete(id);
    }

    @Override
    public void save(ModelDicitionary modelDicitionary) {
        DAOI.save(modelDicitionary);
    }

    @Override
    public List<ModelDicitionary> findAll() {
        return DAOI.findAll();
    }
}