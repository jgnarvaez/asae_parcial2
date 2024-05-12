package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Pregunta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTORespuesta.CuestionarioDTORespuesta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTORespuesta.PreguntaDTORespuesta;

@Mapper(componentModel = "spring")
public interface CuestionarioMapperEstructuraDominio {

    Cuestionario mappearDePeticionACuestionario(CuestionarioDTOPeticion cuestionario);

    CuestionarioDTORespuesta mappearDeCuestionarioARespuesta(Cuestionario objCuestionario);

    PreguntaDTORespuesta mappearPreguntasToPreguntaDTORespuesta(Pregunta pregunta);

    List<CuestionarioDTORespuesta> mappearDeCuestionarioaARespuesta(List<Cuestionario> cuestionarios);
    
}
