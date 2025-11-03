package oriseba.Lunacafe.Iservice;

import java.util.List;
import java.util.Optional;

import oriseba.Lunacafe.entity.Cliente;

public interface IClienteService {

	List<Cliente> findAllClientes();

	Cliente saveCliente(Cliente cliente);

	Optional<Cliente> findAllClienteById(Long id);

}
