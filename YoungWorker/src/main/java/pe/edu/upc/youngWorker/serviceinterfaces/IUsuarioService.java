package pe.edu.upc.youngWorker.serviceinterfaces;
import pe.edu.upc.youngWorker.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insertar(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);
    List<Usuario>search(String nameUsuario);

}
