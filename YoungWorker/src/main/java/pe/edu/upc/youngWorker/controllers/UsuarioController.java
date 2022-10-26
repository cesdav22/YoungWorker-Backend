package pe.edu.upc.youngWorker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.youngWorker.entities.Usuario;
import pe.edu.upc.youngWorker.serviceinterfaces.IUsuarioService;

import java.util.List;
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uService;

    @PostMapping
    public void registrar(@RequestBody Usuario u) {
        uService.insertar(u);
    }
    @GetMapping
    public List<Usuario> listar() {
        return uService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        uService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Usuario u){uService.insertar(u);}
    @PostMapping("/buscar")
    public List<Usuario>buscar(@RequestBody Usuario u){
        return uService.search(u.getNameUsuario());
    }

}
