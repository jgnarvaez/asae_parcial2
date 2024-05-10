package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades.DocenteEntity;

public interface DocenteRepository extends CrudRepository<DocenteEntity, Integer>{

    @Query("SELECT count(*) FROM personas p  WHERE p.correo = :correo")
    Integer existeDocenteConCorreo(String correo);

}
