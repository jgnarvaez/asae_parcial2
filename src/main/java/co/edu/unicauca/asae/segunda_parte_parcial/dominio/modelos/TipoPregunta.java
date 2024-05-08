package co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoPregunta {
    private Integer idTipoPregunta;
    private String nombre;
    private String descripcion;
    private List<Pregunta> preguntas;
}
