package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "preguntas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PreguntaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPregunta;

    @Column(nullable = false, length = 250)
    private String enunciado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idtipopregunta")
    private TipoPreguntaEntity objTipoPregunta;

    @ManyToOne
    @JoinColumn(name = "idcuestionario")
    private CuestionarioEntity objCuestionario;

    @OneToMany(mappedBy = "objPregunta", fetch = FetchType.LAZY)
    private List<RespuestaEntity> respuestas;

}
