package oriseba.Lunacafe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oriseba.Lunacafe.Iservice.IPedidoService;
import oriseba.Lunacafe.Repositorio.PedidoRepositorio;
import oriseba.Lunacafe.entity.Pedido;


@Service
public class PedidoService implements IPedidoService {
	@Autowired
	private PedidoRepositorio peRepository;

	@Override 
	public List<Pedido>findAllPedidos(){
		return peRepository.findAll();
	}
	
	@Override 
		public Pedido savePedido(Pedido pedido) {
		return peRepository.save(pedido);
	}
		
	@Override 
		public Optional<Pedido> findAllPedidoById(Long id) {
			return peRepository.findById(id);
	}

}
