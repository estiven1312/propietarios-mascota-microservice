package pe.edu.tecsup.propietariosmascota.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.propietariosmascota.domain.Propietario;
@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {
}
