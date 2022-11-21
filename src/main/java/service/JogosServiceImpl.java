package service;

import dao.AbstractDaoGeneric;
import model.Jogo;

public class JogosServiceImpl extends CrudServiceImp<Jogo, Integer>{

    public JogosServiceImpl(AbstractDaoGeneric<Jogo, Integer> dao) {
        super(dao);
    }
}
