package pe.edu.upc.youngWorker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.youngWorker.entities.Plan;
import pe.edu.upc.youngWorker.serviceinterfaces.IPlanService;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlanController {
    @Autowired
    private IPlanService pService;

    @PostMapping
    public void registrar(@RequestBody Plan p) {
        pService.insertar(p);
    }
    @GetMapping
    public List<Plan> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Plan p){pService.insertar(p);}
    @PostMapping("/buscar")
    public List<Plan>buscar(@RequestBody Plan p){
        return pService.search(p.getDescripcion());
    }
}
