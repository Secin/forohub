package anaya.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosDetalleTopico(
        long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha,
        Status status,
        String autor,
        Curso curso
) {

    public DatosDetalleTopico(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFecha(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
