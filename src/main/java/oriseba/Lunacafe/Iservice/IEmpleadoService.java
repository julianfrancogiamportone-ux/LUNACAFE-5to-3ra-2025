package oriseba.Lunacafe.Iservice;

import java.util.List;
import java.util.Optional;

import oriseba.Lunacafe.entity.Empleado;

public interface IEmpleadoService {

	List<Empleado> findAllEmpleados();

	Empleado saveEmpleado(Empleado empleado);

	Optional<Empleado> findAllEmpleadoById(Long id);



}
