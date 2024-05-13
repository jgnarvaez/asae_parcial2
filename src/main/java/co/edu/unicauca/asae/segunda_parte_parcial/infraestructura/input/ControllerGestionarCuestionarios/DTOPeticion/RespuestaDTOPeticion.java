package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTOPeticion;

import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RespuestaDTOPeticion {

    private Integer idRespuestaDTOPeticion;

    private PreguntaDTOPeticion objPreguntaDTOPeticion;

    private DocenteDTOPeticion objDocenteDTOPeticion;

    @NotNull(message = "{respuesta.descripcion.emply}")
    @Size(min = 2, max = 200, message = "{respuesta.descripcion.size}")
    private String descripcion;

}
