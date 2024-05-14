package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "cuestionarios")
@Getter
@Setter
@AllArgsConstructor
public class CuestionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idCuestionario;

    @Column(length = 30, nullable = false)
    private String titulo;

    @Column(nullable = false, length = 30)
    private String descripcion;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "objCuestionario", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<PreguntaEntity> preguntas;


}
