package aula20190830.br.unicesumar.produto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aula20190830.br.unicesumar.produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
}
