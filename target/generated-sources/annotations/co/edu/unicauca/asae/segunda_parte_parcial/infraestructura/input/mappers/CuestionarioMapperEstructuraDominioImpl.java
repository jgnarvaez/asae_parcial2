package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.mappers;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTORespuesta.CuestionarioDTORespuesta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-12T14:15:42-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class CuestionarioMapperEstructuraDominioImpl implements CuestionarioMapperEstructuraDominio {

    @Override
    public Cuestionario mappearDePeticionACuestionario(CuestionarioDTOPeticion cuestionario) {
        if ( cuestionario == null ) {
            return null;
        }

        Cuestionario cuestionario1 = new Cuestionario();

        return cuestionario1;
    }

    @Override
    public CuestionarioDTORespuesta mappearDeCuestionarioARespuesta(Cuestionario objCuestionario) {
        if ( objCuestionario == null ) {
            return null;
        }

        CuestionarioDTORespuesta cuestionarioDTORespuesta = new CuestionarioDTORespuesta();

        return cuestionarioDTORespuesta;
    }

    @Override
    public List<CuestionarioDTORespuesta> mappearDeCuestionarioaARespuesta(List<Cuestionario> cuestionarios) {
        if ( cuestionarios == null ) {
            return null;
        }

        List<CuestionarioDTORespuesta> list = new ArrayList<CuestionarioDTORespuesta>( cuestionarios.size() );
        for ( Cuestionario cuestionario : cuestionarios ) {
            list.add( mappearDeCuestionarioARespuesta( cuestionario ) );
        }

        return list;
    }
}
