package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTOPeticion;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TelefonoDTOPeticion {

    private Integer idTelefono;

    @NotNull(message = "{telefono.tipo.emply}")
    @Size(min = 5, max = 30, message = "{telefono.tipo.size}")
    private String tipoTelefono;

    @NotNull(message = "{telefono.numero.emply}")
    @Pattern(regexp = "3\\d{9}", message = "el numero debe empezar con 9 y tener 10 digitos")
    private String numero;

    private DocenteDTOPeticion objDocenteDTOPeticion;

}
