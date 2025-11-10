package oriseba.Lunacafe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oriseba.Lunacafe.Iservice.ICategoriaService;
import oriseba.Lunacafe.Repositorio.CategoriaRepository;
import oriseba.Lunacafe.entity.Categoria;

@Service
public class CategoriaService implements ICategoriaService {
	@Autowired
	private CategoriaRepository caRepository;

	@Override 
	public List<Categoria>findAllCategorias(){
		return caRepository.findAll();
	}
	
	@Override 
		public Categoria saveCategoria(Categoria categoria) {
		return caRepository.save(categoria);
	}
		
	@Override 
		public Optional<Categoria> findAllCategoriaById(Long id) {
			return caRepository.findById(id);
	}
}
