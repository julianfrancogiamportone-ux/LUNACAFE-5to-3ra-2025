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

import oriseba.Lunacafe.Iservice.IClienteService;
import oriseba.Lunacafe.entity.Cliente;


@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteControlller {
	@Autowired 
	private IClienteService iclienteservice;
	
	@GetMapping
	public List<Cliente>getAllClientes(){
		return iclienteservice.findAllClientes();
	}
	
	@GetMapping("/lunacafe/{id}")
	public Optional<Cliente> getClienteById(@PathVariable Long id) {
		return iclienteservice.findAllClienteById(id);
	}
	
	@PostMapping 
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return iclienteservice.saveCliente(cliente);
	}
}
