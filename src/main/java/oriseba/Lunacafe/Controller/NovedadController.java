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

import oriseba.Lunacafe.Iservice.Inovedadservice;
import oriseba.Lunacafe.entity.Novedad;

@RestController
@RequestMapping("/api/novedades")
@CrossOrigin(origins = "*")
public class NovedadController {
	@Autowired 
	private Inovedadservice InovedadService;
	
	@GetMapping
	public List<Novedad>getAllNovedades(){
		return InovedadService.findAllNovedades();
	}
	
	@GetMapping("/lunacafe/{id}")
	public Optional<Novedad> getNovedadById(@PathVariable Long id) {
		return InovedadService.findAllNovedadById(id);
	}
	
	@PostMapping 
	public Novedad createNovedad(@RequestBody Novedad novedad) {
		return InovedadService.saveNovedad(novedad);
	}
}
