package oriseba.Lunacafe.Iservice;

import java.util.List;
import java.util.Optional;

import oriseba.Lunacafe.entity.Pedido;

public interface IPedidoService {

	List<Pedido> findAllPedidos();

	Pedido savePedido(Pedido pedido);

	Optional<Pedido> findAllPedidoById(Long id);

}
