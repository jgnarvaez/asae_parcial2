package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTORespuesta;

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
