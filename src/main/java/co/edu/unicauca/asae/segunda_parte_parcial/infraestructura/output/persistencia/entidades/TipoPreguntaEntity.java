package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class TipoPreguntaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoPregunta;

    @Column(nullable = false, length = 200)
    private String nombre;

    @Column(nullable = false, length = 200)
    private String descripcion;

    @OneToMany(mappedBy = "objTipoPregunta", fetch = FetchType.EAGER)
    private List<PreguntaEntity> preguntas;

    public TipoPreguntaEntity() {

    }

}
