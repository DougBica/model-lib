package br.com.sysve.dtos;

import br.com.sysve.entities.ProdutoTransacao;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProdutoDto {

    private Long id;
    private String nome;
    private BigDecimal quantidadeEmbalagem;
    private BigDecimal valorVenda;
    private Long codigoBarra;
    private String caminhoImagem;
    private Boolean ativo;
}
