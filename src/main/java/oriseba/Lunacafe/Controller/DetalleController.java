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

import oriseba.Lunacafe.Iservice.IDetalleService;

import oriseba.Lunacafe.entity.Detalle;


@RestController
@RequestMapping("/api/detalles")
@CrossOrigin(origins = "*")
public class DetalleController {
	@Autowired 
	private IDetalleService idetalleservice;
	
	@GetMapping
	public List<Detalle>getAllDetalles(){
		return idetalleservice.findAllDetalles();
	}
	
	@GetMapping("/lunacafe/{id}")
	public Optional<Detalle> getDetalleById(@PathVariable Long id) {
		return idetalleservice.findAllDetalleById(id);
	}
	
	@PostMapping 
	public Detalle createDetalle(@RequestBody Detalle detalle) {
		return idetalleservice.saveDetalle(detalle);
	}
}
