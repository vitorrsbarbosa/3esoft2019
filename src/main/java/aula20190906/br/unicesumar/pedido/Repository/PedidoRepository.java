package aula20190906.br.unicesumar.pedido.Repository;

import aula20190906.br.unicesumar.pedido.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,String> {
}
