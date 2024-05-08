package co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Docente extends Persona {
    private String correo;
    private Telefono objTelefono;
    private String vinculacion;
    private List<Departamento> departamentos;
    private List<Respuesta> respuestas;

}
