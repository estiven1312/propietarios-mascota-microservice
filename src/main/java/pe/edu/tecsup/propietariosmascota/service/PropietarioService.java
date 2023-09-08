package pe.edu.tecsup.propietariosmascota.service;

import pe.edu.tecsup.propietariosmascota.domain.Propietario;

import java.util.List;

public interface PropietarioService {
    List<Propietario> listarPropietarios();

    Propietario findById(Long id);

    void deletePropietario(Long id);

    Propietario editPropietario(Propietario propietario);
}
