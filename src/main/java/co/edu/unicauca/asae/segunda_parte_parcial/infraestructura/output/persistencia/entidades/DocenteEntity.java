package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocenteEntity extends PersonaEntity{

    @Column(nullable = false, length = 100, unique = true)
    private String correo;

    @Column(nullable = false, length = 30)
    private String vinculacion;

    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "objDocente")
    @PrimaryKeyJoinColumn
    private TelefonoEntity objTelefono; 


    @ManyToMany
    @JoinTable(name = "Departamentos-Docentes",
    joinColumns =  @JoinColumn(name = "idPersona"), 
    inverseJoinColumns = @JoinColumn(name = "idDepartamento"))
    private List<DepartamentoEntity> departamentos;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "objDocente")
    private List<RespuestaEntity> respuestas;


}
