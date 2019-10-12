package br.unicesumar.repository;

import java.util.List;

public interface CorRepository {

	void inserir(Cor c);
	List<Cor> obterTodas();
	void alterar(Cor c);
	void excluir(int id);

}