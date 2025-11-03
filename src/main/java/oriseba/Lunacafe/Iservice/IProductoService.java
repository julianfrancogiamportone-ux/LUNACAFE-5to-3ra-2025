package oriseba.Lunacafe.Iservice;

import java.util.List;
import java.util.Optional;

import oriseba.Lunacafe.entity.Producto;

public interface IProductoService {

	List<Producto> findAllProductos();

	Producto saveProducto(Producto producto);

	Optional<Producto> findAllProductoById(Long id);


}
