package co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {
    private Integer idDepartamento;
    private String nombreDep;
    private String descripcion;
}
