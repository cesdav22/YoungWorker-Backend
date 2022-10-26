package pe.edu.upc.youngWorker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.youngWorker.entities.Usuario;

import java.util.List;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Query("from Usuario u "+ "where u.nameUsuario like %:nameUsuario")
    List<Usuario> buscarNombre(@Param("nameUsuario") String nameUsuario);

}
