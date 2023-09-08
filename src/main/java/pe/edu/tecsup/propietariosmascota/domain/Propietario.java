package pe.edu.tecsup.propietariosmascota.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "propietario")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long id;
    private String nombre;
    private String direccion;
    private Integer edad;
    @Column(name = "numero_contacto")
    private String numeroContacto;
}
