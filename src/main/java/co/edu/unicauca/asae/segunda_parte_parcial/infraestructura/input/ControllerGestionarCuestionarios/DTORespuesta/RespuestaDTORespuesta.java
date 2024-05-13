package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTORespuesta;

import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaDTORespuesta {
    private Integer idespuesta;
    private DocenteDTORespuesta objDocente;
    private PreguntaDTORespuesta objPregunta;
    private String descripcion;
}
