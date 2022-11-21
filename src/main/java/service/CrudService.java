package service;

import model.Jogo;

import java.util.List;

public interface CrudService<T, K> {
    void salvar(T entity);
    void atualizar(T entity);
    T buscarPorId(K id);
    List<T> buscartodos();
    void excluir(K id);

}
