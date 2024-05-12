package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTORespuesta.CuestionarioDTORespuesta;

@Mapper(componentModel = "spring")
public interface CuestionarioMapperEstructuraDominio {

    Cuestionario mappearDePeticionACuestionario(CuestionarioDTOPeticion cuestionario);

    CuestionarioDTORespuesta mappearDeCuestionarioARespuesta(Cuestionario objCuestionario);

    List<CuestionarioDTORespuesta> mappearDeCuestionarioaARespuesta(List<Cuestionario> cuestionarios);
    List
}
