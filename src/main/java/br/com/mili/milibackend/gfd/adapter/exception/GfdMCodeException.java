package br.com.mili.milibackend.gfd.adapter.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GfdMCodeException {
    GFD_DOCUMENTO_NAO_ENCONTRADO("GFD_DOCUMENTO_NAO_ENCONTRADO", "O documento não foi encontrado"),
    GFD_FORNECEDOR_NAO_ENCONTRADO("GFD_FORNECEDOR_NAO_ENCONTRADO", "Fornecedor não encontrado"),
    GFD_TIPO_DOCUMENTO_FUNCIONARIO_BAD_REQUEST("GFD_TIPO_DOCUMENTO_FUNCIONARIO_BAD_REQUEST", "Tipo de documento não pode ser de fornecedor, quando enviar o funcionário id"),
    GFD_TIPO_DOCUMENTO_NAO_ENCONTRADO("GFD_TIPO_DOCUMENTO__NAO_ENCONTRADO", "Tipo de documento não encontrado"),
    GFD_FUNCIONARIO_SEM_PERMISSAO("GFD_FUNCIONARIO_SEM_PERMISSAO", "Você não tem permissão para realizar essa operação");

    private final String code;
    private final String mensagem;


}
