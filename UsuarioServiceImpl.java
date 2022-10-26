package pe.edu.upc.youngWorker.serviceimpls;
import pe.edu.upc.youngWorker.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.youngWorker.repositories.IUsuarioRepository;
import pe.edu.upc.youngWorker.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public void insertar(Usuario usuario){
        uR.save(usuario);

    }
    @Override
    public List<Usuario> list(){
        return uR.findAll();

    }
    @Override
    public void delete(int idUsuario){
        uR.deleteById(idUsuario);

    }

    @Override
    public List<Usuario> search(String nombreEstudiante){
        return uR.buscarNombre(nombreEstudiante);

    }



}
