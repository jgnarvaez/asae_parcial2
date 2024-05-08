package co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Telefono {
    private Integer idTelefono;
    private String tipoTelefono;
    private String numero;
    private Docente objDocente;
}
