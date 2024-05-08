package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades.Docente;

public interface DocenteRepository extends CrudRepository<Docente, Integer>{

}
