package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarDocente.DTORespuesta;

import java.util.List;

import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTORespuesta.RespuestaDTORespuesta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocenteDTORespuesta {
    private Integer idDocente;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String nombres;
    private String apellidos;
    private String correo;
    private String vinculacion;
    private TelefonoDTORespuesta objTelefono;
    private List<RespuestaDTORespuesta> respuestas;
}
