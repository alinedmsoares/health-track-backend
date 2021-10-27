package br.com.fiap.healthtrack.dao;

import java.util.List;
import br.com.fiap.healthtrack.Profissional;

public interface IProfissionalDAO {

    public void create(Profissional profissional);

    public List<Profissional> getAll();
    
    public Profissional getByiD(int Id);

    public void update(Profissional profissional);

    public void delete(int id);

}