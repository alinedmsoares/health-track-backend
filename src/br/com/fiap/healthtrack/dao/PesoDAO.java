package br.com.fiap.healthtrack.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.healthtrack.Peso;

public class PesoDAO implements IPesoDAO {

	ArrayList<Peso> list = new ArrayList<Peso>();
	
	@Override
	public void create(Peso weight) {
		list.add(weight);
	}

	@Override
	public List<Peso> getAll() {
		return list;
	}
	
	@Override
	public void update(int i, Peso weight) {
		list.set(i,weight);
	}

	@Override
	public void delete(int i) {
		list.remove(i);
	}

}