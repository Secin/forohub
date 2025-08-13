package anaya.forohub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    @Query("SELECT t FROM Topico t WHERE YEAR(t.fecha) = :anio")
    Page<Topico> findByAnio(@Param("anio") int anio, Pageable pageable);

    @Query("SELECT t FROM Topico t WHERE curso= :curso")
    Page<Topico> findbyCurso(@Param("curso") Curso curso, Pageable pageable);
}
