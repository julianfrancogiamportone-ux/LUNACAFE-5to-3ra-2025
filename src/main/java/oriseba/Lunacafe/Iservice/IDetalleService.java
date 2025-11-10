package oriseba.Lunacafe.Iservice;

import java.util.List;
import java.util.Optional;

import oriseba.Lunacafe.entity.Detalle;

public interface IDetalleService {

	List<Detalle> findAllDetalles();

	Detalle saveDetalle(Detalle detalle);

	Optional<Detalle> findAllDetalleById(Long id);



}
