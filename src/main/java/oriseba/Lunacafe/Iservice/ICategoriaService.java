package oriseba.Lunacafe.Iservice;

import java.util.List;
import java.util.Optional;

import oriseba.Lunacafe.entity.Categoria;

public interface ICategoriaService {

	List<Categoria> findAllCategorias();

	Categoria saveCategoria(Categoria categoria);

	Optional<Categoria> findAllCategoriaById(Long id);

}
