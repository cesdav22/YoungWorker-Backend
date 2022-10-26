package pe.edu.upc.youngWorker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.youngWorker.entities.Plan;

import java.util.List;
@Repository
public interface IPlanRepository extends JpaRepository<Plan,Integer> {
    @Query("from Plan p "+ "where p.descripcion like %:descripcion")
    List<Plan> buscarDescripcion(@Param("descripcion") String descripcion);
}
