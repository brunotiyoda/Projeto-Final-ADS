package br.com.projetofinal.architecture.service;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.architecture.model.GenericModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class GenericService<Entidade extends GenericModel> {

    public abstract GenericDAO<Entidade> getGenericDAO();

    public void salvar(Entidade entidade) {
        getGenericDAO().salvar(entidade);
    }

    public void ativar(Entidade entidade) {
        getGenericDAO().ativar(entidade);
    }

    public void inativar(Entidade entidade) {
        getGenericDAO().inativar(entidade);
    }

    public List<Entidade> listaTodos() {
        return getGenericDAO().listaTodos();
    }

    public Entidade buscaPorId(String id) {
        Entidade buscaPorId = getGenericDAO().buscaPorId(id);
        if (buscaPorId != null) {
            System.out.println(buscaPorId.getId());
            return buscaPorId;
        }
        return null;
    }

}
