package br.com.mili.milibackend.gfd.application.dto.gfdDocumento;

import br.com.mili.milibackend.fornecedor.domain.entity.Fornecedor;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class GfdDocumentoUpdateInputDto {

    @NotNull
    private Integer id;

    @NotNull
    private LocalDate dataEmissao;

    private LocalDate dataValidade;

    @NotNull
    private String status;

    private String observacao;

}
