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

import oriseba.Lunacafe.Iservice.IProductoService;
import oriseba.Lunacafe.entity.Producto;



@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*")
public class ProductoController {
	@Autowired 
	private IProductoService iproductoservice;
	
	@GetMapping
	public List<Producto>getAllProductos(){
		return iproductoservice.findAllProductos();
	}
	
	@GetMapping("/lunacafe/{id}")
	public Optional<Producto> getProductoById(@PathVariable Long id) {
		return iproductoservice.findAllProductoById(id);
	}
	
	@PostMapping 
	public Producto createProducto(@RequestBody Producto producto) {
		return iproductoservice.saveProducto(producto);
	}
}
