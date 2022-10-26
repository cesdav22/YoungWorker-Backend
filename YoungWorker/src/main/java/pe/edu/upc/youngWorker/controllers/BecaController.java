package pe.edu.upc.youngWorker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.youngWorker.entities.Beca;
import pe.edu.upc.youngWorker.serviceinterfaces.IBecaService;

import java.util.List;

@RestController
@RequestMapping("/becas")
public class BecaController {
    @Autowired
    private IBecaService bService;

    @PostMapping
    public void registrar(@RequestBody Beca b) {
        bService.insertar(b);
    }
    @GetMapping
    public List<Beca> listar() {
        return bService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        bService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Beca b){bService.insertar(b);}
    @PostMapping("/buscar")
    public List<Beca>buscar(@RequestBody Beca b){
        return bService.search(b.getBeneficioBeca());
    }
}
