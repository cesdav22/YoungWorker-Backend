package pe.edu.upc.youngWorker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.youngWorker.entities.Beca;

import java.util.List;
@Repository
public interface IBecaRepository extends JpaRepository<Beca,Integer> {
    @Query("from Beca b "+ "where b.beneficioBeca like %:beneficioBeca")
    List<Beca> buscarBeneficio(@Param("beneficioBeca") String beneficioBeca);
}
