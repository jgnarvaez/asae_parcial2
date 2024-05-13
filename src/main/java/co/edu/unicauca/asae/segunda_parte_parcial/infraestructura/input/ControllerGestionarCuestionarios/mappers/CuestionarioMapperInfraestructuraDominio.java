package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTORespuesta.CuestionarioDTORespuesta;

@Mapper(componentModel = "spring")
public interface CuestionarioMapperInfraestructuraDominio {

    Cuestionario mappearDePeticionACuestionario(CuestionarioDTOPeticion cuestionario);

    CuestionarioDTORespuesta mappearDeCuestionarioARespuesta(Cuestionario objCuestionario);

    List<CuestionarioDTORespuesta> mappearDeCuestionarioaARespuesta(List<Cuestionario> cuestionarios);

}
