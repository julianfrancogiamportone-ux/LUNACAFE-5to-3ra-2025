package oriseba.Lunacafe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oriseba.Lunacafe.Iservice.IPagoService;
import oriseba.Lunacafe.Repositorio.PagoRepositorio;
import oriseba.Lunacafe.entity.Pago;


@Service
public class PagoService implements IPagoService{
	@Autowired
	private PagoRepositorio paRepository;

	@Override 
	public List<Pago>findAllPagos(){
		return paRepository.findAll();
	}
	
	@Override 
		public Pago savePago(Pago pago) {
		return paRepository.save(pago);
	}
		
	@Override 
		public Optional<Pago> findAllPagoById(Long id) {
			return paRepository.findById(id);
	}
}
