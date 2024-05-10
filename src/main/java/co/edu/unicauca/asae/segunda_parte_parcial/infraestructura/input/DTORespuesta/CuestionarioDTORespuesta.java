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
public class CuestionarioDTORespuesta {

    private Integer idCuestionario;
    private String titulo;
    private String descripcion;
    private List<PreguntaDTORespuesta> preguntas;
}
