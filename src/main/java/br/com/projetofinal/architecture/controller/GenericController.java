package br.com.projetofinal.architecture.controller;

import br.com.projetofinal.architecture.model.GenericModel;
import br.com.projetofinal.architecture.service.GenericService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public abstract class GenericController<Entidade extends GenericModel> {

    public abstract GenericService<Entidade> getGenericService();

    @PostMapping("/salvar")
    public void salvar(@RequestBody Entidade entidade) {
        getGenericService().salvar(entidade);
    }

    @RequestMapping(value = "/ativar/{id}", method = RequestMethod.POST)
    public void ativar(@PathVariable("id") Entidade entidade) {
        getGenericService().ativar(entidade);
    }

    @RequestMapping(value = "/inativar/{id}", method = RequestMethod.POST)
    public void inativar(@PathVariable("id") Entidade entidade) {
        getGenericService().inativar(entidade);
    }

    @RequestMapping(value = "/busca/{id}", method = RequestMethod.GET)
    public Entidade buscaPorId(@PathVariable("id") String id) {
        return getGenericService().buscaPorId(id);
    }

    @RequestMapping(value = "/listaTodos", method = RequestMethod.GET)
    public List<Entidade> listaTodos() {
        return getGenericService().listaTodos();
    }

}
