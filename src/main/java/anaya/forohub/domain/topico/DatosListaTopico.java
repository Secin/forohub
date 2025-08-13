package anaya.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosListaTopico(
        Long id,
    String titulo,
    String mensaje,
    LocalDateTime fecha,
    Status status,
    String autor,
    Curso curso

    ){
    public DatosListaTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFecha(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso());
    }
}
