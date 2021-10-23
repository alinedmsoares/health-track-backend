package br.com.fiap.healthtrack.dao;

import java.util.List;
import br.com.fiap.healthtrack.Peso;

public interface IPesoDAO {

    void create(Peso weight);

    List<Peso> getAll();

    void update(Peso weight);

    void delete(int id);

	Peso getById(int id);

}