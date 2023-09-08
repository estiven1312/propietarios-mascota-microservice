package pe.edu.tecsup.propietariosmascota.service.implementations;

import org.springframework.stereotype.Service;
import pe.edu.tecsup.propietariosmascota.domain.Propietario;
import pe.edu.tecsup.propietariosmascota.repository.PropietarioRepository;
import pe.edu.tecsup.propietariosmascota.service.PropietarioService;

import java.util.List;
@Service
public class PropietarioServiceImpl implements PropietarioService {

    private final PropietarioRepository propietarioRepository;

    public PropietarioServiceImpl(PropietarioRepository propietarioRepository) {
        this.propietarioRepository = propietarioRepository;
    }

    @Override
    public List<Propietario> listarPropietarios() {
        return propietarioRepository.findAll();
    }

    @Override
    public Propietario findById(Long id) {
        return propietarioRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePropietario(Long id) {
        propietarioRepository.deleteById(id);
    }

    @Override
    public Propietario editPropietario(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }
}
