package dao;

import java.util.List;

public interface GenericDaoInterface<T, K> {

    void salvar(T entity);
    void atualizar(T entity);
    T buscarPorId(K id);
    List<T> buscarTodos();
    void excluir(K id);

}
