package oriseba.Lunacafe.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oriseba.Lunacafe.Iservice.IEmpleadoService;
import oriseba.Lunacafe.Repositorio.EmpleadoRepository;
import oriseba.Lunacafe.entity.Empleado;

@Service
public class EmpleadoService implements IEmpleadoService {
	@Autowired
	private EmpleadoRepository eRepository;
	
	@Override 
	public List <Empleado> findAllEmpleados(){
		return eRepository.findAll();
	}
	
	@Override 
	public Empleado saveEmpleado(Empleado empleado) {
		return eRepository.save(empleado);
	}
	
	@Override 
	public Optional<Empleado> findAllEmpleadoById (Long id){
		return eRepository.findById(id);
	}
}