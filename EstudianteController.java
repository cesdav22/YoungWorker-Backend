package pe.edu.upc.youngWorker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.youngWorker.entities.Estudiante;
import pe.edu.upc.youngWorker.serviceinterfaces.IEstudianteService;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private IEstudianteService eService;

    @PostMapping
    public void registrar(@RequestBody Estudiante e) {
        eService.insertar(e);
    }

    @GetMapping
    public List<Estudiante> listar() {
        return eService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Estudiante e) {
        eService.insertar(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        eService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Estudiante> buscar(@RequestBody Estudiante e) throws ParseException {

        List<Estudiante> listaEstudiante;
        listaEstudiante = eService.buscarEstudiante(e.getNombreEstudiante());
        if (listaEstudiante.isEmpty()) {
            listaEstudiante = eService.buscarUsuario(e.getUsuario().getNameUsuario());
        }
        return listaEstudiante;
    }
}


