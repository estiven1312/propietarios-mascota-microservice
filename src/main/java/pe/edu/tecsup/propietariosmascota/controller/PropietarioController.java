package pe.edu.tecsup.propietariosmascota.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.tecsup.propietariosmascota.domain.Propietario;
import pe.edu.tecsup.propietariosmascota.service.PropietarioService;

import java.util.List;

@RestController
@RequestMapping(value = "/propietario")
public class PropietarioController {
    private final PropietarioService propietarioService;

    public PropietarioController(PropietarioService propietarioService) {
        this.propietarioService = propietarioService;
    }
    @PostMapping
    public Propietario createPropietario(@RequestBody Propietario propietario){
        return this.propietarioService.editPropietario(propietario);
    }
    @GetMapping
    public List<Propietario> listarPropietarios(){
        return this.propietarioService.listarPropietarios();
    }
    @PutMapping
    public Propietario updatePropietario(@RequestBody Propietario propietario){
        return this.propietarioService.editPropietario(propietario);
    }
    @DeleteMapping
    public void deleteMascota(@RequestParam(name = "id") Long id){
        this.propietarioService.deletePropietario(id);
    }
}
