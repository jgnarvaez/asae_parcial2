package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTOPeticion;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DocenteDTOPeticion {

    private Integer idDocente;

    @NotNull(message = "{docente.tipoidentificacion.emply}")
    @Size(min = 2, max = 30, message = "{docente.tipoidentificacion.size}")
    private String tipoIdentificacion;

    @NotNull(message = "{docente.numeroidentificacion.emply}")
    @Size(min = 5, max = 30, message = "{docente.numeroidentificacion.size}")
    private String numeroIdentificacion;

    @NotNull(message = "{docente.nombres.emply}")
    @Size(min = 3, max = 30, message = "{docente.nombres.size}")
    private String nombres;

    @NotNull(message = "{docente.apellidos.emply}")
    @Size(min = 3, max = 30, message = "{docente.apellidos.size}")
    private String apellidos;

    @Size(min = 1)
    private List<DepartamentoDTOPeticion> departamentosDTOs;

    private TelefonoDTOPeticion objTelefonoDTOPeticion;

    private List<RespuestaDTOPeticion> respuestasDTOs;
}
