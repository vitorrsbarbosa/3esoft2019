package aula20190830.br.unicesumar.pedido.Repository;

import aula20190830.br.unicesumar.pedido.Pedido;
import aula20190830.br.unicesumar.produto.Produto;

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
