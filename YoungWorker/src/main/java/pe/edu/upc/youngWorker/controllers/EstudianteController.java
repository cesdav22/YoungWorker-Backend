package pe.edu.upc.youngWorker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.youngWorker.entities.Estudiante;
import pe.edu.upc.youngWorker.serviceinterfaces.IEstudianteService;

import java.util.List;
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
        return eService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        eService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Estudiante e){eService.insertar(e);}
    @PostMapping("/buscar")
    public List<Estudiante>buscar(@RequestBody Estudiante e){
        return eService.search(e.getNombreEstudiante());
    }
}
