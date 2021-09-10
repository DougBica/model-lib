package br.com.sysve.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="produto")
@Data
public class Produto extends CadastroGenerico{
	private String nome;
	private BigDecimal quantidadeEmbalagem;
	private BigDecimal valorVenda;
	private Long codigoBarra;
	private String caminhoImagem;

    @OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
    private List<ProdutoTransacao> produtoTransacao;

}
