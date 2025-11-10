package oriseba.Lunacafe.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oriseba.Lunacafe.Iservice.IPedidoService;
import oriseba.Lunacafe.entity.Pedido;


@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {
	@Autowired 
	private IPedidoService ipedidoservice;
	
	@GetMapping
	public List<Pedido>getAllPedidos(){
		return ipedidoservice.findAllPedidos();
	}
	
	@GetMapping("/lunacafe/{id}")
	public Optional<Pedido> getPedidoById(@PathVariable Long id) {
		return ipedidoservice.findAllPedidoById(id);
	}
	
	@PostMapping 
	public Pedido createPedido(@RequestBody Pedido pedido) {
		return ipedidoservice.savePedido(pedido);
	}
}
