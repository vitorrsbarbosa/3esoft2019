package aula20190906.br.unicesumar.pedido;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Pedido {
    @Id
    private String id;
    private Long numero;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pedido")
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(String id) {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Long getNumero() {
        return numero;
    }
}
