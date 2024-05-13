package co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cuestionario {
    private Integer idCuestionario;
    private String titulo;
    private String descripcion;
    private List<Pregunta> preguntas;

    public Cuestionario() {
        this.preguntas = new ArrayList<>();
    }
}
