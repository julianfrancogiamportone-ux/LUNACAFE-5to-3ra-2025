package oriseba.Lunacafe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oriseba.Lunacafe.Iservice.IDetalleService;
import oriseba.Lunacafe.Repositorio.DetalleRepositorio;
import oriseba.Lunacafe.entity.Detalle;


@Service
public class DetalleService implements IDetalleService{
	@Autowired
	private DetalleRepositorio dRepository;

	@Override 
	public List<Detalle>findAllDetalles(){
		return dRepository.findAll();
	}
	
	@Override 
		public Detalle saveDetalle(Detalle detalle) {
		return dRepository.save(detalle);
	}
		
	@Override 
		public Optional<Detalle> findAllDetalleById(Long id) {
			return dRepository.findById(id);
	}
}
