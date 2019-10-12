package br.unicesumar.aula20190830.produto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unicesumar.aula20190830.produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
}
