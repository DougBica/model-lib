package br.com.sysve.dtos;

import br.com.sysve.converter.annotations.ConverterReferenceEntity;
import br.com.sysve.entities.Produto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@ConverterReferenceEntity(Produto.class)
public class ProdutoDto {

    private Long id;
    private UUID uuid;

    private String nomeProduto;
    private BigDecimal quantidadeEmbalagem;
    private BigDecimal valorVenda;
    private Long codigoBarra;
    private String caminhoImagem;
    private Boolean ativo;

}
