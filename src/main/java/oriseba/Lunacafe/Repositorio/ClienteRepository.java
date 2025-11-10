package oriseba.Lunacafe.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import oriseba.Lunacafe.entity.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
