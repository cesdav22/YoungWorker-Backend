package pe.edu.upc.youngWorker.controllers;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.youngWorker.entities.OfertaEmpleo;
import pe.edu.upc.youngWorker.serviceinterfaces.IOfertaEmpleoService;


@RestController
@RequestMapping("/ofertaEmpleo")
public class OfertaEmpleoController {

    @Autowired
    private IOfertaEmpleoService oService;

    @PostMapping
    public void registrar(@RequestBody OfertaEmpleo o) {
        oService.insertar(o);
    }

    @PutMapping
    public void modificar(@RequestBody OfertaEmpleo o) {
        oService.insertar(o);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        oService.eliminar(id);
    }

    @GetMapping
    public List<OfertaEmpleo> listar() {
        return oService.listar();

    }

    @PostMapping("/buscar")
    public List<OfertaEmpleo> buscar(@RequestBody OfertaEmpleo o) throws ParseException {

        List<OfertaEmpleo> listaOfertaEmpleos;
        listaOfertaEmpleos = oService.buscarEmpleo(o.getInformaEmpleo());
        if (listaOfertaEmpleos.isEmpty()) {

            listaOfertaEmpleos = oService.buscarEncargado(o.getEncargado().getNombreEncargado());
        }
        return listaOfertaEmpleos;

    }
    @GetMapping("/{id}")
    public Optional<OfertaEmpleo> listarId(@PathVariable("id") Integer id) {
        return oService.listarId(id);
    }
}

