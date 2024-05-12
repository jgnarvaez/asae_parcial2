package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTOPeticion;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PreguntaDTOPeticion {

    private Integer idPreguntaDTOPeticion;

    private String enunciado;

    private List<RespuestaDTOPeticion> respuestasDTOPeticions;

    private CuestionarioDTOPeticion objCuestionarioDTOPeticion;

    private TipoPreguntaDTOPeticion objTipoPregunta;
}
