package oriseba.Lunacafe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oriseba.Lunacafe.Iservice.IClienteService;
import oriseba.Lunacafe.Repositorio.ClienteRepository;
import oriseba.Lunacafe.entity.Cliente;
;

@Service
public class ClienteService implements IClienteService {
	@Autowired
	private ClienteRepository cRepository;

	@Override 
	public List<Cliente>findAllClientes(){
		return cRepository.findAll();
	}
	
	@Override 
		public Cliente saveCliente(Cliente cliente) {
		return cRepository.save(cliente);
	}
		
	@Override 
		public Optional<Cliente> findAllClienteById(Long id) {
			return cRepository.findById(id);
	}
}