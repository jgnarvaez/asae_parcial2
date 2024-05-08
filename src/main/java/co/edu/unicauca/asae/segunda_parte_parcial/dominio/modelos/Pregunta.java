package co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pregunta {
    private Integer idPregunta;
    private String enunciado;
    private Cuestionario objCuestionario;
    private TipoPregunta objTipoPregunta;
    private List<Respuesta> respuestas;

    public Pregunta() {
        respuestas = new ArrayList<Respuesta>();
    }
}
