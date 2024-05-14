package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades.CuestionarioEntity;

public interface CuestionarioRepository extends CrudRepository<CuestionarioEntity, Integer>{

    List<CuestionarioEntity> findByTituloStartingWithIgnoreCaseOrderByIdDesc(String titulo);

    //@Query("SELECT count(*) FROM Cuestionarios c WHERE c.titulo = :titulo")
    //Integer existeCuestionarioConTitulo(String titulo);

}
