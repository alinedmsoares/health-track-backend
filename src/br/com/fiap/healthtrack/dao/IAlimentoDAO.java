package br.com.fiap.healthtrack.dao;

import java.util.List;
import br.com.fiap.healthtrack.Alimento;

public interface IAlimentoDAO {

    void create(Alimento food);

    List<Alimento> getAll();

    void update(Alimento food);

    void delete(int id);

    Alimento getById(int id);

}