package co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cuestionario {
    private Integer idCuestionario;
    private String titulo;
    private String descripcion;
    private List<Pregunta> preguntas;

}
