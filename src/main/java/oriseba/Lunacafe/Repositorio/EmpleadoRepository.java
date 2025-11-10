package oriseba.Lunacafe.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import oriseba.Lunacafe.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository <Empleado, Long> {


}