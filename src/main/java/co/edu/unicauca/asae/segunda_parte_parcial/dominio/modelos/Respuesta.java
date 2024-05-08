package co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Respuesta {
    private Pregunta objPregunta;
    private Integer idRespuesta;
    private Docente objDocente;
    private String descripcion;
}
