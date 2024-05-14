package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.gateway;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades.CuestionarioEntity;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.repositorios.CuestionarioRepository;

@Service
public class GestionarCuestionarioGatewayImplAdapter implements GestionarCuestionarioGatewayIntPort{

    private final CuestionarioRepository objCuestionarioRepository;
    private final ModelMapper cuestionarioModelMapper;

    public GestionarCuestionarioGatewayImplAdapter(CuestionarioRepository cuestionarioRepository, ModelMapper cuestionariModelMapper) {
        this.objCuestionarioRepository = cuestionarioRepository;
        this.cuestionarioModelMapper = cuestionariModelMapper;
    }

    @Override
    public Cuestionario crear(Cuestionario objCuestionario) {
        CuestionarioEntity objCuestionarioEntity = this.cuestionarioModelMapper.map(objCuestionario, CuestionarioEntity.class);
        CuestionarioEntity objCuestionarioEntityRegistrado = this.objCuestionarioRepository.save(objCuestionarioEntity);
        Cuestionario objCuestionarioRespuesta = this.cuestionarioModelMapper.map(objCuestionarioEntityRegistrado, Cuestionario.class);
        return objCuestionarioRespuesta;
    }
    @Override
    public List<Cuestionario> listar() {
        Iterable<CuestionarioEntity> lista = this.objCuestionarioRepository.findAll();
        List<Cuestionario> cuestionariosObtenidos = this.cuestionarioModelMapper.map(lista, new TypeToken<List<Cuestionario>>(){}.getType());
        return cuestionariosObtenidos;
    }

   // @Override
    //public Integer existeCuestionarioConNombre(String nombre) {
    ////    return this.objCuestionarioRepository.existeCuestionarioConTitulo(nombre);
   // }

}
