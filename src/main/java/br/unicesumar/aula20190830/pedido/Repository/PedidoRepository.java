package br.unicesumar.aula20190830.pedido.Repository;

import br.unicesumar.aula20190830.pedido.Pedido;
import br.unicesumar.aula20190830.produto.Produto;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PedidoRepository extends JpaRepository<Pedido,String> {

    @Query(value = "select a.* from produto a where a.preco = (select max(b.preco) from produto b)", nativeQuery = true)
    Page<Produto> encontrarProdutoComMaiorPreco(Pageable p);
    @Query(value = "select a.* from produto a where a.preco = (select min(b.preco) from produto b)", nativeQuery = true)
    Page<Produto> encontrarProdutoComMenorPreco(Pageable p);

    @Query(value = "select * from produto where nome =: nome", nativeQuery = true)
    Produto findByNome(String nome);
}
