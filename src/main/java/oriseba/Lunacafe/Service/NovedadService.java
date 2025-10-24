package oriseba.Lunacafe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oriseba.Lunacafe.Iservice.Inovedadservice;
import oriseba.Lunacafe.Repositorio.NovedadRepositorio;
import oriseba.Lunacafe.entity.Novedad;


@Service
public class NovedadService implements Inovedadservice {
	@Autowired
	private NovedadRepositorio nRepository;

	@Override 
	public List<Novedad>findAllNovedades(){
		return nRepository.findAll();
	}
	
	@Override 
		public Novedad saveNovedad(Novedad novedad) {
		return nRepository.save(novedad);
	}
		
	@Override 
		public Optional<Novedad> findAllNovedadById(Long id) {
			return nRepository.findById(id);
	}
}
