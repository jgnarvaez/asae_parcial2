package co.edu.unicauca.asae.segunda_parte_parcial.dominio.casosDeUso;

import java.util.List;

import co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.input.GestionarCuestionarioCUIntPort;
import co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.output.FormateadorResultadosIntPort;
import co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;

public class GestionarCuestionarioCUAdapter implements GestionarCuestionarioCUIntPort{

    private final GestionarCuestionarioGatewayIntPort objGestionarCuestionarioGateway;
    private final FormateadorResultadosIntPort objCuestionarioFormateadorResultados;

    public GestionarCuestionarioCUAdapter(GestionarCuestionarioGatewayIntPort cuestionarioGatewayIntPort, FormateadorResultadosIntPort formateadorResultadosIntPort) {
        this.objGestionarCuestionarioGateway = cuestionarioGatewayIntPort;
        this.objCuestionarioFormateadorResultados = formateadorResultadosIntPort;
    }

    
    @Override
    public Cuestionario crear(Cuestionario objCuestionario) {
        Cuestionario objCuestionarioCreado = null;
        if (this.objGestionarCuestionarioGateway.existeCuestionarioConNombre(objCuestionario.getTitulo()) > 0) {
            this.objCuestionarioFormateadorResultados.retornarRespuestaErrorEntidadExiste("Error, se encuentra en el sistema un cuestionario con el mismo nombre."); 
        } else {
            objCuestionarioCreado = this.objGestionarCuestionarioGateway.crear(objCuestionario);
        }
        return objCuestionarioCreado;
    }

    @Override
    public List<Cuestionario> listar() {
        List<Cuestionario> listaCuestionarios = this.objGestionarCuestionarioGateway.listar();
        return listaCuestionarios;
    }

}
