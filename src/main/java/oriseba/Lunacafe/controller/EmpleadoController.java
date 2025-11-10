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

import oriseba.Lunacafe.Iservice.IEmpleadoService;
import oriseba.Lunacafe.entity.Empleado;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin(origins = "*")

public class EmpleadoController {
	@Autowired 
	private IEmpleadoService iempleadoService;
	
	@GetMapping
	public List<Empleado> getAllEmpleados(){
		return iempleadoService.findAllEmpleados();
	}
	
	@GetMapping("/demonslayer/{id}")
	public Optional<Empleado> getEmpleadoById(@PathVariable Long id) {
		return iempleadoService.findAllEmpleadoById(id);
	}
	 
	@PostMapping 
	public Empleado createEmpleado(@RequestBody Empleado empleado) {
		return iempleadoService.saveEmpleado(empleado);
	}
}