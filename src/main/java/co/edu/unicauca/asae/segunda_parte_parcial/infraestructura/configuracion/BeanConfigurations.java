package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.output.FormateadorResultadosIntPort;
import co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.casosDeUso.GestionarCuestionarioCUAdapter;

@Configuration
public class BeanConfigurations {

    @Bean
    public GestionarCuestionarioCUAdapter crearGestionarCuestionarioCUInt( 
        GestionarCuestionarioGatewayIntPort objCuestionarioFormateadorResultados,
        FormateadorResultadosIntPort objFormateadorResultadosIntPort) {

            GestionarCuestionarioCUAdapter objGestionarCuestionarioCU = new GestionarCuestionarioCUAdapter(objCuestionarioFormateadorResultados, objFormateadorResultadosIntPort);
            return objGestionarCuestionarioCU;
        }

}
