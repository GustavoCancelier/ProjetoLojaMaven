package com.fernandoegustavo.projetolojamaven.service;

import com.fernandoegustavo.projetolojamaven.controller.InterfaceService;
import java.util.List;
import com.fernandoegustavo.projetolojamaven.model.DAO.BairroDAO;
import com.fernandoegustavo.projetolojamaven.model.bo.Bairro;

public class BairroService implements InterfaceService<Bairro> {

    @Override
    public  void salvar(Bairro objeto) {
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.create(objeto);
    }

    @Override
    public List<Bairro> buscar() {
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve();
    }

    @Override
    public Bairro buscar(int codigo) {
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve(codigo);
    }

    @Override
    public Bairro buscar(String descricao) {
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve(descricao);
    }

    @Override
    public void atualizar(Bairro objeto) {
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.update(objeto);
    }

    @Override
    public void apagar(Bairro objeto) {
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.delete(objeto);
    }

}
