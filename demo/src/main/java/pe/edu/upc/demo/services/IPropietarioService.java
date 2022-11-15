package pe.edu.upc.demo.services;

import pe.edu.upc.demo.entities.Propietario;

import java.util.List;
import java.util.Optional;

public interface IPropietarioService {
    public void insertar(Propietario propietario);
    List<Propietario> listar();

    public void eliminar(int idPropietario);

    public Optional<Propietario> listarId(int idPropietario);

    List<Propietario> buscarNombre(String namePropietario);

    List<Propietario> buscarEmail(String correo);

    List<Propietario> buscarDominio(); // MOSTRARA DIRECTAMENTE

}
