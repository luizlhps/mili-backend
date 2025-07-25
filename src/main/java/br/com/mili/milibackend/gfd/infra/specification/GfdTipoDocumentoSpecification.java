package br.com.mili.milibackend.gfd.infra.specification;

import br.com.mili.milibackend.gfd.domain.entity.GfdTipoDocumento;
import br.com.mili.milibackend.gfd.domain.entity.GfdTipoDocumentoTipoEnum;
import org.springframework.data.jpa.domain.Specification;

public class GfdTipoDocumentoSpecification {
    public static Specification<GfdTipoDocumento> filtroTipo(GfdTipoDocumentoTipoEnum tipo) {
        return (root, query, cb) -> {
            if (tipo == null) return null;
            return cb.equal(root.get("tipo"), tipo);
        };
    }

    public static Specification<GfdTipoDocumento> filtroAtivo(Boolean ativo) {
        return (root, query, cb) -> {
            if (ativo == null) return null;
            return cb.equal(root.get("ativo"), ativo);
        };
    }
}
