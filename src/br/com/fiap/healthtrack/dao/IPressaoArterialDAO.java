package br.com.fiap.healthtrack.dao;

import java.util.List;
import br.com.fiap.healthtrack.Pressao;

public interface IPressaoArterialDAO {

    void create(Pressao pressure);

    List<Pressao> getAll();

    void update(Pressao pressure);

    void delete(int id);

	Pressao getById(int id);

}