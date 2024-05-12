package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TelefonoDTORespuesta {
    private Integer idTelefono;
    private String tipoTelefno;
    private String numero;
    private DocenteDTORespuesta objDocente;

}
