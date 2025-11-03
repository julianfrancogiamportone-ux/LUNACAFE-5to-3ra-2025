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

import oriseba.Lunacafe.Iservice.ICategoriaService;
import oriseba.Lunacafe.entity.Categoria;



@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {
	
	@Autowired 
	private ICategoriaService icategoriaservice;
	
	@GetMapping
	public List<Categoria>getAllCategorias(){
		return icategoriaservice.findAllCategorias();
	}
	
	@GetMapping("/lunacafe/{id}")
	public Optional<Categoria> getCategoriaById(@PathVariable Long id) {
		return icategoriaservice.findAllCategoriaById(id);
	}
	
	@PostMapping 
	public Categoria createCategoria(@RequestBody Categoria categoria) {
		return icategoriaservice.saveCategoria(categoria);
	}

}
