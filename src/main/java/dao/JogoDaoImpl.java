package dao;

import model.Jogo;

import java.util.ArrayList;
import java.util.List;

public class JogoDaoImpl extends AbstractDaoGeneric<Jogo,Integer> {
    @Override
    public void salvar(Jogo entity) {
        System.out.println("salvando " + entity.getNome());
    }

    @Override
    public void atualizar(Jogo entity) {
        System.out.println("atualizando " + entity.getNome());
    }

    @Override
    public Jogo buscarPorId(Integer id) {
        Jogo jogo = new Jogo();

        jogo.setId(id);
        return  jogo;
    }

    @Override
    public List<Jogo> buscarTodos() {
        List<Jogo> jogos = new ArrayList<>();
        jogos.add(new Jogo());
        jogos.add(new Jogo());
        jogos.get(0).setId((long) Math.random());
        jogos.get(0).setNome("jogo 1");
        jogos.get(0).setPreco(100d);

        jogos.get(1).setId((long) Math.random());
        jogos.get(1).setNome("jogo 2");
        jogos.get(1).setPreco(100d);

        return List.copyOf(jogos);
    }

    @Override
    public void excluir(Integer id) {
        System.out.println("Removendo jogo " + id.toString());
    }
}
