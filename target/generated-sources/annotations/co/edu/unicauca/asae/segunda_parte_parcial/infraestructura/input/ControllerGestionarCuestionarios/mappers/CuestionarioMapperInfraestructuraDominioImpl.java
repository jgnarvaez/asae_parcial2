package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.mappers;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Docente;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Pregunta;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Respuesta;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Telefono;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.TipoPregunta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTORespuesta.CuestionarioDTORespuesta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTORespuesta.PreguntaDTORespuesta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTORespuesta.RespuestaDTORespuesta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTORespuesta.TipoPreguntaDTORespuesta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarDocente.DTORespuesta.TelefonoDTORespuesta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-13T13:18:31-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class CuestionarioMapperInfraestructuraDominioImpl implements CuestionarioMapperInfraestructuraDominio {

    @Override
    public Cuestionario mappearDePeticionACuestionario(CuestionarioDTOPeticion cuestionario) {
        if ( cuestionario == null ) {
            return null;
        }

        Cuestionario cuestionario1 = new Cuestionario();

        cuestionario1.setDescripcion( cuestionario.getDescripcion() );
        cuestionario1.setIdCuestionario( cuestionario.getIdCuestionario() );
        cuestionario1.setTitulo( cuestionario.getTitulo() );

        return cuestionario1;
    }

    @Override
    public CuestionarioDTORespuesta mappearDeCuestionarioARespuesta(Cuestionario objCuestionario) {
        if ( objCuestionario == null ) {
            return null;
        }

        CuestionarioDTORespuesta cuestionarioDTORespuesta = new CuestionarioDTORespuesta();

        cuestionarioDTORespuesta.setDescripcion( objCuestionario.getDescripcion() );
        cuestionarioDTORespuesta.setIdCuestionario( objCuestionario.getIdCuestionario() );
        cuestionarioDTORespuesta.setPreguntas( preguntaListToPreguntaDTORespuestaList( objCuestionario.getPreguntas() ) );
        cuestionarioDTORespuesta.setTitulo( objCuestionario.getTitulo() );

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

    protected TipoPreguntaDTORespuesta tipoPreguntaToTipoPreguntaDTORespuesta(TipoPregunta tipoPregunta) {
        if ( tipoPregunta == null ) {
            return null;
        }

        TipoPreguntaDTORespuesta tipoPreguntaDTORespuesta = new TipoPreguntaDTORespuesta();

        tipoPreguntaDTORespuesta.setDescripcion( tipoPregunta.getDescripcion() );
        tipoPreguntaDTORespuesta.setIdTipoPregunta( tipoPregunta.getIdTipoPregunta() );
        tipoPreguntaDTORespuesta.setNombre( tipoPregunta.getNombre() );

        return tipoPreguntaDTORespuesta;
    }

    protected TelefonoDTORespuesta telefonoToTelefonoDTORespuesta(Telefono telefono) {
        if ( telefono == null ) {
            return null;
        }

        TelefonoDTORespuesta telefonoDTORespuesta = new TelefonoDTORespuesta();

        telefonoDTORespuesta.setIdTelefono( telefono.getIdTelefono() );
        telefonoDTORespuesta.setNumero( telefono.getNumero() );
        telefonoDTORespuesta.setObjDocente( docenteToDocenteDTORespuesta( telefono.getObjDocente() ) );

        return telefonoDTORespuesta;
    }

    protected List<RespuestaDTORespuesta> respuestaListToRespuestaDTORespuestaList(List<Respuesta> list) {
        if ( list == null ) {
            return null;
        }

        List<RespuestaDTORespuesta> list1 = new ArrayList<RespuestaDTORespuesta>( list.size() );
        for ( Respuesta respuesta : list ) {
            list1.add( respuestaToRespuestaDTORespuesta( respuesta ) );
        }

        return list1;
    }

    protected DocenteDTORespuesta docenteToDocenteDTORespuesta(Docente docente) {
        if ( docente == null ) {
            return null;
        }

        DocenteDTORespuesta docenteDTORespuesta = new DocenteDTORespuesta();

        docenteDTORespuesta.setApellidos( docente.getApellidos() );
        docenteDTORespuesta.setCorreo( docente.getCorreo() );
        docenteDTORespuesta.setNombres( docente.getNombres() );
        docenteDTORespuesta.setNumeroIdentificacion( docente.getNumeroIdentificacion() );
        docenteDTORespuesta.setObjTelefono( telefonoToTelefonoDTORespuesta( docente.getObjTelefono() ) );
        docenteDTORespuesta.setRespuestas( respuestaListToRespuestaDTORespuestaList( docente.getRespuestas() ) );
        docenteDTORespuesta.setTipoIdentificacion( docente.getTipoIdentificacion() );
        docenteDTORespuesta.setVinculacion( docente.getVinculacion() );

        return docenteDTORespuesta;
    }

    protected RespuestaDTORespuesta respuestaToRespuestaDTORespuesta(Respuesta respuesta) {
        if ( respuesta == null ) {
            return null;
        }

        RespuestaDTORespuesta respuestaDTORespuesta = new RespuestaDTORespuesta();

        respuestaDTORespuesta.setDescripcion( respuesta.getDescripcion() );
        respuestaDTORespuesta.setObjDocente( docenteToDocenteDTORespuesta( respuesta.getObjDocente() ) );
        respuestaDTORespuesta.setObjPregunta( preguntaToPreguntaDTORespuesta( respuesta.getObjPregunta() ) );

        return respuestaDTORespuesta;
    }

    protected PreguntaDTORespuesta preguntaToPreguntaDTORespuesta(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }

        PreguntaDTORespuesta preguntaDTORespuesta = new PreguntaDTORespuesta();

        preguntaDTORespuesta.setEnunciado( pregunta.getEnunciado() );
        preguntaDTORespuesta.setObjCuestionario( mappearDeCuestionarioARespuesta( pregunta.getObjCuestionario() ) );
        preguntaDTORespuesta.setObjTipoPregunta( tipoPreguntaToTipoPreguntaDTORespuesta( pregunta.getObjTipoPregunta() ) );
        preguntaDTORespuesta.setRespuestas( respuestaListToRespuestaDTORespuestaList( pregunta.getRespuestas() ) );

        return preguntaDTORespuesta;
    }

    protected List<PreguntaDTORespuesta> preguntaListToPreguntaDTORespuestaList(List<Pregunta> list) {
        if ( list == null ) {
            return null;
        }

        List<PreguntaDTORespuesta> list1 = new ArrayList<PreguntaDTORespuesta>( list.size() );
        for ( Pregunta pregunta : list ) {
            list1.add( preguntaToPreguntaDTORespuesta( pregunta ) );
        }

        return list1;
    }
}
