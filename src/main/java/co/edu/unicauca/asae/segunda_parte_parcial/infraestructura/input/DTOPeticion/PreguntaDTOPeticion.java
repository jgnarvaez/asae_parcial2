package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTOPeticion;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PreguntaDTOPeticion {

    private Integer idPreguntaDTOPeticion;

    @NotNull(message = "{pregunta.enunciado.emply}")
    @Size(min = 5, max = 250, message = "{pregunta.enunciado.size}")
    private String enunciado;

    private List<RespuestaDTOPeticion> respuestasDTOPeticions;

    private CuestionarioDTOPeticion objCuestionarioDTOPeticion;

    private TipoPreguntaDTOPeticion objTipoPregunta;
}
