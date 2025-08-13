package anaya.forohub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
                  LocalDate fecha,
                  Status status,
        @NotBlank String autor,
        @NotNull Curso curso
) {

}
