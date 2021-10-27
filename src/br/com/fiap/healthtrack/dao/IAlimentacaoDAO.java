package br.com.fiap.healthtrack.dao;

import java.util.List;
import br.com.fiap.healthtrack.Alimentacao;

public interface IAlimentacaoDAO {

    public void create(Alimentacao meal);

    public List<Alimentacao> getAll();
    
    public Alimentacao getByiD(int Id);

    public void update(Alimentacao meal);

    public void delete(int id);

}