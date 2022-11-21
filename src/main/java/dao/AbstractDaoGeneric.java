package dao;

import java.util.List;

public abstract class AbstractDaoGeneric<T, K> implements GenericDaoInterface<T, K> {
    @Override
    public void salvar(T entity) {
        System.out.println("salvando");
    }

    @Override
    public void atualizar(T entity) {
        System.out.println("atualizando");
    }

    @Override
    public T buscarPorId(K id) {
        System.out.println("buscando por ID");
        return null;
    }

    @Override
    public List<T> buscarTodos() {
        System.out.println("buscanto todos");
        return null;
    }

    @Override
    public void excluir(K id) {

    }
}
