package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTORespuesta;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PreguntaDTORespuesta {
    private Integer idRespuesta;
    private String enunciado;
    private TipoPreguntaDTORespuesta objTipoPregunta;
    private CuestionarioDTORespuesta objCuestionario;
    private List<RespuestaDTORespuesta> respuestas;
}
