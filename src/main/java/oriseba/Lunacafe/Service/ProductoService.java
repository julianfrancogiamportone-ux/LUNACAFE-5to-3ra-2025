package oriseba.Lunacafe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oriseba.Lunacafe.Iservice.IProductoService;
import oriseba.Lunacafe.Repositorio.ProductoRepository;
import oriseba.Lunacafe.entity.Producto;


@Service
public class ProductoService implements IProductoService{
	@Autowired
	private ProductoRepository pRepository;

	@Override 
	public List<Producto>findAllProductos(){
		return pRepository.findAll();
	}
	
	@Override 
		public Producto saveProducto(Producto producto) {
		return pRepository.save(producto);
	}
		
	@Override 
		public Optional<Producto> findAllProductoById(Long id) {
			return pRepository.findById(id);
	}
}
