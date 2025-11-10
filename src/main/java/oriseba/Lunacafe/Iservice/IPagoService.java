package oriseba.Lunacafe.Iservice;

import java.util.List;
import java.util.Optional;

import oriseba.Lunacafe.entity.Pago;

public interface IPagoService {

	List<Pago> findAllPagos();

	Pago savePago(Pago pago);

	Optional<Pago> findAllPagoById(Long id);



}
