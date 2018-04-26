package br.com.projetofinal.service;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.dao.CargoDAO;
import br.com.projetofinal.model.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService extends GenericService<Cargo> {

    @Autowired
    private CargoDAO cargoDAO;

    @Override
    public GenericDAO<Cargo> getGenericDAO() {
        return cargoDAO;
    }
}
