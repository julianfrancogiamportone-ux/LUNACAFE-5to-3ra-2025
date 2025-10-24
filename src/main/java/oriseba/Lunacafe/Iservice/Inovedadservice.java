package oriseba.Lunacafe.Iservice;

import java.util.List;
import java.util.Optional;

import oriseba.Lunacafe.entity.Novedad;

public interface Inovedadservice {

	List<Novedad> findAllNovedades();

	Novedad saveNovedad(Novedad novedad);

	Optional<Novedad> findAllNovedadById(Long id);



}
