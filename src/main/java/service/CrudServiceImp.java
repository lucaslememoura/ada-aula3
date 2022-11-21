package service;

import dao.AbstractDaoGeneric;
import model.Jogo;

import java.util.List;

public abstract class CrudServiceImp<T, K> implements CrudService<T, K>{

    private AbstractDaoGeneric<T, K> dao;

    public CrudServiceImp(AbstractDaoGeneric<T, K> dao) {
        this.dao = dao;
    }

    @Override
    public void salvar(T entity) {
        dao.salvar(entity);
    }

    @Override
    public void atualizar(T entity) {
        dao.atualizar(entity);
    }

    @Override
    public T buscarPorId(K id) {
        return dao.buscarPorId(id);
    }

    @Override
    public List<T> buscartodos() {
        return dao.buscarTodos();
    }

    @Override
    public void excluir(K id) {
        dao.excluir(id);
    }
}
